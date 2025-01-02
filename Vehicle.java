abstract class Vehicle {
    public String brand;
    public String model;

    public Vehicle(String brand, String model){
        this.brand = brand;
        this.model = model;
    }

    public abstract void start();
    public abstract void stop();

    public String getBrand(){
        return brand;
    }
    public String getModel(){
        return model;
    }
    public void setBrand(String newBrand){
        brand = newBrand;
    }

    public String toStrung(){
        return "Бренд: " + brand + ", Модель: " + model;
    }
}
