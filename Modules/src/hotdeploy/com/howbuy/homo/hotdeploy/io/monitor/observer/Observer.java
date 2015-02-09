package com.howbuy.homo.hotdeploy.io.monitor.observer;

import com.howbuy.homo.hotdeploy.io.monitor.observable.Observable;



/**
 * 文件变动监听器.
 * @author li.zhang
 * 2014-9-5
 *
 */
public interface Observer
{
    /**
     * 被观察的对象有变动的时候，会触发观察者的update()方法.
     * @param obj 被观察的对象.
     * @param arg 参数
     */
    void update(Observable obj, Object arg);
}
