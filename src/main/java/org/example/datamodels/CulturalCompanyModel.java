package org.example.datamodels;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class CulturalCompanyModel extends CompanyModel {
    //@Column(name = "a")
    public CulturalCompanyModel() {
    }

    public static CulturalCompanyModel createCulturalCompanyModel() {
        return new CulturalCompanyModel();
    }

    public CulturalCompanyModel(Integer id, String nit, String names, Integer ubication, String description) {
        super(id, nit, names, ubication, description);
    }
}
