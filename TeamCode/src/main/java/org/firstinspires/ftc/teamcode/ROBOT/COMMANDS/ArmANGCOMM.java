package org.firstinspires.ftc.teamcode.ROBOT.COMMANDS;

import com.arcrobotics.ftclib.command.CommandBase;

import org.firstinspires.ftc.teamcode.ROBOT.SUBSYSTEMS.ArmANGSUB;

public class ArmANGCOMM extends CommandBase {

    ArmANGSUB armANG;

    public double pose;


    public ArmANGCOMM(ArmANGSUB armANG) {
        this.armANG = armANG;

        addRequirements(this.armANG);
    }



    @Override
    public void initialize() {
        super.initialize();
    }

    @Override
    public void execute() {
        this.armANG.GoPosition(pose);
    }

    @Override
    public void end(boolean interrupted) {
        super.end(interrupted);
    }

    @Override
    public boolean isFinished() {
        return tolerance(this.armANG.Encoder(),-5,5);
    }
    public boolean tolerance(double value,double min,double max){
        return value >= min && value <= max;
    }

}
