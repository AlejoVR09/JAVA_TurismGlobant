package org.example.entities;

import org.example.validations.CompanyValidation;
import org.example.validations.PrivateCompanyValidation;

public class PrivateCompany extends Company {
    private String agentId;
    private String agentName;

    private PrivateCompanyValidation privateCompanyValidation = new PrivateCompanyValidation();

    public PrivateCompany() {

    }

    public PrivateCompany(Integer id, String nit, String names, Integer ubication, String description, String agentId, String agentName) {
        super(id, nit, names, ubication, description);
        this.agentId = agentId;
        this.agentName = agentName;
    }

    public String getAgentId() {
        return agentId;
    }

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    @Override
    public Double collect(Double pay) {
        try {
            this.privateCompanyValidation.costvalidation(pay);
            return pay+(pay*0.19);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            return 0D;
        }
    }


}
