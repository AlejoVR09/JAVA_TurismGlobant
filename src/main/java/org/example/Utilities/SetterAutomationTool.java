package org.example.Utilities;

import org.example.datamodels.AffiliatedUserModel;
import org.example.datamodels.CulturalCompanyModel;
import org.example.datamodels.PaidEventUserModel;

import org.example.datamodels.PrivateCompanyModel;
import org.example.entities.AffiliatedUser;
import org.example.entities.CulturalCompany;
import org.example.entities.PaidEventUser;
import org.example.entities.PrivateCompany;

import java.beans.PropertyDescriptor;
import java.util.List;

public class SetterAutomationTool {
    public void updateObjectProperties(List<String> listOfFields, AffiliatedUser classInstance, AffiliatedUserModel modelInstance) {
        for (String fieldName : listOfFields) {
            // THIS EXECUTES OBJECT SETTERS AND GETTERS
            try {
                PropertyDescriptor affiliatedUserPropertyDescriptor = new PropertyDescriptor(fieldName, classInstance.getClass());
                System.out.println(fieldName);
                //Object getterValue = affiliatedUserPropertyDescriptor
                  //      .getReadMethod()
                    //    .invoke(classInstance)
                      //  .toString();

                PropertyDescriptor affiliatedUserModelPropertyDescriptor = new PropertyDescriptor(fieldName, modelInstance.getClass());
                affiliatedUserModelPropertyDescriptor
                        .getWriteMethod()
                        .invoke(modelInstance, affiliatedUserPropertyDescriptor.getReadMethod().invoke(classInstance));

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void updateObjectProperties(List<String> listOfFields, CulturalCompany classInstance, CulturalCompanyModel modelInstance) {
        for (String fieldName : listOfFields) {
            // THIS EXECUTES OBJECT SETTERS AND GETTERS
            try {
                PropertyDescriptor affiliatedUserPropertyDescriptor = new PropertyDescriptor(fieldName, classInstance.getClass());
                String getterValue = affiliatedUserPropertyDescriptor
                        .getReadMethod()
                        .invoke(classInstance)
                        .toString();
                PropertyDescriptor affiliatedUserModelPropertyDescriptor = new PropertyDescriptor(fieldName, modelInstance.getClass());
                affiliatedUserModelPropertyDescriptor
                        .getWriteMethod()
                        .invoke(modelInstance, getterValue);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void updateObjectProperties(List<String> listOfFields, PrivateCompany classInstance, PrivateCompanyModel modelInstance) {
        for (String fieldName : listOfFields) {
            // THIS EXECUTES OBJECT SETTERS AND GETTERS
            try {
                PropertyDescriptor affiliatedUserPropertyDescriptor = new PropertyDescriptor(fieldName, classInstance.getClass());
                String getterValue = affiliatedUserPropertyDescriptor
                        .getReadMethod()
                        .invoke(classInstance)
                        .toString();
                PropertyDescriptor affiliatedUserModelPropertyDescriptor = new PropertyDescriptor(fieldName, modelInstance.getClass());
                affiliatedUserModelPropertyDescriptor
                        .getWriteMethod()
                        .invoke(modelInstance, getterValue);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void updateObjectProperties(List<String> listOfFields, PaidEventUser classInstance, PaidEventUserModel modelInstance) {
        for (String fieldName : listOfFields) {
            // THIS EXECUTES OBJECT SETTERS AND GETTERS
            try {
                PropertyDescriptor affiliatedUserPropertyDescriptor = new PropertyDescriptor(fieldName, classInstance.getClass());
                System.out.println(fieldName);
                PropertyDescriptor affiliatedUserModelPropertyDescriptor = new PropertyDescriptor(fieldName, modelInstance.getClass());
                affiliatedUserModelPropertyDescriptor
                        .getWriteMethod()
                        .invoke(modelInstance, affiliatedUserPropertyDescriptor.getReadMethod().invoke(classInstance));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
