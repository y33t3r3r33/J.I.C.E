package org.firstinspires.ftc.teamcode.ROBOT.SUBSYSTEMS;

import com.arcrobotics.ftclib.command.SubsystemBase;
import com.arcrobotics.ftclib.controller.PIDController;
import com.arcrobotics.ftclib.hardware.motors.MotorEx;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class ArmSUB extends SubsystemBase {

    public MotorEx Arm;

    public PIDController PID = new PIDController(0., 0, 0.001);

    public ArmSUB(HardwareMap hmap) {
        this.Arm = new MotorEx(hmap, "Arm");
    }



    }

