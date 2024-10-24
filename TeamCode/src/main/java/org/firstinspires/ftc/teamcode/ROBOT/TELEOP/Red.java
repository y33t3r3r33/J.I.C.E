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

    }
}
