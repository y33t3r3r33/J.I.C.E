package org.firstinspires.ftc.teamcode.ROBOT.COMMANDS;

import com.arcrobotics.ftclib.command.CommandBase;

import org.firstinspires.ftc.teamcode.ROBOT.SUBSYSTEMS.ArmEXTSUB;

public class ArmEXTCOMM extends CommandBase {
    public ArmEXTSUB armEXT;
    public double pose;

    public ArmEXTCOMM(ArmEXTSUB armExt, double pose) {
        this.armEXT = armEXT;
        this.pose = pose;
        addRequirements(armEXT);
    }


    @Override
    public void initialize() {
        super.initialize();
    }

    @Override
    public void execute() {
        this.armEXT.SetArmEXT(this.pose);
    }

    @Override
    public void end(boolean interrupted) {
        this.armEXT.setExtensionPower(0);
        super.end(interrupted);
    }

    @Override
    public boolean isFinished() {
        return tolerance(this.armEXT.Encoder(), -5,5);
    }
    public boolean tolerance(double value,double min,double max) {
        return value >= min && value <= max;
    }
}
