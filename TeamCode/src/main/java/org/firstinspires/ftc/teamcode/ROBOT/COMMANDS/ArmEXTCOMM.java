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


}
