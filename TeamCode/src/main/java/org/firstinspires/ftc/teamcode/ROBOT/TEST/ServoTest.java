package org.firstinspires.ftc.teamcode.ROBOT.TEST;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.Servo;

public class ServoTest extends OpMode {

    public Servo testR;
    public CRServo testCR;

    @Override
    public void init() {
        testR = hardwareMap.get(Servo.class, "testR");
        testCR = hardwareMap.get(CRServo.class, "testCR");
    }

    @Override
    public void loop() {

    }
}
