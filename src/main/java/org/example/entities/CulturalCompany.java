package org.example.entities;

import org.example.validations.CompanyValidation;
import org.example.validations.CulturalCompanyValidation;

public class CulturalCompany extends Company{

    private String ong;

    private String mission;

    private String contactPhone;

    private String contactEmail;

    private CulturalCompanyValidation culturalCompanyValidation = new CulturalCompanyValidation();

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
    public Double collect(Double pay) {
        try {
            this.culturalCompanyValidation.costvalidation(pay);
            Double discount=pay-(pay*0.10);
            return (discount+(discount*0.19));
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            return 0D;
        }
    }
}
