package org.firstinspires.ftc.teamcode.Pedrio.Sensors;

import com.arcrobotics.ftclib.command.CommandBase;
import com.qualcomm.robotcore.hardware.AnalogInput;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.Robot.Config;

public class BeamBreak {
    private AnalogInput sensor;
    public BeamBreak(HardwareMap hmap, String SensorName) {
        sensor = hmap.get(AnalogInput.class,SensorName);
    }

    public boolean getTriggered(){
        return (sensor.getVoltage() > Config.BeamNotBroken);
    }
}
