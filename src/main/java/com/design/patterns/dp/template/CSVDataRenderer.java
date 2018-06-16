package com.design.patterns.dp.template;

public class CSVDataRenderer extends DataRenderer {
    @Override
    public String readData() {
        System.out.println("reading CSV data");
        return "CSV Data";
    }

    @Override
    public String processData(String data) {
        System.out.println("Processing CSV Data");
        return data+";";
    }
}
