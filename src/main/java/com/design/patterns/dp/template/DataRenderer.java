package com.design.patterns.dp.template;

public abstract class DataRenderer {
    public void render(){
        String readData=readData();
        String processData=processData(readData);
        System.out.println(processData);
    }
    public abstract String readData();
    public abstract String processData(String data);

}
