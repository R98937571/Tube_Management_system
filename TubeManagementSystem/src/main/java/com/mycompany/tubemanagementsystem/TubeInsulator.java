package com.mycompany.tubemanagementsystem;

public class TubeInsulator {
    
    private Cylinder cylinder;
    private Tube tube;
    
    public TubeInsulator (double height,double radius,double height1,double radius1)
    {
        cylinder=new Cylinder(height,radius);
        tube=new Tube(height1,radius1);           
    }
    public double getCylindervolume()
    {
        return cylinder.getCylinderValume();
    }
    
    public double getCorkVolume()
    {
        return tube.getCorkvalume();
    }
    public double getCorkFillGlycerine()
    {
        return 3.14*tube.getCorkRadius()*tube.getCorkRadius()*cylinder.getHeight()*1.26;
       }
    public double getVacantArea()
    {
       return 3.14*tube.getCorkRadius()*tube.getCorkRadius()*cylinder.getHeight()*1.5;
    }          
}
