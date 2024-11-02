package org.firstinspires.ftc.teamcode.GIRLSBOT;

import com.arcrobotics.ftclib.hardware.motors.MotorEx;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name = "girls teleop")
public class Teleop extends OpMode {

    private MotorEx FLMotor;
    private MotorEx FRMotor;
    private MotorEx BLMotor;
    private MotorEx BRMotor;

    @Override
    public void init() {
      this.FLMotor = new MotorEx(hardwareMap, "FLMotor");
      this.FRMotor = new MotorEx(hardwareMap,"FRMotor");
      this.BLMotor = new MotorEx(hardwareMap, "BLMotor");
      this.BRMotor = new MotorEx(hardwareMap, "BRMotor");
    }

    @Override
    public void loop() {
        double power1 = -gamepad1.left_stick_y;
        double power2 = gamepad1.right_stick_y;
        FLMotor.set(power1);
        BRMotor.set(power1);

        FRMotor.set(power2);
        BLMotor.set(power2);

    }
}
