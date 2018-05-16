
public class CarServicing {
	
	private String serviceType;
	
	private String branchLocation;
	
	private String timeOfDay;
	
	

	public CarServicing() {
//		super();
	}

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	public void setBranchLocation(String branchLocation) {
		this.branchLocation = branchLocation;
	}
	
	/**
	 * Compute method to determine the time for servicing the car
	 */
	public void compute() {
		if (serviceType.equals("full") && branchLocation.equals("blanchardstown")) {
			timeOfDay = "morning";
		} else if (serviceType.equals("full") && branchLocation.equals("stillorgan")) {
			timeOfDay = "afternoon";
		} else if (serviceType.equals("interim") && branchLocation.equals("blanchardstown")) {
			timeOfDay = "afternoon";
		} else if (serviceType.equals("interim") && branchLocation.equals("stillorgan")) {
			timeOfDay = "evening";
		} else if (serviceType.equals("pre-nct") && branchLocation.equals("blanchardstown")) {
			timeOfDay = "evening";
		}else {
			timeOfDay = "morning";
		}
	}
	
	/**
	 * A getter method to return time of the day
	 * @return
	 */
	public String getTimeOfDay() {
		return timeOfDay;
	}
	
	public String transform(String word){
		String result = "";
		// first rule: replace all 'a' with '@'
		result = word.replaceAll("a", "@");
		
		// second rule: remove m, n, p, r
		result = result.replaceAll("m", "");
		result = result.replaceAll("n", "");
		result = result.replaceAll("p", "");
		result = result.replaceAll("r", "");
		return result;
	}
	
}
 