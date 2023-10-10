package DefaultMethods.multipleinheritance;

public class Car implements Alarm, Vehicle{

    // Approach no : 1
    /*@Override
    public String turnAlarmOn(){
        return "Alarm is on";
    }*/

    /*@Override
    public String turnAlarmOff(){
        return "Alarm is off";
    }*/

    // Approach No :2

    public String turnAlarmOn(){
       return Vehicle.super.turnAlarmOn();
    }

    public String turnAlarmOff(){
        return Alarm.super.turnAlarmOff();
    }

    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car.turnAlarmOn());
        System.out.println(car.turnAlarmOff());



    }
}
