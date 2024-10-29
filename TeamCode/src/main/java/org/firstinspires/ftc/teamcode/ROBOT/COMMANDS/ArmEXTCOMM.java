package org.firstinspires.ftc.teamcode.ROBOT.COMMANDS;

import com.arcrobotics.ftclib.command.CommandBase;

import org.firstinspires.ftc.teamcode.ROBOT.SUBSYSTEMS.IntakeSUB;

public class ArmEXTCOMM extends CommandBase {
    public IntakeSUB intake;

    public ArmEXTCOMM(IntakeSUB intake){
        this.intake = intake;
    }


}
