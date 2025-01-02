public class Ecar extends Vehicle {
    private int battaryLevel;

    public Ecar(String brand, String model){
        super(brand, model);
        battaryLevel = 0;
    }

    public void start(){
        System.out.println("Двигтель Запущен");
    }
    public void stop(){
        System.out.println("Двишатель Выключен");
    }

    public void charge (int percent){
        if((percent > 0) & (battaryLevel + percent <= 100)){
            battaryLevel += percent;
            System.out.println("Батарея заряжена на: " + percent);
        }
        else {
            System.out.println("Перезаряд, Вы не можете зарядить столько: " + percent);
        }
    }
    public void getBattaryLevel(){
        System.out.println("Уровень заряда: " + battaryLevel);
    }
}
