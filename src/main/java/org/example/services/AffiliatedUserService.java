package org.example.services;

import org.example.Utilities.ServiceHelper;
import org.example.datamodels.AffiliatedUserModel;
import org.example.entities.AffiliatedUser;

import java.util.HashMap;
import java.util.List;

public class AffiliatedUserService {
    private ServiceHelper serviceHelper = new ServiceHelper();
    public void registerAffiliatedUser(AffiliatedUser userModel){
        HashMap params = new HashMap<String, String>();
        params.put("className", "AffiliatedUser");
        params.put("operationType", "create");
        serviceHelper.createService(userModel).setupService(params);
    }

    public void deleteAffiliatedUser(Integer id){
        HashMap params = new HashMap<String, String>();
        params.put("className", "AffiliatedUser");
        params.put("operationType", "delete");
        params.put("id", Integer.toString(id));
        serviceHelper.createService().setupService(params);
    }

    public List<AffiliatedUserModel> searchAffiliatedUsers(){
        HashMap params = new HashMap<String, String>();
        params.put("className", "AffiliatedUser");
        params.put("operationType", "list");
        return (List<AffiliatedUserModel>) serviceHelper.createService().setupService(params);
    }
}
