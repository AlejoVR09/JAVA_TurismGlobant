package org.example.services;

import org.example.Utilities.ServiceHelper;
import org.example.entities.CulturalCompany;
import org.example.datamodels.CulturalCompanyModel;

import java.util.HashMap;
import java.util.List;

public class CulturalCompanyService {
    private ServiceHelper serviceHelper = new ServiceHelper();
    public void registerCulturalCompany(CulturalCompany culturalCompanyModel){
        HashMap params = new HashMap<String, String>();
        params.put("className", "CulturalCompany");
        params.put("operationType", "create");
        serviceHelper.createService(culturalCompanyModel).setupService(params);
    }

    public void deleteCulturalCompany(Integer id){
        HashMap params = new HashMap<String, String>();
        params.put("className", "CulturalCompany");
        params.put("operationType", "delete");
        params.put("id", Integer.toString(id));
        serviceHelper.createService().setupService(params);
    }

    public List<CulturalCompanyModel> searchCulturalCompanies(){
        HashMap params = new HashMap<String, String>();
        params.put("className", "CulturalCompany");
        params.put("operationType", "list");
        return (List<CulturalCompanyModel>) serviceHelper.createService().setupService(params);
    }
}
