package com.learn.patterns.creational.builder;

import com.learn.patterns.creational.builder.builders.CarBuilder;
import com.learn.patterns.creational.builder.builders.CarManualBuilder;
import com.learn.patterns.creational.builder.cars.Car;
import com.learn.patterns.creational.builder.cars.Manual;
import com.learn.patterns.creational.builder.director.Director;

public class BuilderExample {

    public static void main(String[] args) {
        Director director = new Director();

        CarBuilder carBuilder = new CarBuilder();
        director.constructSportsCar(carBuilder);
        Car car = carBuilder.build();
        System.out.println("Cat build: " + car.getType());

        System.out.println();

        CarManualBuilder manualBuilder = new CarManualBuilder();
        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.build();
        System.out.println("Car manual built:\n" + carManual.print());
    }
}
