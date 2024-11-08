package org.firstinspires.ftc.teamcode.ROBOT.SUBSYSTEMS;

import com.arcrobotics.ftclib.command.SubsystemBase;
import com.arcrobotics.ftclib.drivebase.MecanumDrive;
import com.arcrobotics.ftclib.hardware.motors.MotorEx;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.pedroPathing.follower.Follower;

public class DrivetrainSUB extends SubsystemBase {

    public MotorEx FRMotor;
    public MotorEx FLMotor;
    public MotorEx BRMotor;
    public MotorEx BLMotor;

    public MecanumDrive SigmaDrive;

    public Follower follower;

    public DrivetrainSUB(HardwareMap hmap) {
        this.FRMotor=new MotorEx(hmap,"FRMotor");
        this.FLMotor=new MotorEx(hmap,"FLMotor");
        this.BRMotor=new MotorEx(hmap,"BRMotor");
        this.BLMotor=new MotorEx(hmap,"BLMotor");

        SigmaDrive = new MecanumDrive(FRMotor, FLMotor, BRMotor, BLMotor);
    }


    public void SigmaDrive(double x, double y, double z){
        SigmaDrive.driveRobotCentric(x, y, z);
    }
}