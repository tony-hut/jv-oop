package core.basesyntax;

import java.security.spec.ECField;

public class MainApp {
    public static void main(String[] args) {
        Machine bulldozer = new Bulldozer();
        Machine truck = new Truck();
        Machine excavator = new Excavator();

        Machine[]machines = {truck,bulldozer,excavator};
        for (Machine machine:machines) {
            machine.doWork();
            machine.stopWork();
        }
    }



}
