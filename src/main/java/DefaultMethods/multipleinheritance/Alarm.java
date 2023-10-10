package DefaultMethods.multipleinheritance;

public interface Alarm {
    default String turnAlarmOn(){
        return "Turning on the alarm";
    }
    default String turnAlarmOff(){
        return"Turning off the alarm";
    }
}
