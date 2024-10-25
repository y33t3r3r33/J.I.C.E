package org.firstinspires.ftc.teamcode.ROBOT.TEST;

import com.arcrobotics.ftclib.drivebase.MecanumDrive;
import com.arcrobotics.ftclib.hardware.motors.MotorEx;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name = "DrivetrainTest", group = "Test")
public class DrivetrainTest extends OpMode {

    public MecanumDrive Drive;

    public MotorEx FRMotor;
    public MotorEx FLMotor;
    public MotorEx BRMotor;
    public MotorEx BLMotor;

    @Override
    public void init() {
        FRMotor = new MotorEx(hardwareMap, "FRMotor");
        FLMotor = new MotorEx(hardwareMap, "FLMotor");
        BRMotor = new MotorEx(hardwareMap, "BRMotor");
        BLMotor = new MotorEx(hardwareMap, "BLMotor");
    }

    @Override
    public void loop() {
       this.Drive.driveRobotCentric(
               -gamepad1.left_stick_x * 0.8,
               gamepad1.left_stick_y * 0.8,
               -gamepad1.right_stick_x * 0.8);

    }
}
