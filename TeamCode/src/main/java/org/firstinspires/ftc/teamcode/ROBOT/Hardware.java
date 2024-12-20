package org.firstinspires.ftc.teamcode.ROBOT;

import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.ROBOT.SUBSYSTEMS.DrivetrainSUB;
import org.firstinspires.ftc.teamcode.ROBOT.SUBSYSTEMS.IntakeSUB;
import org.firstinspires.ftc.teamcode.ROBOT.SUBSYSTEMS.ArmANGSUB;

public class Hardware {

    public static Hardware instance = null;
    private HardwareMap hmap;
    public DrivetrainSUB drivetrain;
    public IntakeSUB intake;
    public ArmANGSUB armEXT;
    public ArmANGSUB armANG;

    public static Hardware getInstance(){
        if(instance == null) {

            instance = new Hardware();
        }
        return instance;
    }

    public void init(HardwareMap hmap){
        this.hmap = hmap;
        this.drivetrain = new DrivetrainSUB(hmap);
        this.intake = new IntakeSUB(hmap);
        this.armEXT = new ArmANGSUB(hmap);
        this.armANG = new ArmANGSUB(hmap);
    }


    public void loop() {

    }

}
