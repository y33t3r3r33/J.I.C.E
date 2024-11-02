package org.firstinspires.ftc.teamcode.ROBOT.SUBSYSTEMS;

import com.arcrobotics.ftclib.command.SubsystemBase;
import com.arcrobotics.ftclib.controller.PIDController;
import com.arcrobotics.ftclib.hardware.motors.MotorEx;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class ArmANGSUB extends SubsystemBase {

    public MotorEx ArmANG;

    public PIDController PIDANG = new PIDController(0.001, 0, 0);

    public ArmANGSUB(HardwareMap hmap) {
        this.ArmANG = new MotorEx(hmap, "ArmANG");
    }


    public void GoPosition(double pose) {
        this.ArmANG.set(PIDANG.calculate(pose,this.ArmANG.getCurrentPosition()));
    }

    public void Power(double power) {
        this.ArmANG.set(power);
    }

    public double Encoder() {
        return this.ArmANG.getCurrentPosition();
    }
}

