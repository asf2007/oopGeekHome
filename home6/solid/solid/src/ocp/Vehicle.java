package ocp;

public abstract class Vehicle {
    int maxSpeed;
    double speedRatio;
    public Vehicle(int maxSpeed, double speedRatio) {
        this.maxSpeed = maxSpeed;
        this.speedRatio =speedRatio;

    }
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    public double getSpeedRatio() {
        return speedRatio;
    }
}
