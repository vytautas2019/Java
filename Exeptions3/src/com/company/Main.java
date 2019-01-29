package com.company;
//Sukurkite klasę Device. Klasė turi klasės kintamuosius - isOn, kuris reiškia ar įrenginys yra įjungtas, ir id, kuris yra unikalus įrenginio numeris (nustatomas sukuriant objektą).
//        Sukurkite keletą įrenginių, kurie paveldės Device klasę.
//        Sukurkite exception klasę DeviceIsOffException.
//        Klasėje Device sukurkite metodą 'ping', kuris patikrina ar įrenginys yra įjungtas. Jei įrenginys išjungtas, turi būti sukelta išimtis 'DeviceIsOffException'.
//        Sukurti klasę Monitoring su metodu pingAllDevices, kuris priima sąrašą įrenginių ir juos tikrina kviesdamas ping metodą tikrina ar įrenginys yra įjungtas. Patikrinimo rezultatą išveda į ekraną.
//        Atskiroje klasėje su main metodu sukurkite keletą įrenginių ir juos monitorinkite. Tada vieną iš įrenginių išjunkite ir vėl monitorinkite.
//        Tokios veiksmų sekos
//
//public static void main(String[] args) {
//
//        Monitoring monitoring = new Monitoring();
//
//        List<Device> devices = new ArrayList<>();
//        devices.add(new Mouse(true));
//        devices.add(new Display(true));
//        devices.add(new Keyboard(true));
//        devices.add(new Mouse(true));
//        devices.add(new Display(true));
//        devices.add(new Keyboard(true));
//
//        monitoring.pingAllDevices(devices);
//        devices.get(3).setOn(false);
//        monitoring.pingAllDevices(devices);
//        }
//        rezultatas galėtų būti toks:
//
//        -----Pinging started-----
//        Device Mouse with id 0 is ON
//        Device Display with id 1 is ON
//        Device Keyboard with id 2 is ON
//        Device Mouse with id 3 is ON
//        Device Display with id 4 is ON
//        Device Keyboard with id 5 is ON
//        -----Pinging finished----
//
//        -----Pinging started-----
//        Device Mouse with id 0 is ON
//        Device Display with id 1 is ON
//        Device Keyboard with id 2 is ON
//        Device Mouse with id 3 is OFF.
//        Device Display with id 4 is ON
//        Device Keyboard with id 5 is ON
//        -----Pinging finished----

public class Main {

    public static void main(String[] args) {
        Device c1= new Device(true,11);
        Device c2= new Device(true,22);
        Monitoring monitoring = new Monitoring();

        List<Device> devices = new ArrayList<>();
        devices.add(new Mouse(true));
        devices.add(new Display(true));
        devices.add(new Keyboard(true));
        devices.add(new Mouse(true));
        devices.add(new Display(true));
        devices.add(new Keyboard(true));

        monitoring.pingAllDevices(devices);
        devices.get(3).setOn(false);
        monitoring.pingAllDevices(devices);
    }
}
