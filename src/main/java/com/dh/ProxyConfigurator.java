package com.dh;

public interface ProxyConfigurator {
    Object replaceProxyIfNeeded(Object t, Class implClass);
}
