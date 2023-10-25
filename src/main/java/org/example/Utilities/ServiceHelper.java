package org.example.Utilities;

import com.mysql.cj.util.StringUtils;
import jakarta.persistence.Persistence;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import org.example.datamodels.AffiliatedUserModel;
import org.example.datamodels.CulturalCompanyModel;
import org.example.datamodels.PaidEventUserModel;
import org.example.datamodels.PrivateCompanyModel;
import org.example.entities.AffiliatedUser;
import org.example.entities.CulturalCompany;
import org.example.entities.PaidEventUser;
import org.example.entities.PrivateCompany;
import org.hibernate.property.access.spi.Setter;

import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;

public class ServiceHelper<T> {
    private EntityManagerFactory entityManagerFactory = null;
    private EntityManager entityManager = null;
    private AffiliatedUser affiliatedUser;
    private CulturalCompany culturalCompany;
    private PaidEventUser paidEventUser;
    private PrivateCompany privateCompany;
    private List<T> dataToReturn = null;
    private final SetterAutomationTool automationTool = new SetterAutomationTool();

    public ServiceHelper() {
    }

    public List<T> setupService(Map<String, String> props) {
        try {
            entityManagerFactory = Persistence.createEntityManagerFactory(Constants.getPersistanceConfiguration());
            entityManager = entityManagerFactory.createEntityManager();
            entityManager.getTransaction().begin();
            String entityClassName = props.get("className");
            switch (entityClassName) {
                case "AffiliatedUser":
                    AffiliatedUserLogic(props);
                    break;
                case "CulturalCompany":
                    CulturalCompanyLogic(props);
                    break;
                case "PrivateCompany":
                    PrivateCompanyLogic(props);
                    break;
                case "PaidEventUser":
                    PaidEventUserLogic(props);
                    break;
            }
        } catch (Exception error) {
            System.out.println("Error " + error.getMessage());
        } finally {
            if (entityManager != null) {
                entityManager.close();
            }
            if (entityManagerFactory != null) {
                entityManagerFactory.close();
            }
        }
        System.out.println(dataToReturn);
        return dataToReturn;
    }

    public void AffiliatedUserLogic(Map<String, String> props) {
        switch (props.get("operationType")) {
            case "create":
                AffiliatedUserModel affiliatedUserModel = new AffiliatedUserModel();
                automationTool.updateObjectProperties(Constants.getListOfAcceptedAffiliatedUserFields(), affiliatedUser, affiliatedUserModel);
                entityManager.persist(affiliatedUserModel);
                entityManager.getTransaction().commit();
                System.out.println("Transaction success");
                break;
            case "delete":
                entityManager.remove(entityManager.find(AffiliatedUserModel.class, Integer.parseInt(props.get("id"))));
                entityManager.getTransaction().commit();
                break;
            default:
                String JPQLQuery = "SELECT af FROM AffiliatedUserModel af";
                List<AffiliatedUserModel> affiliatedUsers = entityManager.createQuery(JPQLQuery, AffiliatedUserModel.class).getResultList();
                dataToReturn = (List<T>) affiliatedUsers;
                break;
        }
    }

    public void CulturalCompanyLogic(Map<String, String> props) {
        switch (props.get("operationType")) {
            case "create":
                CulturalCompanyModel culturalCompanyModel = new CulturalCompanyModel();
                automationTool.updateObjectProperties(Constants.getListOfAcceptedCulturalCompanyFields(), culturalCompany, culturalCompanyModel);
                entityManager.persist(culturalCompanyModel);
                entityManager.getTransaction().commit();
                System.out.println("Transaction success");
                break;
            case "delete":
                entityManager.remove(entityManager.find(CulturalCompanyModel.class, Integer.parseInt(props.get("id"))));
                entityManager.getTransaction().commit();
                break;
            default:
                String JPQLQuery = "SELECT af FROM CulturalCompanyModel af";
                List<CulturalCompanyModel> culturalCompanies = entityManager.createQuery(JPQLQuery, CulturalCompanyModel.class).getResultList();
                dataToReturn = (List<T>) culturalCompanies;
                break;
        }
    }

    public void PrivateCompanyLogic(Map<String, String> props) {
        switch (props.get("operationType")) {
            case "create":
                PrivateCompanyModel privateCompanyModel = new PrivateCompanyModel();
                automationTool.updateObjectProperties(Constants.getListOfAcceptedPrivateCompanyFields(), privateCompany, privateCompanyModel);
                entityManager.persist(privateCompanyModel);
                entityManager.getTransaction().commit();
                System.out.println("Transaction success");
                break;
            case "delete":
                entityManager.remove(entityManager.find(PrivateCompanyModel.class, Integer.parseInt(props.get("id"))));
                entityManager.getTransaction().commit();
                break;
            default:
                String JPQLQuery = "SELECT af FROM PrivateCompanyModel af";
                List<PrivateCompanyModel> culturalCompanies = entityManager.createQuery(JPQLQuery, PrivateCompanyModel.class).getResultList();
                dataToReturn = (List<T>) culturalCompanies;
                break;
        }
    }

    public void PaidEventUserLogic(Map<String, String> props) {
        switch (props.get("operationType")) {
            case "create":
                PaidEventUserModel paidEventUserModel = new PaidEventUserModel();
                automationTool.updateObjectProperties(Constants.getListOfAcceptedPaidEventUserFields(), paidEventUser, paidEventUserModel);

                // GETTERS AND SETTERS
                // paidEventUserModel.setNames(paidEventUser.getNames());
                // paidEventUserModel.setDocument(paidEventUser.getDocument());
                // paidEventUserModel.setEmail(paidEventUser.getEmail());
                // paidEventUserModel.setUbication(paidEventUser.getUbication());
                entityManager.persist(paidEventUserModel);
                entityManager.getTransaction().commit();
                System.out.println("Transaction success");
                break;
            case "delete":
                entityManager.remove(entityManager.find(PaidEventUserModel.class, Integer.parseInt(props.get("id"))));
                entityManager.getTransaction().commit();
                break;
            default:
                String JPQLQuery = "SELECT af FROM PaidEventUserModel af";
                List<PaidEventUserModel> paidUsers = entityManager.createQuery(JPQLQuery, PaidEventUserModel.class).getResultList();
                dataToReturn = (List<T>) paidUsers;
                break;
        }
    }

    private ServiceHelper createInstance() {
        ServiceHelper newInstance = new ServiceHelper();
        return newInstance;
    }

    public ServiceHelper createService() {
        return new ServiceHelper();
    }
    public ServiceHelper createService(AffiliatedUser userModel) {
        ServiceHelper newInstance = createInstance();
        newInstance.affiliatedUser = userModel;
        return newInstance;
    }
    public ServiceHelper createService(CulturalCompany culturalCompanyModel) {
        ServiceHelper newInstance = createInstance();
        newInstance.culturalCompany = culturalCompanyModel;
        return newInstance;
    }
    public ServiceHelper createService(PrivateCompany privateCompanyModel) {
        ServiceHelper newInstance = createInstance();
        newInstance.privateCompany = privateCompanyModel;
        return newInstance;
    }
    public ServiceHelper createService(PaidEventUser paidEventUserModel) {
        ServiceHelper newInstance = createInstance();
        newInstance.paidEventUser = paidEventUserModel;
        return newInstance;
    }
}
