
package com.mycompany.tubemanagementsystem;

public class Cylinder {
    private double height;
private double radius;

    public Cylinder(double height, double radius) {
        this.height = height;
        this.radius = radius;
    }
public double getHeight()
{
    return height;
}
    public double getCylinderArea()
    {
        return 2*3.14*radius*height+2*3.14*radius*radius;
    }
  public double getCylinderValume()
  {
      return 3.14*radius*radius*height;
  }
}
