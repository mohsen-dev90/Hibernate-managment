package Entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "leave")

public class Leave extends BaseEntity {


    private String startDate;
    private String endDate;
    @ManyToOne
    @JoinTable(name = "person")
    @JoinColumn(name = "approverId")
    private Person approver;

    @ManyToOne
    @JoinTable(name = "person")
    @JoinColumn(name = "applicantd")
    private Person applicant;

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public Person getApprover() {
        return approver;
    }

    public void setApprover(Person approver) {
        this.approver = approver;
    }
}
