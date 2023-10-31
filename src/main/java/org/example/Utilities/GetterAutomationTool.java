package org.example.Utilities;

import java.lang.reflect.Method;

public class GetterAutomationTool {


    public Boolean getValues(Object object) throws Exception {
        Method[] methods = object.getClass().getMethods();

        for (Method method : methods) {
            if (method.getName().contains("get")) {
                if (!method.getName().equals("getId")){
                    if (method.invoke(object) == null) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public Boolean getValuesWithOutReferred(Object object) throws Exception {
        Method[] methods = object.getClass().getMethods();

        for (Method method : methods) {
            if (method.getName().contains("get")) {
                if (!method.getName().equals("getId") && !method.getName().equals("getReferredId") && !method.getName().equals("getEndDay") && !method.getName().equals("getStartDay")){
                    if (method.invoke(object) == null) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
