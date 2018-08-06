package SolidConcepts.DependencyInversion.clients;

import SolidConcepts.DependencyInversion.Processes.GeneralManufacturingProcess;
import SolidConcepts.DependencyInversion.Processes.SmartphoneManufacturingProcess;

public class DeviceFactory {
    public static void main(String[] args) {
        GeneralManufacturingProcess smartphoneManufacturingProcess=new SmartphoneManufacturingProcess("Apple");
        smartphoneManufacturingProcess.launchProcess();
    }
}
