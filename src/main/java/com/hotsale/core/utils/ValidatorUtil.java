package com.hotsale.core.utils;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.groups.Default;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


/**
 * 校验工具类
 */
public class ValidatorUtil {

    private static Validator validator = Validation.buildDefaultValidatorFactory().getValidator();

    /** 默认方法验证 */
    public static <T> String validate(T obj){
        Map<String,StringBuffer> errorMap = null;
        Set<ConstraintViolation<T>> set = validator.validate(obj,Default.class);
        if (set != null && set.size() > 0) {
            errorMap = new HashMap<String, StringBuffer>();
            String property = null;
            for (ConstraintViolation<T> cv : set) {
                //这里循环获取错误信息，可以自定义格式
                property = cv.getPropertyPath().toString();
                if (errorMap.get(property) != null) {
                    errorMap.get(property).append("," + cv.getMessage());
                } else {
                    StringBuffer sb = new StringBuffer();
                    sb.append(cv.getMessage());
                    errorMap.put(property, sb);
                }
            }
            StringBuffer stringBuffer = new StringBuffer();
            if (errorMap != null) {
                for (Map.Entry<String, StringBuffer> m : errorMap.entrySet()) {
                    stringBuffer.append(m.getKey() + ":" + m.getValue().toString() + ";");
                }
            }
            return stringBuffer.toString();
        } else {
            return null;
        }
    }

    /**
     * 分组校验
     * @param obj  校验实体
     * @param classes 分组类
     * @return
     */
    public static <T> String validate(T obj,Class<?>... classes) {
        if (classes.length == 0) {
            classes[0] = Default.class;
        }
        Map<String, StringBuffer> errorMap = null;
        Set<ConstraintViolation<T>> set = validator.validate(obj, classes);
        if (set != null && set.size() > 0) {
            errorMap = new HashMap<String, StringBuffer>();
            String property = null;
            for (ConstraintViolation<T> cv : set) {
                //这里循环获取错误信息，可以自定义格式
                property = cv.getPropertyPath().toString();
                if (errorMap.get(property) != null) {
                    errorMap.get(property).append("," + cv.getMessage());
                } else {
                    StringBuffer sb = new StringBuffer();
                    sb.append(cv.getMessage());
                    errorMap.put(property, sb);
                }
            }
            StringBuffer stringBuffer = new StringBuffer();
            if (errorMap != null) {
                for (Map.Entry<String, StringBuffer> m : errorMap.entrySet()) {
                    stringBuffer.append(m.getKey() + ":" + m.getValue().toString() + ";");
                }
            }
            return stringBuffer.toString();
        } else {
            return null;
        }
    }
}
