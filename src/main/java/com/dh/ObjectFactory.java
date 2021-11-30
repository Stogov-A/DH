package com.dh;

import lombok.SneakyThrows;

import java.util.HashMap;
import java.util.Map;

public class ObjectFactory {
    private static ObjectFactory ourInstance = new ObjectFactory();
    private Config config;

    public static ObjectFactory getInstance(){
        return ourInstance;
    }

    private ObjectFactory(){
        config = new JavaConfig("com.dh", new HashMap<>(Map.of(Policeman.class, PolicemanImpl.class)));
    }

    @SneakyThrows
    public <T> T createObject(Class<T> type){
        Class<? extends T>implClass = type;
        if (type.isInterface()){
            implClass = config.getImplClass(type);
        }
        T t = implClass.getDeclaredConstructor().newInstance();

        return t;
    }
}

