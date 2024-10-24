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
        if (gamepad1.a) {
            testR.setPosition(0.5);
        } else if (gamepad1.b) {
            testR.setPosition(0.0);
        }

        if (gamepad1.right_bumper) {
            testCR.setPower(1.0);
        } else if (gamepad1.left_bumper) {
            testCR.setPower(-1.0);
        } else {
            testCR.setPower(0.0);
        }
    }
}
