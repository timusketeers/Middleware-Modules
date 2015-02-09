/***********************************************************************
 * Module:  IStorageFacade.java
 * Author:  li.zhang
 * Purpose: Defines the Interface IStorageFacade
 ***********************************************************************/
package com.howbuy.homo.storage;

/** 
 * 存储外观类接口
 * @author li.zhang
 */
public interface IStorageFacade
{
    /**
     * 存储对象
     * @param obj 要存储的对象
     * @return 返回存储索引storageIndex
     */
    String save(Object obj) throws Exception;

    /**
     * 查询存储的对象
     * @param storageIndex 存储索引
     * @return 返回存储的对象
     */
    Object query(String storageIndex);

}