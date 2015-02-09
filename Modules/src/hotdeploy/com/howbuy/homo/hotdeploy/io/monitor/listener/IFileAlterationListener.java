package com.howbuy.homo.hotdeploy.io.monitor.listener;

import java.io.File;

/**
 * 文件变动监听器.
 * @author li.zhang
 * 2014-9-5
 *
 */
public interface IFileAlterationListener
{
    /**
     * 当目录dir被创建的时候触发.
     * @param dir dir
     */
    public abstract void onDirectoryCreate(File dir);
    
    /**
     * 当该目录下有变动的情况下被触发.
     * @param dir dir
     */
    public abstract void onDirectoryChange(File dir);
    
    /**
     * 当该目录被删除的情况下被触发.
     * @param dir dir
     */
    public abstract void onDirectoryDelete(File dir);
    
    /**
     * 当文件被创建的时候被触发.
     * @param file file
     */
    public abstract void onFileCreate(File file);
    
    /**
     * 当文件有变动的时候被触发
     * @param file file
     */
    public abstract void onFileChange(File file);
    
    /**
     * 当文件被删除的时候被触发.
     * @param file file
     */
    public abstract void onFileDelete(File file);
}
