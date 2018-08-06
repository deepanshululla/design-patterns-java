package SolidConcepts.DependencyInversion.Processes;

public class SmartphoneManufacturingProcess extends GeneralManufacturingProcess {
    public SmartphoneManufacturingProcess(String processName) {
        super(processName);
    }

    @Override
    protected void assembleDevice() {
        System.out.println("Assmebled smartphone");
    }

    @Override
    protected void testDevice() {
        System.out.println("tested smartphone");
    }

    @Override
    protected void packageDevice() {
        System.out.println("packaged smartphone");
    }

    @Override
    protected void storeDevice() {
        System.out.println("stored smartphone");
    }
}
