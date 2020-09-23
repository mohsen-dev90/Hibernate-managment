package Entity;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "person")

public class Person extends BaseEntity implements Serializable {


    private String firstName;
    private String lastName;

    @Temporal(TemporalType.DATE)
    private Date dateOfBirth;

    @ManyToOne
    @JoinColumn(name = "managerId")
    private Person manager;

    @ManyToOne
    @JoinTable(name = "role")
    @JoinColumn(name = "roleId")
    private Role role;

    @OneToMany
    @JoinTable(name = "personReciverEmail",
    joinColumns = @JoinColumn(name = "personId"),
    inverseJoinColumns = @JoinColumn(name = "emailId") )
    private List<Email> emails;



    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Entity.person getManager() {
        return manager;
    }

    public void setManager(Entity.Person manager) {
        this.manager = manager;
    }

    public Entity.Role getRole() {
        return role;
    }

    public void setRole(Entity.Role role) {
        this.role = role;
    }

    public List<Entity.Email> getEmails() {
        return emails;
    }

    public void setEmails(List<Entity.Email> emails) {
        this.emails = emails;
    }
}
