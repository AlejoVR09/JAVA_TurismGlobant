package org.example.datamodels;

public class CulturalCompanyModel extends CompanyModel {
    public CulturalCompanyModel() {
    }

    public static CulturalCompanyModel createCulturalCompanyModel() {
        return new CulturalCompanyModel();
    }

    public CulturalCompanyModel(Integer id, String nit, String names, Integer ubication, String description) {
        super(id, nit, names, ubication, description);
    }
}
