package org.firstinspires.ftc.teamcode.ROBOT.SUBSYSTEMS;

import com.arcrobotics.ftclib.command.SubsystemBase;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class IntakeSUB extends SubsystemBase {

    public CRServo Intake;

    public IntakeSUB(HardwareMap hmap) {
        Intake = hmap.get(CRServo.class, "Intake");

    }

    public void Intake(double power){
        Intake.setPower(power);
    }
}
