package org.firstinspires.ftc.teamcode.ROBOT.TELEOP;

import com.arcrobotics.ftclib.drivebase.MecanumDrive;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.ROBOT.Hardware;


@TeleOp(name = "Skibidi_teleop")
public class Skibidi_teleop extends OpMode {
    //private PIDController PIDController = new PIDController(0.1);
    private Hardware robot = Hardware.instance;

    @Override
    public void init() {
        robot = robot.getInstance();
        robot.init(hardwareMap);
    }

    @Override
    public void loop() {
        this.robot.drivetrain.SigmaDrive(
                -gamepad1.left_stick_x * 0.8,
                gamepad1.left_stick_y * 0.8,
                -gamepad1.right_stick_x * 0.8);

    }
}
