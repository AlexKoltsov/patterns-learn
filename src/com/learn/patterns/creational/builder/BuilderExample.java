package com.learn.patterns.creational.builder;

import com.learn.patterns.creational.builder.cars.Car;
import com.learn.patterns.creational.builder.cars.Manual;
import com.learn.patterns.creational.builder.director.CarDirector;

public class BuilderExample {

    public static void main(String[] args) {
        CarDirector carDirector = new CarDirector();

        Car.CarBuilder carBuilder = new Car.CarBuilder();
        carDirector.constructSportsCar(carBuilder);
        Car car = carBuilder.build();
        System.out.println("Cat build: " + car.getType());

        System.out.println();

        Manual.ManualBuilder manualBuilder = new Manual.ManualBuilder();
        carDirector.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.build();
        System.out.println("Car manual built:\n" + carManual.print());
    }
}
