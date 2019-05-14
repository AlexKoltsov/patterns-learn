package com.learn.patterns.creational.builder.cars;

import com.learn.patterns.creational.builder.builders.CarSpecificBuilder;
import com.learn.patterns.creational.builder.components.Engine;
import com.learn.patterns.creational.builder.components.GPSNavigator;
import com.learn.patterns.creational.builder.components.Transmission;
import com.learn.patterns.creational.builder.components.TripComputer;

public class Car {

    private final Type type;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final TripComputer tripComputer;
    private final GPSNavigator gpsNavigator;
    private double fuel;

    private Car(Type type, int seats, Engine engine, Transmission transmission,
                TripComputer tripComputer, GPSNavigator gpsNavigator, double fuel) {
        this.type = type;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
        this.gpsNavigator = gpsNavigator;
        this.fuel = fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public Type getType() {
        return type;
    }

    public int getSeats() {
        return seats;
    }

    public Engine getEngine() {
        return engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public TripComputer getTripComputer() {
        return tripComputer;
    }

    public GPSNavigator getGpsNavigator() {
        return gpsNavigator;
    }

    public double getFuel() {
        return fuel;
    }

    public static class CarBuilder implements CarSpecificBuilder {

        private Type type;
        private int seats;
        private Engine engine;
        private Transmission transmission;
        private TripComputer tripComputer;
        private GPSNavigator gpsNavigator;
        private double fuel = 0;

        @Override
        public CarBuilder setType(Type type) {
            this.type = type;
            return this;
        }

        @Override
        public CarBuilder setSeats(int seats) {
            this.seats = seats;
            return this;
        }

        @Override
        public CarBuilder setEngine(Engine engine) {
            this.engine = engine;
            return this;
        }

        @Override
        public CarBuilder setTransmission(Transmission transmission) {
            this.transmission = transmission;
            return this;
        }

        @Override
        public CarBuilder setTripComputer(TripComputer tripComputer) {
            this.tripComputer = tripComputer;
            return this;
        }

        @Override
        public CarBuilder setGpsNavigator(GPSNavigator gpsNavigator) {
            this.gpsNavigator = gpsNavigator;
            return this;
        }

        public CarBuilder setFuel(double fuel) {
            this.fuel = fuel;
            return this;
        }

        public Car build() {
            return new Car(type, seats, engine, transmission, tripComputer, gpsNavigator, fuel);
        }
    }
}
