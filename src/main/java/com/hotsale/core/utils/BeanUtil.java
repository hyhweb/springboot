package com.hotsale.core.utils;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class BeanUtil {

    public static Map<String, Object> beanTtoMap(Object obj) {

        if(obj == null){
            return null;
        }
        Map<String, Object> map = new HashMap<String, Object>();
        try {
            BeanInfo beanInfo = Introspector.getBeanInfo(obj.getClass());
            PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
            for (PropertyDescriptor property : propertyDescriptors) {
                String key = property.getName();

                if (!key.equals("class")) {
                    // 得到property对应的getter方法
                    Method getter = property.getReadMethod();
                    if(getter!=null){
                        Object value = getter.invoke(obj);
                        map.put(key, value);
                    }

                }

            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return map;

    }

    public static Object mapToBean(Map<String, Object> map, Class<?> beanClass)  {
        if (map == null)
            return null;

        try{
            Object obj = beanClass.newInstance();

            BeanInfo beanInfo = Introspector.getBeanInfo(obj.getClass());
            PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
            for (PropertyDescriptor property : propertyDescriptors) {
                Method setter = property.getWriteMethod();
                if (setter != null) {
                    setter.invoke(obj, map.get(property.getName()));
                }
            }

            return obj;
        }catch (Exception e){
            throw  new RuntimeException(e);
        }
    }

    /**
     * bean拼接参数值
     * @param model
     * @return
     * @throws Exception
     */
    public static String joinToBean(Object model) throws Exception{
        if(model==null)
            return null;
        StringBuffer stringBuffer = new StringBuffer();
        for (Field field : model.getClass().getDeclaredFields()) {
            field.setAccessible(true);
            if(field.get(model) != null){
                stringBuffer.append(field.getName()+"="+field.get(model)+"&");
            }
        }
        if(stringBuffer.length()>1)
            stringBuffer.deleteCharAt(stringBuffer.length() - 1);
        return stringBuffer.toString();
    }

    /**
     * 实体反射
     * @param model
     * @return
     * @throws Exception
     */
    public static String beanToString(Object model){
        try{
            StringBuffer stringBuffer = new StringBuffer();
            for (Field field : model.getClass().getDeclaredFields()) {
                field.setAccessible(true);
                if(field.get(model) != null){
                    stringBuffer.append(field.get(model));
                }
            }
            return stringBuffer.toString();
        }catch (Exception e){
            e.printStackTrace();
            throw new RuntimeException(e);
        }

    }
}
