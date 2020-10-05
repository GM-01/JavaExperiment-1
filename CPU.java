package Experiment1;

public class CPU {
    private int speed;
    private String brand;
    private String name;

    CPU(int speed,String brand) {
        setSpeed(speed);
        setBrand(brand);
    }
    CPU(String name){
        setName(name);
    }

    int getSpeed() {
        return speed;
    }

    String getBrand() {
        return brand;
    }

    String getName() {
        return name;
    }

    void setSpeed(int speed) {
        if (speed > 0 && speed < 10000)
            this.speed = speed;
        else {
            System.out.println("输入的CPU速度有误");
        }
    }

    void setBrand(String brand) {
        this.brand = brand;
    }

    void setName(String name) {
        this.name = name;
    }
}
