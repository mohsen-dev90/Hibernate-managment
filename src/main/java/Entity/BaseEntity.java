package Entity;

import javax.persistence.*;

@Entity
@Table(name = "baseentity")
public class BaseEntity {

    @Id
    @GeneratedValue
    private Long id;
    private boolean active;
    private Long manualId;
    private String modify;

    public boolean equals(Object o){
        if (this == o ) return  true;
        if (o == null || getClass() != o.getClass()) return false;

        BaseEntity entity = (BaseEntity) o ;

        return id == entity.id;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Long getManualId() {
        return manualId;
    }

    public void setManualId(Long manualId) {
        this.manualId = manualId;
    }

    public String getModify() {
        return modify;
    }

    public void setModify(String modify) {
        this.modify = modify;
    }
}