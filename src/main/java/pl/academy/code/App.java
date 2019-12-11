package pl.academy.code;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.academy.code.configuratin.AppConfiguration;
import pl.academy.code.model.Bmi;
import pl.academy.code.model.Sex;
import pl.academy.code.services.BmiService;
import pl.academy.code.services.IBmiService;

import java.util.List;

public class App {
    public static void main(String[] args) {
        Bmi jakisRekord = new Bmi();
        jakisRekord.setWeight(80);
        jakisRekord.setHeight(185);
        jakisRekord.setSex(Sex.MEN);
        jakisRekord.setBmi(25.55);

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfiguration.class);

        IBmiService bmiService = context.getBean(IBmiService.class);

        bmiService.saveBmi(jakisRekord);

        System.out.println(bmiService.getBmiById(1));

        List<Bmi> bmiList = bmiService.getAllBmiRecords();
        for (Bmi bmi : bmiList) {
            System.out.println(bmi);
        }
    }
}
