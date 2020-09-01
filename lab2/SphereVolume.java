// scanner class import
import java.util.Scanner;

public class SphereVolume {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//scanner object created
		Scanner input = new Scanner(System.in);
		
		//Print the purpose of the program
		System.out.println("Calculate volume of the sphere");
		
//		Print a prompt asking for the diameter of a sphere  
		System.out.println("Enter diameter of a sphere:");
		
//		Read the diameter  
		double diam = input.nextDouble();
		
//		Calculate the radius as diameter divided by 2 
		double rad = diam/2.0;

//		Calculate volume of the sphere using the formula
		double vol = ((4*Math.PI*Math.pow(rad, 3))/3);
		
		System.out.println("The volume is "+vol);

	}

}
