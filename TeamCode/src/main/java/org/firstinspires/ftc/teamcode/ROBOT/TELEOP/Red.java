package org.firstinspires.ftc.teamcode.ROBOT.TELEOP;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.ROBOT.Hardware;

@TeleOp(name="RedTeleOp")
public class Red extends OpMode {
   private Hardware robot = Hardware.instance;



    @Override
    public void init() {
        robot = robot.getInstance();
        robot.init(hardwareMap);

    }

    @Override
    public void loop() {

    }
}
