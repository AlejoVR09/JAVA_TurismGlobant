package org.example.services;


import org.example.Utilities.ServiceHelper;
import org.example.entities.PrivateCompany;
import org.example.datamodels.PrivateCompanyModel;

import java.util.HashMap;
import java.util.List;

public class PrivateCompanyService {
    private ServiceHelper serviceHelper = new ServiceHelper();
    public void registerPrivateCompany(PrivateCompany privateCompany){
        HashMap params = new HashMap<String, String>();
        params.put("className", "PrivateCompany");
        params.put("operationType", "create");
        serviceHelper.createService(privateCompany).setupService(params);
    }

    public void deletePrivateCompany(Integer id){
        HashMap params = new HashMap<String, String>();
        params.put("className", "PrivateCompany");
        params.put("operationType", "delete");
        params.put("id", Integer.toString(id));
        serviceHelper.createService().setupService(params);
    }

    public List<PrivateCompanyModel> searchPrivateCompanies(){
        HashMap params = new HashMap<String, String>();
        params.put("className", "PrivateCompany");
        params.put("operationType", "list");
        return (List<PrivateCompanyModel>) serviceHelper.createService().setupService(params);
    }
}
