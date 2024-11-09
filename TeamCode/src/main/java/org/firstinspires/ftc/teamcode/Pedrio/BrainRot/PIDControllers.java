package org.firstinspires.ftc.teamcode.Pedrio.BrainRot;

import com.arcrobotics.ftclib.controller.PIDController;

public class PIDControllers {
    //making variables
    private PIDController pidController = new PIDController(0.001,0,0);

    //pid controllers are useful for position and velocity holding
    //we use them to control most subsystems so it's important to have a solid understanding of pid controller


    public double getValue(double setpoint, double measurement){
        return this.pidController.calculate(setpoint,measurement);
        //measurement is the sensor reading and the setpoint is where the motor or servo needs to go
    }

}
