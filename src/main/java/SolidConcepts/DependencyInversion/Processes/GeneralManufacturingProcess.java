package SolidConcepts.DependencyInversion.Processes;

public abstract class GeneralManufacturingProcess {
    private String processName;

    public GeneralManufacturingProcess(String processName) {
        this.processName = processName;
    }

    protected abstract void assembleDevice();
    protected abstract void testDevice();
    protected abstract void packageDevice();
    protected abstract void storeDevice();

    //template method
    public void launchProcess(){
        if (processName!=null && !processName.isEmpty()){
            assembleDevice();
            testDevice();
            packageDevice();
            storeDevice();
        } else {
            System.out.println("No process name is defnied for this");
        }

    }
}
