/***********************************************************************
 * Module:  ObjectDecoder.java
 * Author:  li.zhang
 * Purpose: Defines the Class ObjectDecoder
 ***********************************************************************/
package com.howbuy.homo.storage.decode;

import java.util.ArrayList;
import java.util.List;

import com.howbuy.homo.storage.encode.ObjectEncoder;
import com.howbuy.homo.storage.encode.TestObject;


/**
 * 目前存在的问题是对象中的成员不能为null,否则会有异常.
 * 
 * 数组[]元素的处理也有些问题.
 * 
 * 解码器
 * @author li.zhang
 */
public class ObjectDecoderTest
{
    public static void main(String[] args) throws Exception
    {
        ObjectDecoder decoder = new ObjectDecoder();
        ObjectEncoder encoder = new ObjectEncoder();
        
        TestObject obj3 = new TestObject();
        obj3.setAge(22);
        obj3.setName("testObj");
        List<String> members = new ArrayList<String>();
        members.add("son");
        members.add("daughter");
        members.add("wife");
        members.add("parent");
        obj3.setMembers(members);
        TestObject rs = (TestObject)decoder.decode(encoder.encode(obj3));
        System.out.println(rs);
    }
}