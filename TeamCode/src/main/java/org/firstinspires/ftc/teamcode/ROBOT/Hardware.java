package org.firstinspires.ftc.teamcode.ROBOT;

import com.arcrobotics.ftclib.hardware.motors.MotorEx;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.ROBOT.SUBSYSTEMS.DrivetrainSUB;

public class Hardware {

    public static Hardware instance = null;
    private HardwareMap hmap;
    public DrivetrainSUB drivetrain;

    public Hardware getInstance(){
        if(instance == null) {

            instance = new Hardware();
        }
        return instance;
    }

    public void init(HardwareMap hmap){
        this.hmap = hmap;
        this.drivetrain = new DrivetrainSUB(hmap);
    }


    public void loop() {

    }

}
