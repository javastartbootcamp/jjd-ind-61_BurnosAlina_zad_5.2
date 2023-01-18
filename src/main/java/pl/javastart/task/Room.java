package pl.javastart.task;

public class Room {
    private int squareMeters;
    private double temperature;
    private boolean airConditioner;
    private double limitTemperature;

    Room(int squareMeters, double temperature, boolean airConditioner, double limitTemperature) {
        this.squareMeters = squareMeters;
        this.temperature = temperature;
        this.airConditioner = airConditioner;
        this.limitTemperature = limitTemperature;
    }

    boolean lowerTemperature() {
        if (airConditioner) {
            if (temperature >= limitTemperature + 1) {
                temperature -= 1;
                return true;
            } else if (temperature == limitTemperature) {
                return false;
            } else {
                temperature = limitTemperature;
                return true;
            }
        }
        return false;
    }

    int getSquareMeters() {
        return squareMeters;
    }

    void setSquareMeters(int squareMeters) {
        this.squareMeters = squareMeters;
    }

    double getTemperature() {
        return temperature;
    }

    void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    boolean isAirConditioner() {
        return airConditioner;
    }

    void setAirConditioner(boolean airConditioner) {
        this.airConditioner = airConditioner;
    }

    double getLimitTemperature() {
        return limitTemperature;
    }

    void setLimitTemperature(double limitTemperature) {
        this.limitTemperature = limitTemperature;
    }
}
