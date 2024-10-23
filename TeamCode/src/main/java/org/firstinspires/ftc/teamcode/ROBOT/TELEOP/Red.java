package org.firstinspires.ftc.teamcode.ROBOT.TELEOP;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

import org.firstinspires.ftc.teamcode.ROBOT.Hardware;

@TeleOp(name="RedTeleOp")
public class Red extends LinearOpMode {
   private Hardware robot = Hardware.instance;


    @Override
    public void runOpMode() {
        robot = robot.getInstance();
        robot.init(hardwareMap);


        // Stop and reset encoders
        //leftMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        //rightMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        //arm.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        //wrist.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

        // Set motors to use encoders
        //leftMotor.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        //rightMotor.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);

        // Set motor direction
        //leftMotor.setDirection(DcMotor.Direction.REVERSE);
        //rightMotor.setDirection(DcMotor.Direction.FORWARD);
        //Set zero power behavior
        //Forearm.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        //Arm.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        //leftMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.FLOAT);
        //rightMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.FLOAT);

        // Wait for the game to start (driver presses PLAY)
        waitForStart();

        // Run until the end of the match (driver presses STOP)
        while (opModeIsActive()) {
    }
}
