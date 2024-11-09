package org.firstinspires.ftc.teamcode.Pedrio.Sensors;

import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.TouchSensor;

public class MagLimitSwitch {
    private TouchSensor MagLimitSwitch;
    public MagLimitSwitch(HardwareMap hmap,String name){
        this.MagLimitSwitch = hmap.get(TouchSensor.class,name);
    }

    public boolean getAtLimit(){
        return this.MagLimitSwitch.isPressed();
    }
}
