
package com.mycompany.tubemanagementsystem;
public class Tube 
{
 
    private double height1;
private double radius1;

    public Tube(double height1, double radius1) {
        this.height1 = height1;
        this.radius1= radius1;
    }
    public double getCorkRadius()
    {
        return radius1;
    }
    public double getCorkArea()
    {
        return 2*3.14*radius1*height1;
    }
    public double getCorkvalume()
    {
      return 3.14*radius1*radius1*height1;
    }   
}
