package org.firstinspires.ftc.teamcode.ROBOT.COMMANDS.TELEOPCOMMANDS;

import com.arcrobotics.ftclib.command.CommandBase;

import org.firstinspires.ftc.teamcode.ROBOT.SUBSYSTEMS.IntakeSUB;

public class IntakeCOMM extends CommandBase {

    private IntakeSUB intake;
    private double pose;
    public IntakeCOMM(IntakeSUB intake, double pose){
        this.intake = intake;
        this.pose = pose;
        addRequirements(this.intake);
    }

    @Override
    public void initialize() {
        super.initialize();
    }

    @Override
    public void execute() {
        this.intake.SetArmEXT(this.pose);
    }

    @Override
    public void end(boolean interrupted) {
        this.intake.setExtensionPower(0);
        super.end(interrupted);
    }

    @Override
    public boolean isFinished() {
        return tolerance(this.intake.Encoder(), -5,5);
    }

    public boolean tolerance(double value,double min,double max){
        return value >= min && value <= max;
    }
}
