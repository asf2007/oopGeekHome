package ocp;

public class SpeedCalculation {
    public SpeedCalculation() {
    }

    public double calculateAllowedSpeed(Vehicle vehicle) {

            return vehicle.getMaxSpeed() * vehicle.speedRatio;

    }
}



