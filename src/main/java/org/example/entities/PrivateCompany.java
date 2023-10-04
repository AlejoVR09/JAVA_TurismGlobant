package org.example.entities;

public class PrivateCompany extends Company {
    private String agentId;
    private String agentNamel;

    public PrivateCompany() {

    }

    public PrivateCompany(Integer id, String nit, String names, Integer ubication, String description, String agentId, String agentNamel) {
        super(id, nit, names, ubication, description);
        this.agentId = agentId;
        this.agentNamel = agentNamel;
    }

    public String getAgentId() {
        return agentId;
    }

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    public String getAgentNamel() {
        return agentNamel;
    }

    public void setAgentNamel(String agentNamel) {
        this.agentNamel = agentNamel;
    }

    @Override
    public Double collect() {
        return null;
    }


}
