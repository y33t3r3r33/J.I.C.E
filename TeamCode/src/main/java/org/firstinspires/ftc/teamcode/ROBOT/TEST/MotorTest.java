package org.firstinspires.ftc.teamcode.ROBOT.TEST;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

import org.firstinspires.ftc.teamcode.ROBOT.Hardware;

@TeleOp(name = "MotorTest", group = "Test")
public class MotorTest extends OpMode {

    public DcMotor test;//First motor port

    @Override
    public void init() {
        test = hardwareMap.get(DcMotor.class, "test");
    }

    @Override
    public void loop() {
        test.setPower(gamepad1.left_stick_y);
    }
}
