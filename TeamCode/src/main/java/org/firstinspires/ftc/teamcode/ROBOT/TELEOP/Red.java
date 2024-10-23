package org.firstinspires.ftc.teamcode.ROBOT.TELEOP;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.ROBOT.Hardware;
import org.firstinspires.ftc.teamcode.ROBOT.PController;

@TeleOp(name="RedTeltOp")
public class Red extends OpMode {
    private PController pController = new PController(0.1);
   private Hardware robot = Hardware.instance;



    @Override
    public void init() {
        robot = robot.getInstance();
        robot.init(hardwareMap);

    }

    @Override
    public void loop() {
        robot.rightMotor.setPower(pController.Calculate(0, robot.rightMotor.getCurrentPosition()));
        robot.leftMotor.setPower(pController.Calculate(0, robot.leftMotor.getCurrentPosition()));
    }
}
