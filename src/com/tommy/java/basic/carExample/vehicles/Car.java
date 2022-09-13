package com.tommy.java.basic.carExample.vehicles;


import com.tommy.java.basic.carExample.details.*;
import com.tommy.java.basic.carExample.professions.*;

public class Car {
    private String producer;
    private String aClass;
    private double weight;
    private Driver driver;
    private Engine engine;

    /*public Car(String producer, String aClass, double weight, Driver driver, Engine engine) {
        this.producer = producer;
        this.aClass = aClass;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
    }*/

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getaClass() {
        return aClass;
    }

    public void setaClass(String aClass) {
        this.aClass = aClass;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        System.out.println("Поехали");
    }

    public void stop() {
        System.out.println("Останавливаемся");
    }

    public void turnRight() {
        System.out.println("Поворот направо");
    }

    public void turnLeft() {
        System.out.println("Поворот налево");
    }

    public void turnOnHeadlights() { System.out.println("Вмикати фари"); }
    public void ofTheHeadlights()  { System.out.println("Вимикати фари"); }
    public void turnSignals() { System.out.println("Сигнал поворота");}
    public void backlights() { System.out.println("Підсвітка");}
    public void openingClosingTrunk() {System.out.println("Відкриття та закриття багажнику");}
    public void witchingRidingModes() {System.out.println("Перемикання режимів їзди");}

    @Override
    public String toString() {
        return "Car{" +
                "producer='" + producer + '\'' +
                ", aClass='" + aClass + '\'' +
                ", weight=" + weight +
                ", driver=" + driver +
                ", engine=" + engine +
                '}';
    }
}