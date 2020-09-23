package Entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "email")
public class Email extends BaseEntity{

    @OneToMany
    @JoinTable(name = "personReciverEmail",
    joinColumns = @JoinColumn(name = "emailId"),
    inverseJoinColumns = @JoinColumn(name = "personId") )
    private List<Person> receiver;

    @ManyToOne
    @JoinTable(name = "person")
    @JoinColumn(name = "senderId")
    private Person sender;

    private String subject;



}
