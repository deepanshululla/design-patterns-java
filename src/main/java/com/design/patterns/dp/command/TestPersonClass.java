package com.design.patterns.dp.command;

public class TestPersonClass {
    public static void main(String[] args) {
        Television television=new Television();
        RemoteControl remoteControl=new RemoteControl();
        OnCommand onCommand=new OnCommand(television);
        remoteControl.setCommand(onCommand);
        remoteControl.pressButton();

    }
}
