package pl.academy.code.services;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.academy.code.model.Bmi;

import java.util.List;

@Component
public class BmiService implements IBmiService {

    @Autowired
    HibernateSessionFactoryService hsfs;

    public void saveBmi(Bmi bmi) {
        Session session = hsfs.getSession();
        Transaction tx = session.beginTransaction();
        session.save(bmi);
        tx.commit();
        session.close();
    }

    public void updateBmi(Bmi bmi) {
        Session session = hsfs.getSession();
        Transaction tx = session.beginTransaction();
        session.update(bmi);
        tx.commit();
        session.close();
    }

    public Bmi getBmiById(int id) {
        Session session = this.hsfs.getSession();
        Bmi bmi = (Bmi) session
                .createQuery("FROM pl.academy.code.model.Bmi WHERE id = " + id)
                .uniqueResult();
        session.close();
        return bmi;
    }

    public List<Bmi> getAllBmiRecords() {
        Session session = this.hsfs.getSession();
        List<Bmi> bmi = session
                .createQuery("FROM pl.academy.code.model.Bmi")
                .list();
        session.close();
        return bmi;
    }
}
