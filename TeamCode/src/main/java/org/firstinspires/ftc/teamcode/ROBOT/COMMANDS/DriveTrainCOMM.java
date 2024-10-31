package org.firstinspires.ftc.teamcode.ROBOT.COMMANDS;

import com.arcrobotics.ftclib.command.CommandBase;

import org.firstinspires.ftc.teamcode.ROBOT.SUBSYSTEMS.DrivetrainSUB;

import java.util.function.DoubleSupplier;

public class DriveTrainCOMM extends CommandBase {

    private DrivetrainSUB dt;

    private DoubleSupplier xSupplier;
    private DoubleSupplier ySupplier;
    private DoubleSupplier zSupplier;

    public DriveTrainCOMM(DrivetrainSUB dt, DoubleSupplier xSupplier, DoubleSupplier ySupplier, DoubleSupplier zSupplier) {
        this.dt = dt;
        this.xSupplier = xSupplier;
        this.ySupplier = ySupplier;
        this.zSupplier = zSupplier;

        addRequirements(dt);
    }

    @Override
    public void initialize() {
        super.initialize();
    }

    @Override
    public void execute() {


        this.dt.SigmaDrive.driveRobotCentric(
                -this.xSupplier.getAsDouble() * 0.8
                , this.ySupplier.getAsDouble() * 0.8
                , -this.zSupplier.getAsDouble() * 0.8);

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
