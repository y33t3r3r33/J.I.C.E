package org.firstinspires.ftc.teamcode.ROBOT.SUBSYSTEMS;

import com.arcrobotics.ftclib.command.SubsystemBase;
import com.arcrobotics.ftclib.controller.PIDController;
import com.arcrobotics.ftclib.hardware.motors.MotorEx;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class ArmEXTSUB extends SubsystemBase {

    public MotorEx ArmEXT;

    public PIDController PIDEXT = new PIDController(0.001, 0, 0);

    public ArmEXTSUB(HardwareMap hmap) {
        this.ArmEXT = new MotorEx(hmap, "ArmEXT");
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
