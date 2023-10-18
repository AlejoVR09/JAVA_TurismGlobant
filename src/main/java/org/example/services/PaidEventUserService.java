package org.example.services;


import org.example.Utilities.ServiceHelper;
import org.example.datamodels.PaidEventUserModel;
import org.example.entities.PaidEventUser;

import java.util.HashMap;
import java.util.List;

public class PaidEventUserService {
    private ServiceHelper serviceHelper = new ServiceHelper();
    public void registerPaidEventUser(PaidEventUser paidEventUser){
        HashMap params = new HashMap<String, String>();
        params.put("className", "PaidEventUser");
        params.put("operationType", "create");
        serviceHelper.createService(paidEventUser).setupService(params);
    }

    public void deletePaidEventUser(Integer id){
        HashMap params = new HashMap<String, String>();
        params.put("className", "PaidEventUser");
        params.put("operationType", "delete");
        params.put("id", Integer.toString(id));
        serviceHelper.createService().setupService(params);
    }

    public List<PaidEventUserModel> searchPaidEventUsers(){
        HashMap params = new HashMap<String, String>();
        params.put("className", "PaidEventUser");
        params.put("operationType", "list");
        return (List<PaidEventUserModel>) serviceHelper.createService().setupService(params);
    }
}
