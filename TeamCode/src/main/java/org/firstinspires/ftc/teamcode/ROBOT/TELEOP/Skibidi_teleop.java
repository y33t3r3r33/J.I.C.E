package org.firstinspires.ftc.teamcode.ROBOT.TELEOP;

import com.arcrobotics.ftclib.drivebase.MecanumDrive;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;

import org.firstinspires.ftc.teamcode.ROBOT.Hardware;
import org.firstinspires.ftc.teamcode.ROBOT.Config;
import org.firstinspires.ftc.teamcode.ROBOT.SUBSYSTEMS.DrivetrainSUB;
import org.firstinspires.ftc.teamcode.ROBOT.SUBSYSTEMS.ArmSUB;

@Disabled
public class Skibidi_teleop extends OpMode {
    //private PIDController PIDController = new PIDController(0.1);
    private Hardware robot = Hardware.instance;

    public MecanumDrive drivesigma;

    @Override
    public void init() {
        robot = robot.getInstance();
        robot.init(hardwareMap);
    }

    @Override
    public void loop() {
        this.drivesigma.driveRobotCentric(
                -gamepad1.left_stick_x * 0.8,
                gamepad1.left_stick_y * 0.8,
                -gamepad1.right_stick_x * 0.8);


        double power = gamepad2.left_stick_y;

        //this.Arm.setPower(power);
    }
}
