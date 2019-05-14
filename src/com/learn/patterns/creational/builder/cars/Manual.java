package com.learn.patterns.creational.builder.cars;

import com.learn.patterns.creational.builder.builders.CarSpecificBuilder;
import com.learn.patterns.creational.builder.components.Engine;
import com.learn.patterns.creational.builder.components.GPSNavigator;
import com.learn.patterns.creational.builder.components.Transmission;
import com.learn.patterns.creational.builder.components.TripComputer;

public class Manual {

    private final Type type;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final TripComputer tripComputer;
    private final GPSNavigator gpsNavigator;

    private Manual(Type type, int seats, Engine engine, Transmission transmission,
                   TripComputer tripComputer, GPSNavigator gpsNavigator) {
        this.type = type;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
        this.gpsNavigator = gpsNavigator;
    }

    public String print() {
        String info = "";
        info += "Type of car: " + type + "\n";
        info += "Count of seats: " + seats + "\n";
        info += "Engine: volume - " + engine.getVolume() + "; mileage - " + engine.getMileage() + "\n";
        info += "Transmission: " + transmission + "\n";
        if (this.tripComputer != null) {
            info += "Trip Computer: Functional" + "\n";
        } else {
            info += "Trip Computer: N/A" + "\n";
        }
        if (this.gpsNavigator != null) {
            info += "GPS Navigator: Functional" + "\n";
        } else {
            info += "GPS Navigator: N/A" + "\n";
        }
        return info;
    }

    public static class ManualBuilder implements CarSpecificBuilder {

        private Type type;
        private int seats;
        private Engine engine;
        private Transmission transmission;
        private TripComputer tripComputer;
        private GPSNavigator gpsNavigator;

        @Override
        public ManualBuilder setType(Type type) {
            this.type = type;
            return this;
        }

        @Override
        public ManualBuilder setSeats(int seats) {
            this.seats = seats;
            return this;
        }

        @Override
        public ManualBuilder setEngine(Engine engine) {
            this.engine = engine;
            return this;
        }

        @Override
        public ManualBuilder setTransmission(Transmission transmission) {
            this.transmission = transmission;
            return this;
        }

        @Override
        public ManualBuilder setTripComputer(TripComputer tripComputer) {
            this.tripComputer = tripComputer;
            return this;
        }

        @Override
        public ManualBuilder setGpsNavigator(GPSNavigator gpsNavigator) {
            this.gpsNavigator = gpsNavigator;
            return this;
        }

        public Manual build() {
            return new Manual(type, seats, engine, transmission, tripComputer, gpsNavigator);
        }
    }
}
