package org.firstinspires.ftc.teamcode.ROBOT.TELEOP;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.ROBOT.Hardware;


@TeleOp(name = "teleop")
public class Skibidi_teleop extends OpMode {
    private static Hardware robot = Hardware.getInstance();


    @Override
    public void init() {
        robot = robot.getInstance();
        robot.init(hardwareMap);
    }

    @Override
    public void loop() {
        robot.loop();
        this.robot.drivetrain.SigmaDrive(
                -gamepad1.left_stick_x * 1 ,
                -gamepad1.left_stick_y * 1,
                -gamepad1.right_stick_x * 1);

    }
}
