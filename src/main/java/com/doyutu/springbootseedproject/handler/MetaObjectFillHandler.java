package com.doyutu.springbootseedproject.handler;

import com.baomidou.mybatisplus.mapper.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author DoyuTu
 * @version 0.0.1
 * spring-boot-seed-project
 */
public class MetaObjectFillHandler extends MetaObjectHandler {
    @Override
    public void insertFill(MetaObject metaObject) {
        System.out.println("*************************");
        System.out.println("insert fill");
        System.out.println("*************************");
        Map<String, Object> mapParams = new HashMap<>(8);
        mapParams.put("logicDelete", "0");
        mapParams.put("gmtCreate", new Date());
        mapParams.put("gmtUpdate", new Date());
        forEachSetValue(metaObject, mapParams);
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        System.out.println("*************************");
        System.out.println("update fill");
        System.out.println("*************************");
        Map<String, Object> mapParams = new HashMap<>(8);
        mapParams.put("gmtUpdate", new Date());
        mapParams.entrySet().parallelStream().forEach((k) -> setFieldValByName(k.getKey(), k.getValue(), metaObject));

    }

    private void forEachSetValue(MetaObject metaObject, Map<String, Object> mapParams) {
        mapParams.entrySet().parallelStream().forEach((k) -> {
            Object fieldValByName = getFieldValByName(k.getKey(), metaObject);
            if (fieldValByName == null) {
                setFieldValByName(k.getKey(), k.getValue(), metaObject);
            }
        });
    }
}
