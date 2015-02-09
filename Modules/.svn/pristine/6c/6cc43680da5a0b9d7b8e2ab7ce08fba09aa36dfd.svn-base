/***********************************************************************
 * Module:  MetaInfo.java
 * Author:  li.zhang
 * Purpose: Defines the Class MetaInfo
 ***********************************************************************/
package com.howbuy.homo.storage;

import java.util.Collections;
import java.util.Map;

/**
 * 元数据信息
 * @author li.zhang
 */
public class MetaInfo
{
    /**
     * key为storageIndex,value为storageIndex对应的对象的数据分布的封装.
     */
    private Map<String, DataDistribution> dataDistributes;

    /**
     * 得到数据分布情况的map
     * @return
     */
    public Map<String, DataDistribution> getDataDistributes()
    {
        return Collections.unmodifiableMap(dataDistributes);
    }
}