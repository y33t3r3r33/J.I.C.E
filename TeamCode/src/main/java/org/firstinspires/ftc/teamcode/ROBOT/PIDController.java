package org.firstinspires.ftc.teamcode.ROBOT;

public class PIDController {
    private double p = 0.001;

    public PIDController(double p) {
        this.p = p;
    }
    public double Calculate(double setpoint, double measurement){
        double error = setpoint - measurement;
        return error * this.p;
    }

}
