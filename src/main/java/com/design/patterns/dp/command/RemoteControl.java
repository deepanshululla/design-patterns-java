package com.design.patterns.dp.command;

/*
This is the invoker class
 */
public class RemoteControl {
    private Command command;

    public void pressButton(){
        command.execute();
    }

    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }
}
