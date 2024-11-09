package org.firstinspires.ftc.teamcode.Pedrio.BrainRot;

public class SkibidiClass {

    private int alphaness = 100;


    public SkibidiClass(int alphaness){
        this.alphaness = alphaness;
    }


    public double checkForSkibidiness(double aura_level, double sigmaness){
        // add aura and sigmaness and square it and then divide it by our alphaness
        double skibidiness = Math.sqrt(aura_level + sigmaness) / alphaness;


        return skibidiness;
    }


    public void main(){
        double i = checkForSkibidiness(10.6,5000);
    }
}
