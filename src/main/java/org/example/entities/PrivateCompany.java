package org.example.entities;

public class PrivateCompany extends Company {
    private String agentId;
    private String agentName;

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
    public Double collect() {
        return null;
    }


}
