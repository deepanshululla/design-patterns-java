package com.design.patterns.dp.command;

public class OffCommand implements Command{
    Television television;

    public OffCommand(Television television) {
        this.television = television;
    }

    @Override
    public void execute() {
        television.off();
    }
}
