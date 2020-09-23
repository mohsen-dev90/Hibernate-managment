package daoImpl;

import Entity.Person;
import hibernate.util.HibernateUtil;
import managment.Dao.PersonDao;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.QueryException;
import org.hibernate.query.Query;

public class PersonDaoImp implements PersonDao {
    public void savePerson(Person person) {
        Session session = HibernateUtil.getSession().getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(person);
        transaction.commit();
        session.close();
    }

    public List<Person> showAllPerson() {
        List<Person> personList = new ArrayList();
        Session session = HibernateUtil.getSession().getSessionFactory().openSession();
        Query query = session.createQuery("From Person ");
        personList = query.list();


        return query.list();
    }

    public void updatePerson(int id, String firstName, String lastName,String role) {
        Session session = HibernateUtil.getSession().getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Person person = (Person)session.load(Person.class,id);
        person.setFirstName(firstName);
        person.setLastName(lastName);
        person.setRole(person.getRole());
        session.update(person);
        transaction.commit();
        session.close();
    }

    public void deletePerson(Person person) {
        Session session = HibernateUtil.getSession().getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(person);
        transaction.commit();
        session.close();

    }
}
