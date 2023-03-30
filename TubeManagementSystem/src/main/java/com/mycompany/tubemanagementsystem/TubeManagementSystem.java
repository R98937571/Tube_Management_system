

package com.mycompany.tubemanagementsystem;


public class TubeManagementSystem {

    public static void main(String[] args)
    {
        TubeInsulator o=new TubeInsulator(10,8,16,2);
        
        System.out.println("Cylinder Volume    "+o.getCylindervolume());
        System.out.println("Cork Volume    "+o.getCorkVolume());
        System.out.println("Vacant Area    "+o.getVacantArea()+"Kg");
        System.out.println("Fill Glycerien   "+o.getCorkFillGlycerine()+"kg");
    }
}
