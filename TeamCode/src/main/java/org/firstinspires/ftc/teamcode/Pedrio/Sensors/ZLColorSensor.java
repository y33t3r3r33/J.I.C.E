package org.firstinspires.ftc.teamcode.Pedrio.Sensors;

import com.qualcomm.hardware.rev.RevColorSensorV3;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.Robot.Config;
import org.firstinspires.ftc.teamcode.Robot.Subsystems.Enums.WantedColor;

public class ZLColorSensor {
    private RevColorSensorV3 sensor;
    public ZLColorSensor(HardwareMap hmap, String name){
        this.sensor = hmap.get(RevColorSensorV3.class, name);
    }

    public boolean getIsWantedColor(){
        double[] sensorColors = {
                this.sensor.getNormalizedColors().red,
                this.sensor.getNormalizedColors().green,
                this.sensor.getNormalizedColors().blue};

                switch (Config.wantedColor) {
                    case RED:
                        return (tolerance(sensorColors[0], Config.RedSampleRGB[0] - 10, Config.RedSampleRGB[0] + 10) &&
                                tolerance(sensorColors[1], Config.RedSampleRGB[1] - 10, Config.RedSampleRGB[1] + 10) &&
                                tolerance(sensorColors[2], Config.RedSampleRGB[2] - 10, Config.RedSampleRGB[2] + 10) ||

                                (tolerance(sensorColors[0], Config.YellowSampleRGB[0] - 10, Config.YellowSampleRGB[0] + 10) &&
                                        tolerance(sensorColors[1], Config.YellowSampleRGB[1] - 10, Config.YellowSampleRGB[1] + 10) &&
                                        tolerance(sensorColors[2], Config.YellowSampleRGB[2] - 10, Config.YellowSampleRGB[2] + 10)
                                )
                                );
                    case BLUE:
                        return (tolerance(sensorColors[0], Config.BlueSampleRGB[0] - 10, Config.BlueSampleRGB[0] + 10) &&
                                tolerance(sensorColors[1], Config.BlueSampleRGB[1] - 10, Config.BlueSampleRGB[1] + 10) &&
                                tolerance(sensorColors[2], Config.BlueSampleRGB[2] - 10, Config.BlueSampleRGB[2] + 10)
                        ) || (tolerance(sensorColors[0], Config.YellowSampleRGB[0] - 10, Config.YellowSampleRGB[0] + 10) &&
                                tolerance(sensorColors[1], Config.YellowSampleRGB[1] - 10, Config.YellowSampleRGB[1] + 10) &&
                                tolerance(sensorColors[2], Config.YellowSampleRGB[2] - 10, Config.YellowSampleRGB[2] + 10)
                        );
                }
                return false;
    }
    private boolean tolerance(double value,double min,double max){
        return value >= min && value <= max;
    }
}
