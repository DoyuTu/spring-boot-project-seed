package com.doyutu.springbootseedproject.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.NoArgsConstructor;

import java.lang.reflect.Type;

/**
 * @author DoyuTu
 * @version 0.0.1
 * spring-boot-seed-project
 */
@NoArgsConstructor
public class GsonUtil {

    private static final Gson GSON = new GsonBuilder()
            .serializeNulls()
            .setPrettyPrinting()
            .create();

    public static String toJson(Object obj) {
        return GSON.toJson(obj);
    }

    public static <T> T fromJson(String str, Class<T> cls) {
        return GSON.fromJson(str, cls);
    }

    public static <T> T fromJson(String str, Type typeOfT) {
        return GSON.fromJson(str, typeOfT);
    }

}
