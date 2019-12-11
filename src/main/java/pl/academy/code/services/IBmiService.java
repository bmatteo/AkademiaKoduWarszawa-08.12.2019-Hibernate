package pl.academy.code.services;

import pl.academy.code.model.Bmi;

import java.util.List;

public interface IBmiService {
    public void saveBmi(Bmi bmi);
    public void updateBmi(Bmi bmi);
    public Bmi getBmiById(int id);
    public List<Bmi> getAllBmiRecords();
}
