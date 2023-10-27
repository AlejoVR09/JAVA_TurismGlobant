package org.example.entities;

import org.example.validations.ReserveValidation;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Reservation {
    private Integer id;
    private Integer users;
    private Integer idOfert;
    private Double totalCost;
    private LocalDate reserveDate;

    private ReserveValidation reserveValidation=new ReserveValidation();
    public Reservation() {

    }

    public Reservation(Integer id, Integer users, Integer idOfert, Double totalCost, LocalDate reserveDate) {
        this.id = id;
        this.users = users;
        this.idOfert = idOfert;
        this.totalCost = totalCost;
        this.reserveDate = reserveDate;
    }

    @Override
    public String toString() {
        return "Reserve{" +
                "id=" + id +
                ", idUser=" + users +
                ", idOfert=" + idOfert +
                ", totalCost=" + totalCost +
                ", reserveDate=" + reserveDate +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUsers() {
        return users;
    }

    public void setUsers(Integer users) {
        try{
            this.reserveValidation.peoplevalidation(users);
            this.users = users;
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public Integer getIdOfert() {
        return idOfert;
    }

    public void setIdOfert(Integer idOfert) {
        this.idOfert = idOfert;
    }

    public Double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(Double totalCost) {
        this.totalCost = totalCost;
    }

    public LocalDate getReserveDate() {
        return reserveDate;
    }

    public void setReserveDate(String reserveDate) {
        try{
            this.reserveValidation.datevalidation(reserveDate);
            DateTimeFormatter formatter= DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate date=LocalDate.parse(reserveDate,formatter);
            this.reserveDate =date;
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }


}
