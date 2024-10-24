package org.firstinspires.ftc.teamcode.ROBOT.TELEOP;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;

import org.firstinspires.ftc.teamcode.ROBOT.Hardware;
import org.firstinspires.ftc.teamcode.ROBOT.PIDController;

public class Skibidi_teleop extends OpMode {
    private PIDController PIDController = new PIDController(0.1);
    private Hardware robot = Hardware.instance;


    @Override
    public void init() {
        robot = robot.getInstance();
        robot.init(hardwareMap);
    }

    @Override
    public void loop() {
        robot.FRMotor.setBuffer(PIDController.Calculate(0, robot.FRMotor.getCurrentPosition()));
        robot.FLMotor.setBuffer(PIDController.Calculate(0, robot.FLMotor.getCurrentPosition()));
    }
}
