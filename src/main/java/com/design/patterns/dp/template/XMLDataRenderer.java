package com.design.patterns.dp.template;

public class XMLDataRenderer extends DataRenderer {
    @Override
    public String readData() {
        System.out.println("reading XML data");
        return "XML Data";
    }

    @Override
    public String processData(String data) {
        System.out.println("Processing XML Data");
        return data+";";
    }
}
