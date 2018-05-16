import java.util.Scanner;


public class CarServicingApp {

	public static void main(String[] args) {
		// 
		Scanner input = new Scanner(System.in);
		
		// variable declaration
		String serviceType;
		String branchLocation;
		
		// prompt user to enter service and branch location
		System.out.print("\nEnter service type: ");
		serviceType = input.nextLine();
		
		System.out.print("\nEnter branch location: ");
		branchLocation = input.nextLine();
		
		// instantiate CarServicing Class
		CarServicing cs = new CarServicing();
		
		cs.setServiceType(serviceType);
		cs.setBranchLocation(branchLocation);
		
		// compute Time for servicing the car
		cs.compute();
		
		// get the time of service
		System.out.println("Time of Day is: " + cs.getTimeOfDay());
		
		// test transformation
		System.out.println("enter a word to transform");
		System.out.println(cs.transform(input.nextLine()));

	}

}
