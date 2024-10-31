package org.firstinspires.ftc.teamcode.ROBOT.COMMANDS;

import com.arcrobotics.ftclib.command.CommandBase;

import org.firstinspires.ftc.teamcode.ROBOT.SUBSYSTEMS.ArmSUB;

import java.util.function.DoubleSupplier;

public class ArmEXTCOMM extends CommandBase {
    ArmSUB arm;

    private DoubleSupplier ext;

    public ArmEXTCOMM(ArmSUB arm) {
        this.arm = arm;

        addRequirements(this.arm);
    }


    @Override
    public void initialize() {
        super.initialize();
    }

    @Override
    public void execute() {
        super.execute();
    }

    @Override
    public void end(boolean interrupted) {
        super.end(interrupted);
    }

    @Override
    public boolean isFinished() {
        return super.isFinished();
    }
}
