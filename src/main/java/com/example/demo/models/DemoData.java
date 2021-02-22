package com.example.demo.models;

public class DemoData {
    private static DemoData instance = null;

    public static DemoData getInstance() {
        if (instance == null) {
            instance = new DemoData();
        }
        return instance;
    }

//    cara manggilnya DemoData data = DemoData.getInstance(); kita gak perlu mendeklarasikan DemoData data = new DemoData();
}
