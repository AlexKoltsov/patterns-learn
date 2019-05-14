package com.learn.patterns.creational.builder.builders;

import com.learn.patterns.creational.builder.cars.Type;
import com.learn.patterns.creational.builder.components.Engine;
import com.learn.patterns.creational.builder.components.GPSNavigator;
import com.learn.patterns.creational.builder.components.Transmission;
import com.learn.patterns.creational.builder.components.TripComputer;

public interface CarSpecificBuilder {

    CarSpecificBuilder setType(Type type);

    CarSpecificBuilder setSeats(int seats);

    CarSpecificBuilder setEngine(Engine engine);

    CarSpecificBuilder setTransmission(Transmission transmission);

    CarSpecificBuilder setTripComputer(TripComputer tripComputer);

    CarSpecificBuilder setGpsNavigator(GPSNavigator gpsNavigator);
}
