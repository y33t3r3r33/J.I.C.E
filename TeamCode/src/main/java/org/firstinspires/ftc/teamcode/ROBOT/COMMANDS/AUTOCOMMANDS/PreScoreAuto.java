package org.firstinspires.ftc.teamcode.ROBOT.COMMANDS.AUTOCOMMANDS;

import com.arcrobotics.ftclib.command.InstantCommand;
import com.arcrobotics.ftclib.command.ParallelCommandGroup;
import com.arcrobotics.ftclib.command.SequentialCommandGroup;
import com.arcrobotics.ftclib.command.WaitCommand;

import org.firstinspires.ftc.teamcode.ROBOT.COMMANDS.TELEOPCOMMANDS.ArmANGCOMM;
import org.firstinspires.ftc.teamcode.ROBOT.COMMANDS.TELEOPCOMMANDS.IntakeCOMM;
import org.firstinspires.ftc.teamcode.ROBOT.Config;
import org.firstinspires.ftc.teamcode.ROBOT.SUBSYSTEMS.ArmANGSUB;
import org.firstinspires.ftc.teamcode.ROBOT.SUBSYSTEMS.IntakeSUB;

public class PreScoreAuto extends SequentialCommandGroup {

    private ArmANGSUB armang;
    private IntakeSUB intake;

    public PreScoreAuto(ArmANGSUB armang, IntakeSUB intake) {
        this.armang = armang;
        this.intake = intake;

        addRequirements(this.armang, this.intake);
    }

    @Override
    public void initialize() {
        addCommands( new ParallelCommandGroup(new ArmANGCOMM(this.armang, Config.PivotPreScoreSpecimentSetpoint),
                        new IntakeCOMM(this.intake, Config.ExtensionPreScoreSpecimentSetpoint))
                , new InstantCommand(this.intake::intakeToggleOut )
                , new WaitCommand(300)
        );
    }

    @Override
    public void execute() {
        super.execute();
    }

    @Override
    public void end(boolean interrupted) {
        this.intake.intakeToggleOn();
        super.end(interrupted);
    }

    @Override
    public boolean isFinished() {
        return true;
    }

}
