package org.example.datamodels;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class PrivateCompanyModel extends CompanyModel {

    @Column(name = "agentid")
    private String agentId;

    @Column(name = "agentname")
    private String agentName;


    public PrivateCompanyModel() {
    }

    public static PrivateCompanyModel createPrivateCompanyModel() {
        return new PrivateCompanyModel();
    }

    public PrivateCompanyModel(Integer id, String nit, String names, Integer ubication, String description, String agentId, String agentName) {
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
}
