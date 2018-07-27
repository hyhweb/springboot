package com.hotsale.core.cache.impl;


import com.hotsale.core.cache.CodeCache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

//import com.yunliuchain.yunbandan.common.config.YunBanDanProperties;

@Service
public class CodeCacheImpl implements CodeCache {

    @Autowired
    private RedisTemplate<String,String> redisTemplate;

 /*   @Autowired
    private YunBanDanProperties yunBanDanProperties;

    @Override
    public void set(String key, String value) {
        set(key,value,yunBanDanProperties.getCodeTimeout());
    }*/


    @Override
    public void set(String key, String value, int timeout) {
        redisTemplate.opsForValue().set(key,value,timeout, TimeUnit.SECONDS);
    }

    @Override
    public String get(String key) {
        return  redisTemplate.opsForValue().get(key);
    }

    @Override
    public void remove(String key) {
        redisTemplate.delete(key);
    }
}
