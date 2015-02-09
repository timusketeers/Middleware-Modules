package com.howbuy.homo.hotdeploy.io.monitor.observable;

import java.util.Vector;

import com.howbuy.homo.hotdeploy.io.monitor.observer.Observer;

/**
 * 实现这个接口表示一个要被观察的对象.
 * @author li.zhang
 * 2014-9-10
 *
 */
public abstract class Observable
{
    /** 标示当前对象是否发生变化. **/
    private boolean changed;
    
    /** 观察者集合. **/
    private Vector<Observer> observers;
    
    /**
     * 默认构造方法
     */
    public Observable()
    {
        observers = new Vector<Observer>();
    }
    
    /**
     * 添加观察者.
     * @param obs 观察者
     */
    public void addObserver(Observer obs)
    {
        if (observers.contains(obs))
        {
            return;
        }
        
        observers.add(obs);
    }
    
    /**
     * 删除观察者.
     * @param obs 观察者
     */
    public void deleteObserver(Observer obs)
    {
        observers.remove(obs);
    }
    
    /**
     * 通知所有观察者.
     * @param arg 传递给观察者的参数.
     */
    public synchronized void notifyObservers(Object arg)
    {
        //如果被观察的对象没有发生变化，不需要通知观察者.
        if (!this.changed)
        {
            return;
        }
        
        if (null == observers || observers.isEmpty())
        {
            return;
        }
        
        for (int index = 0; index < observers.size(); index++)
        {
            Observer obs = observers.get(index);
            obs.update(this, arg);
        }
        
        clearChanged();
    }
    
    /**
     * 设置被观察的对象是否发生变化.
     */
    protected synchronized void setChanged()
    {
        changed = true;
    }
    
    /**
     * 重置被观察的对象的状态为没有发生变化.
     */
    protected synchronized void clearChanged() 
    {
        changed = false;
    }
}
