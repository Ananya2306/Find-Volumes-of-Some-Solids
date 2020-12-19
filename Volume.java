import java.util.Scanner;
public class Volume
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);

        //  Options for finding the Volume of ------
        System.out.println("1. Volume Of Cuboid ...");
        System.out.println("2. Volume Of Cylinder ...");
        System.out.println("3. Volume Of Cone ...");
        // Enter Your Choice 
        System.out.println("Enter You Choice - (1 or 2 or 3) ");
        int choice = in.nextInt();

        switch (choice) {
            case 1:
            System.out.println("Enter Length of Cuboid");
            double lCuboid = in.nextDouble();
            System.out.println("Enter Breadth of Cuboid");
            double bCuboid = in.nextDouble();
            System.out.println("Enter Height of Cuboid");
            double hCuboid = in.nextDouble();

            double volCuboid = lCuboid*bCuboid*hCuboid;
            System.out.println("Volume of Cuboid = " + volCuboid);
            
                break;
            case 2:
            System.out.println("Enter Radius of Cylinder");
            double rCylinder = in.nextDouble();
            System.out.println("Enter Height of Cylinder");
            double hCylinder = in.nextDouble();

            double volCylinder = (22/7.0)*Math.pow(rCylinder, 2)*hCylinder;
            System.out.println("Volume of Cylinder = " +volCylinder);

            break;
            case 3:
            System.out.println("Enter Radius of Cone");
            double rCone = in.nextDouble();
            System.out.println("Enter Height of Cone");
            double hCone = in.nextDouble();

            double volCone = (1/3.0)*(22/7.0)*Math.pow(rCone, 2)*hCone;
            System.out.println("Volume of Cone = " + volCone);

            break;
            default:
            System.out.println("Wrong Choice !! , Please Select from 1 , 2 or 3 .... ");
               
        }

    }
}