/***********************************************************************
 * Module:  CacheItem.java
 * Author:  li.zhang
 * Purpose: Defines the Class CacheItem
 ***********************************************************************/
package com.howbuy.homo.storage;


/**
 * 要缓存的项，即对应一个要要缓存的object
 * @author li.zhang
 */
public class CacheItem
{
    /** 存储项的字节流 **/
    private byte[] data;

    public byte[] getData()
    {
        return data;
    }

    public void setData(byte[] data)
    {
        this.data = data;
    }
}