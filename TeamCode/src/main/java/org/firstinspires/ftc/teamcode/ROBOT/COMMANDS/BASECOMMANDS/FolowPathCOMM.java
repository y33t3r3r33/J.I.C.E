package org.firstinspires.ftc.teamcode.ROBOT.COMMANDS.BASECOMMANDS;

import com.arcrobotics.ftclib.command.CommandBase;

import org.firstinspires.ftc.teamcode.ROBOT.SUBSYSTEMS.DrivetrainSUB;
import org.firstinspires.ftc.teamcode.pedroPathing.pathGeneration.BezierCurve;
import org.firstinspires.ftc.teamcode.pedroPathing.pathGeneration.Path;

public class FolowPathCOMM extends CommandBase {
    Path path = null;
    BezierCurve bezierCurve = null;
    DrivetrainSUB dt;
    private boolean UsingPath = false;

    public FolowPathCOMM(Path path, DrivetrainSUB dt){
        this.path = path;
        this.dt = dt;
        UsingPath = true;
        addRequirements(this.dt);
    }

    public FolowPathCOMM(BezierCurve bezierCurve, DrivetrainSUB dt){
        this.bezierCurve = bezierCurve;
        this.dt = dt;
        addRequirements(this.dt);
    }

    @Override
    public void initialize() {
        if(UsingPath){
            this.dt.follower.followPath(path);
        }else{
            this.dt.follower.followPath(new Path(this.bezierCurve));
        }
    }

    @Override
    public void execute() {
        super.execute();
    }


    @Override
    public boolean isFinished() {
        return this.dt.follower.atParametricEnd();
    }
}
