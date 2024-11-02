package org.firstinspires.ftc.teamcode.BOYSBOT;

import com.arcrobotics.ftclib.hardware.motors.MotorEx;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name = "boys teleop")
public class Teleop extends OpMode {

    private MotorEx right;
    private MotorEx left;
    private MotorEx arm;


    @Override
    public void init() {
    this.right = new MotorEx(hardwareMap, "right");
    this.left = new MotorEx(hardwareMap, "left");
    this.arm = new MotorEx(hardwareMap, "arm");
    }

    @Override
    public void loop() {
    double power1 = gamepad1.left_stick_y;
    double power2 = gamepad1.right_stick_x;
    double powerarm = gamepad2.left_trigger;

    right.set(power1);
    left.set(power2);
    arm.set(powerarm);

    }
}
