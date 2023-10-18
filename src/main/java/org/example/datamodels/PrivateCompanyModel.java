package org.example.datamodels;

public class PrivateCompanyModel extends CompanyModel {
    public PrivateCompanyModel() {
    }

    public static PrivateCompanyModel createPrivateCompanyModel() {
        return new PrivateCompanyModel();
    }

    public PrivateCompanyModel(Integer id, String nit, String names, Integer ubication, String description) {
        super(id, nit, names, ubication, description);
    }
}
