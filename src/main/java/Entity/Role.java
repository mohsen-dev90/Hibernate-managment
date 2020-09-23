package Entity;

import javax.persistence.*;


@Entity
@Table(name = "role")
public class Role extends BaseEntity {

    private String roleName;


    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
