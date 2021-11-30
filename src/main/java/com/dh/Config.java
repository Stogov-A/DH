package com.dh;

public interface Config {
    <T> Class<? extends T> getImplClass(Class<T> ifc);
}
