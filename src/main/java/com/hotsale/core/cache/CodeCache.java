package com.hotsale.core.cache;

public interface CodeCache {

  /*  void set(String key, String value);*/
    void set(String key, String value, int timeout);

    String get(String key);

    void remove(String key);
}
