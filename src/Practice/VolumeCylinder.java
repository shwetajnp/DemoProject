package Practice;

import java.util.Scanner;

public class VolumeCylinder {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the radius");
		double r = s.nextDouble();
		System.out.println("Enter the height");
		double h = s.nextDouble();
		double volume= ((22*r*r*h)/7);
		System.out.println("Volume of cylinder is :" +volume);

	}

}
