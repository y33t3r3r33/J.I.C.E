package org.firstinspires.ftc.teamcode.ROBOT.SUBSYSTEMS;

import com.arcrobotics.ftclib.command.SubsystemBase;
import com.arcrobotics.ftclib.controller.PIDController;
import com.arcrobotics.ftclib.hardware.motors.MotorEx;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class ArmSUB extends SubsystemBase {

    public MotorEx ArmEXT;
    public MotorEx ArmANG;

    public PIDController PIDEXT = new PIDController(0.001, 0, 0);
    public PIDController PIDANG = new PIDController(0.001, 0, 0);

    public ArmSUB(HardwareMap hmap) {
        this.ArmEXT = new MotorEx(hmap, "ArmEXT");
        this.ArmANG = new MotorEx(hmap, "ArmANG");
    }

    public void SetArmEXT(double wantedPos) {
        double value = PIDEXT.calculate(wantedPos, this.ArmEXT.getCurrentPosition());
        this.ArmEXT.set(value);
    }
}

