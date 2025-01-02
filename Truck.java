public class Truck extends Vehicle implements Fuelble{
    private int fuellevel;

    public Truck(String brand, String model){
        super(brand,model);
        fuellevel = 0;
    }

    public void start(){
        System.out.println("Двигтель Запущен");
    }
    public void stop(){
        System.out.println("Двишатель Выключен");
    }

    public void refuel(int liters){
        if((liters > 0) & (fuellevel + liters <= 100)){
            fuellevel += liters;
            System.out.println("Автомобиль Заправлен на: " + liters);
        }
        else {
            System.out.println("Переизбыток, Вы не можете заправить столько :" + liters);
        }
    }

    public void getFuelLevel(){
        System.out.println("Уровень Топлиива: " + fuellevel);
    }
}
