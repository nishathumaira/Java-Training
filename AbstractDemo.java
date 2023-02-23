abstract class ElectronicDevice {
    public abstract void turnOn();
}

class MobilePhone extends ElectronicDevice {
    public void turnOn() { // method overriding
        System.out.println("Turning on mobile");

    }
}
class TV extends ElectronicDevice{
    public void turnOn(){
        System.out.println("Turning on TV");
    }
}

class AbstractDemo {
    public static void main(String[] args) {
        //ElectronicDevice ed = new ElectronicDevice(); - this wouldnt work
        MobilePhone phone = new MobilePhone();
        phone.turnOn();

        TV t1 = new TV();
        t1.turnOn();
    }
}