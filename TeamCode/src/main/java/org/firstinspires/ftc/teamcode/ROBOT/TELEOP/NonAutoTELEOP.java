package org.firstinspires.ftc.teamcode.ROBOT.TELEOP;

import com.arcrobotics.ftclib.drivebase.MecanumDrive;
import com.arcrobotics.ftclib.hardware.motors.MotorEx;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.Servo;


@TeleOp(name = "NonAutoTeleop")
public class NonAutoTELEOP extends OpMode {

    public MotorEx FLMotor;
    public MotorEx FRMotor;
    public MotorEx BLMotor;
    public MotorEx BRMotor;

    public MecanumDrive drive;

    public CRServo Intake;

    public MotorEx ArmEXT;
    public MotorEx ArmANG;


    @Override
    public void init() {
        this.FLMotor = new MotorEx(hardwareMap, "FLMotor");
        this.FRMotor = new MotorEx(hardwareMap,"FRMotor");
        this.BLMotor = new MotorEx(hardwareMap,"BLMotor");
        this.BRMotor = new MotorEx(hardwareMap,"BRMotor");

        this.Intake = hardwareMap.get(CRServo.class,"Intake");

        this.ArmEXT = new MotorEx(hardwareMap, "ArmANG");
        this.ArmANG = new MotorEx(hardwareMap,"ArmANG");

        drive = new MecanumDrive(this.FLMotor, this.FRMotor, this.BLMotor, this.BRMotor);
    }

    @Override
    public void loop() {
    this.drive.driveRobotCentric(
            -gamepad1.left_stick_x * 0.8,
            gamepad1.left_stick_y * 0.8,
            -gamepad1.right_stick_x * 0.8);

    double power = gamepad2.left_stick_y;

    double angle = gamepad2.right_stick_y;

    this.ArmEXT.set(power);

    this.ArmANG.set(angle);

    if(gamepad2.a){
        Intake.setPower(1);
    } else if (gamepad2.b) {
        Intake.setPower(-1);
    }else {
        Intake.setPower(0);
    }

    }
}
