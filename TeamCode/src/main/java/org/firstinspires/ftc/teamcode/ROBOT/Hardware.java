package org.firstinspires.ftc.teamcode.ROBOT;

import com.arcrobotics.ftclib.hardware.motors.MotorEx;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Hardware {

    public static Hardware instance = null;
    private HardwareMap hmap;

    public MotorEx FRMotor;
    public MotorEx FLMotor;
    public MotorEx BRMotor;
    public MotorEx BLMotor;

    public MotorEx Extend;

    public CRServo Intake;


    public Hardware(Hardware hmap){
    }


    public Hardware(){

    }
    public Hardware getInstance(){
        if(instance == null) {

            instance = new Hardware();
        }
        return instance;
    }

    public void init(HardwareMap hmap){
        this.hmap = hmap;

        FRMotor = hmap.get(MotorEx.class, "FRMotor");
        FLMotor = hmap.get(MotorEx.class, "FLMotor");
        BRMotor = hmap.get(MotorEx.class, "BRMotor");
        BLMotor = hmap.get(MotorEx.class, "BLMotor");

        Extend = hmap.get(MotorEx.class, "Extend");

        Intake = hmap.get(CRServo.class, "Intake");

    }


    public void loop() {

    }

}
