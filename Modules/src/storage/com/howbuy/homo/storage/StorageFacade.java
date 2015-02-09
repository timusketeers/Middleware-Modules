/***********************************************************************
 * Module:  StorageFacade.java
 * Author:  li.zhang
 * Purpose: Defines the Class StorageFacade
 ***********************************************************************/
package com.howbuy.homo.storage;

import com.howbuy.homo.storage.decode.ObjectDecoder;
import com.howbuy.homo.storage.encode.ObjectEncoder;

/**
 * 存储的外观类.
 * @author li.zhang
 */
public class StorageFacade implements IStorageFacade
{
    /** 插件 */
    private final StoragePlugin sbb;

    /**
     * 编码器
     */
    public final ObjectEncoder encoder;
    
    /**
     * 解码器
     */
    public final ObjectDecoder decoder;
    
    /**
     * 构造方法.
     */
    public StorageFacade(StoragePlugin sbb)
    {
        this.sbb = sbb;
        encoder = new ObjectEncoder();
        decoder = new ObjectDecoder();
    }

    /**
     * 存储对象
     * @param obj 要存储的对象
     * @return 返回存储索引
     * @throws Exception 
     */
    public String save(Object obj) throws Exception
    {
        //将obj对象序列化...
        byte[] objBytes = encoder.encode(obj);
        
        return null;
    }

    /**
     * 根据存储索引查询对应的对象.
     * @param storageIndex 存储索引
     * @return 返回存储的对象.
     */
    public Object query(String storageIndex)
    {
        // TODO: implement
        return null;
    }

    public StoragePlugin getSbb()
    {
        return sbb;
    }
}