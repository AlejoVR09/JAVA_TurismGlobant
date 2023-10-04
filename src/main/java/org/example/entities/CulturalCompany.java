package org.example.entities;

public class CulturalCompany extends Company{

    private String ong;

    private String mission;

    private String contactPhone;

    private String contactEmail;

    public CulturalCompany() {

    }

    public CulturalCompany(Integer id, String nit, String names, Integer ubication, String description, String ong, String mission, String contactPhone, String contactEmail) {
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

    @Override
    public Double collect() {
        return null;
    }
}
