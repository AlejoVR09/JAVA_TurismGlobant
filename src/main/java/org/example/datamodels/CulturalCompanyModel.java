package org.example.datamodels;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class CulturalCompanyModel extends CompanyModel {
    @Column(name = "ong")
    private String ong;

    @Column(name = "companymission")
    private String mission;

    @Column(name = "contactophone")
    private String contactPhone;

    @Column(name = "contactemail")
    private String contactEmail;

    public CulturalCompanyModel() {
    }

    public static CulturalCompanyModel createCulturalCompanyModel() {
        return new CulturalCompanyModel();
    }

    public CulturalCompanyModel(Integer id, String nit, String names, Integer ubication, String description, String ong, String mission, String contactPhone, String contactEmail) {
        super(id, nit, names, ubication, description);
        this.ong = ong;
        this.mission = mission;
        this.contactPhone = contactPhone;
        this.contactEmail = contactEmail;
    }

    public String getOng() {
        return ong;
    }

    public void setOng(String ong) {
        this.ong = ong;
    }

    public String getMission() {
        return mission;
    }

    public void setMission(String mission) {
        this.mission = mission;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }
}
