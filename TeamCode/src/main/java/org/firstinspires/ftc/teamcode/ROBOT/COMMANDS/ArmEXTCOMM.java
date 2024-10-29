package org.firstinspires.ftc.teamcode.ROBOT.COMMANDS;

import com.arcrobotics.ftclib.command.CommandBase;

import org.firstinspires.ftc.teamcode.ROBOT.SUBSYSTEMS.ArmSUB;
import org.firstinspires.ftc.teamcode.ROBOT.SUBSYSTEMS.IntakeSUB;

public class ArmEXTCOMM extends CommandBase {
    ArmSUB arm;

    public ArmEXTCOMM(ArmSUB arm) {
        this.arm = arm;

        addRequirements(this.arm);
    }


}
