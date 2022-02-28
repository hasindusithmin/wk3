package lk.sample.wk3.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class UserModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String email;
    private String address;
    @OneToOne
    @JoinColumn(name = "vac_id",referencedColumnName = "serialNumber")
    private VacineModel vacId;

    public UserModel() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public VacineModel getVacId() {
        return vacId;
    }

    public void setVacId(VacineModel vacId) {
        this.vacId = vacId;
    }

    @Override
    public String toString() {
        return "UserModel [address=" + address + ", email=" + email + ", id=" + id + ", name=" + name + ", vacId="
                + vacId + "]";
    }

    
    
    
}
