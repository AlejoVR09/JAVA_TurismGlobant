package org.example.Utilities;

import org.example.entities.AffiliatedUser;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class GetterAutomationTool {


    public Boolean getValues(Object object) throws Exception {
        Method[] methods = object.getClass().getMethods();

        for (Method method : methods) {
            if (method.getName().contains("get")) {
                // Do something here
                if (method.getName()!="getId"){
                    if (method.invoke(object) == null) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

//    public Boolean setValues(Object object) throws Exception {
//        Method[] methods = object.getClass().getMethods();
//
//        for (Method method : methods) {
//            if (method.getName().contains("set")) {
//                // Do something here
//
//                if (method.getName()=="setMonthlyCost"){
//                    System.out.println(method.getName());
//                    method.invoke(object, 123D);
//                }
//
////                if (method.getName()!="getId"){
////                    if (method.invoke(object) == null) {
////                        return false;
////                    }
////                }
//            }
//        }
//        return true;
//    }


}
