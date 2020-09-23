package managment.Dao;

import Entity.Person;

import java.util.List;

public interface PersonDao {

    public void savePerson (Person person);
    public List<Person> showAllPerson();
    public void updatePerson (int id , String firstName, String lastName);
    public void deletePerson (Person person);


}
