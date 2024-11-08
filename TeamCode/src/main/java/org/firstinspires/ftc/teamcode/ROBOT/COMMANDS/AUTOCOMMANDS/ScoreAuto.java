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

public class ScoreAuto extends SequentialCommandGroup {

    private ArmANGSUB armang;
    private IntakeSUB intake;

    public ScoreAuto(ArmANGSUB armang, IntakeSUB intake) {
        this.armang = armang;
        this.intake = intake;

        addRequirements(this.armang, this.intake);
    }

    @Override
    public void initialize() {
        addCommands( new ParallelCommandGroup(new ArmANGCOMM(this.armang, Config.PivotScoreSpecimentSetpoint),
                        new IntakeCOMM(this.intake, Config.ExtensionScoreSpecimentSetpoint))
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
