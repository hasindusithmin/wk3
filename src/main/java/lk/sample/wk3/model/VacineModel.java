package lk.sample.wk3.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "vacine")
public class VacineModel {
    @Id
    private String serialNumber;
    @Enumerated(EnumType.STRING)
    private Dose dose;
    @Enumerated(EnumType.STRING)
    private VacineBrand vacineBrand;
    @OneToOne(mappedBy = "vacId")
    private UserModel userModel;
    public VacineModel() {
    }
    public String getSerialNumber() {
        return serialNumber;
    }
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
    public Dose getDose() {
        return dose;
    }
    public void setDose(Dose dose) {
        this.dose = dose;
    }
    public VacineBrand getVacineBrand() {
        return vacineBrand;
    }
    public void setVacineBrand(VacineBrand vacineBrand) {
        this.vacineBrand = vacineBrand;
    }
    // public UserModel getUserModel() {
    //     return userModel;
    // }
    public void setUserModel(UserModel userModel) {
        this.userModel = userModel;
    }
    
    
}
