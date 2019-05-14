package com.learn.patterns.creational.builder.director;

import com.learn.patterns.creational.builder.builders.CarSpecificBuilder;
import com.learn.patterns.creational.builder.cars.Type;
import com.learn.patterns.creational.builder.components.Engine;
import com.learn.patterns.creational.builder.components.GPSNavigator;
import com.learn.patterns.creational.builder.components.Transmission;
import com.learn.patterns.creational.builder.components.TripComputer;

public class CarDirector {

    public void constructSportsCar(CarSpecificBuilder builder) {
        builder.setType(Type.SPORTS_CAR)
                .setSeats(2)
                .setEngine(new Engine(3.0, 0))
                .setTransmission(Transmission.SEMI_AUTOMATIC)
                .setTripComputer(new TripComputer())
                .setGpsNavigator(new GPSNavigator());
    }

    public void constructCityCar(CarSpecificBuilder builder) {
        builder.setType(Type.CITY_CAR)
                .setSeats(2)
                .setEngine(new Engine(1.2, 0))
                .setTransmission(Transmission.AUTOMATIC)
                .setTripComputer(new TripComputer())
                .setGpsNavigator(new GPSNavigator());
    }

    public void constructSUV(CarSpecificBuilder builder) {
        builder.setType(Type.SUV)
                .setSeats(4)
                .setEngine(new Engine(2.5, 0))
                .setTransmission(Transmission.MANUAL)
                .setGpsNavigator(new GPSNavigator());
    }
}
