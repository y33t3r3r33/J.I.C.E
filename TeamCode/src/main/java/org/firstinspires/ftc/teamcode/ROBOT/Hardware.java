package org.firstinspires.ftc.teamcode.ROBOT;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class Hardware {

    public static Hardware instance = null;
    private HardwareMap hmap;

    public DcMotor leftMotor;
    public DcMotor rightMotor;
    public DcMotor Forearm;
    public DcMotor Arm;

    public Servo Claw;
    public Servo Intake;

    public void init(HardwareMap hmap){
        this.hmap = hmap;

        leftMotor = hmap.get(DcMotor.class, "leftmotor");
        rightMotor = hmap.get(DcMotor.class, "rightmotor");
        Forearm = hmap.get(DcMotor.class,"forearm");
        Arm = hmap.get(DcMotor.class,"arm");
        Claw = hmap.get(Servo.class,"claw");
        Intake = hmap.get(Servo.class,"intake");
    }

    public void loop() {

    }

}
