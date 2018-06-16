package com.design.patterns.dp.singleton;

import java.io.Serializable;
/*
Multithreading safe, deserialization safe,non clonable logger singleton implementation
 */

public class Logger implements Cloneable,Serializable {

    private static volatile Logger logger;
    private Logger(){ }
    public void log(String msg){
        System.out.println(msg);
    }
    protected Object readResolve(){
        return logger;
    }
    public static Logger getLogger(){
        if(logger==null){
            synchronized (Logger.class){
                if(logger==null){
                    logger=new Logger();

                }
            }
        }
        return logger;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

}
