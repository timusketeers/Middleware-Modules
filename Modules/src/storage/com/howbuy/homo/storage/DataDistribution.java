/***********************************************************************
 * Module:  DataDistribution.java
 * Author:  li.zhang
 * Purpose: Defines the Class DataDistribution
 ***********************************************************************/
package com.howbuy.homo.storage;

/**
 * 封装数据分布信息的实体
 * @author li.zhang
 */
public class DataDistribution
{
    /**
     * pageNo，即页编号的规则是1001001-1001008共八个作为内存中的页编号.
     * 2001001向上递增为磁盘上的页编号.
     * 1001可以认为是内存设备的标识，
     * 2001可以认为是物理磁盘的标识.
     */
    private String pageNo;
    
    /** 页内偏移量  **/
    private int pageOffset;
    
    /** 数据长度 **/
    private int length;

    public String getPageNo()
    {
        return pageNo;
    }

    public void setPageNo(String pageNo)
    {
        this.pageNo = pageNo;
    }

    public int getPageOffset()
    {
        return pageOffset;
    }

    public void setPageOffset(int pageOffset)
    {
        this.pageOffset = pageOffset;
    }

    public int getLength()
    {
        return length;
    }

    public void setLength(int length)
    {
        this.length = length;
    }
}