package org.firstinspires.ftc.teamcode.ROBOT.SUBSYSTEMS;

import com.arcrobotics.ftclib.command.SubsystemBase;
import com.arcrobotics.ftclib.hardware.motors.MotorEx;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class ArmSUB extends SubsystemBase {

    public MotorEx Arm;

    public ArmSUB(HardwareMap hmap) {
        this.Arm = new MotorEx(hmap, "Arm");
    }

    }

