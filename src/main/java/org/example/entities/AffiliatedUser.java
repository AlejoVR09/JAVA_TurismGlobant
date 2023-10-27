package org.example.entities;

import org.example.validations.AffiliatedUserValidation;

import java.time.LocalDate;

public class AffiliatedUser extends User {
    private Double monthlyCost;

    private String referredId;

    private LocalDate startDay;

    private LocalDate endDay;

    private AffiliatedUserValidation affiliatedUserValidation = new AffiliatedUserValidation();

    public AffiliatedUser() {

    }

    public AffiliatedUser(Integer id, String document, String names, String email, Integer ubication, Double monthlyCost, String referredId) {
        super(id, document, names, email, ubication);
        this.monthlyCost = monthlyCost;
        this.referredId = referredId;
    }

    public Double getMonthlyCost() {
        return monthlyCost;
    }

    public void setMonthlyCost(Double monthlyCost) {
        try{
            this.affiliatedUserValidation.validateCost(monthlyCost, 100000D);
            this.monthlyCost = monthlyCost;
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public String getReferredId() {
        return referredId;
    }

    public void setReferredId(String referredId) {
        try{
            this.affiliatedUserValidation.docvalidation(referredId);
            this.referredId = referredId;
            this.startDay = LocalDate.now();
            this.endDay = LocalDate.ofYearDay(startDay.getYear(), startDay.getDayOfYear()+5);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public LocalDate getStartDay() {
        return startDay;
    }

    public void setStartDay(LocalDate startDay) {
        this.startDay = startDay;
    }

    public LocalDate getEndDay() {
        return endDay;
    }

    public void setEndDay(LocalDate endDay) {
        this.endDay = endDay;
    }

    public static AffiliatedUser createAffiliatedUser() {
        return new AffiliatedUser();
    }

    public Boolean validateGuestTime(){
        if (this.startDay.isAfter(endDay)){
            return true;
        }
        return false;

    }

}
