package org.firstinspires.ftc.teamcode.ROBOT.SUBSYSTEMS;

import com.arcrobotics.ftclib.command.SubsystemBase;
import com.arcrobotics.ftclib.controller.PIDController;
import com.arcrobotics.ftclib.hardware.motors.MotorEx;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class IntakeSUB extends SubsystemBase {

    public CRServo Intake;
    public MotorEx ArmEXT;

    public PIDController PIDEXT = new PIDController(0.001, 0, 0);

    public IntakeSUB(HardwareMap hmap) {
        Intake = hmap.get(CRServo.class, "Intake");
        this.ArmEXT = new MotorEx(hmap, "ArmEXT");

    }

    public void intakeToggleOut(){
        this.Intake.setPower(1);
    }
    public void intakeToggleOn() {
        this.Intake.setPower(-1);
    }

    public void SetArmEXT(double wantedPos) {
        double value = PIDEXT.calculate(wantedPos, this.ArmEXT.getCurrentPosition());
        this.ArmEXT.set(value);
    }

    public void GoArmEXT(double wantedPose){
        this.ArmEXT.set(PIDEXT.calculate(wantedPose,this.ArmEXT.getCurrentPosition()));
    }
    public void setExtensionPower(double power){
        this.ArmEXT.set(power);
    }


    public double Encoder() {
        return this.ArmEXT.getCurrentPosition();
    }
}
