
//Extends all common data from Persons class into Student,Professor, and TA class
public class TA extends Person {

	
	//TA constructor for Person super class variables
	public TA(String firstName, String lastName, String courseName, int courseHours) {
		super(firstName, lastName, courseName, courseHours);
	}

	//Method returns labHours
	@Override
	public int getParticipatingHours(int courseHours) {
		/*If statement [if totalHours greater than 4 then lab hours = 2 else set to 1]
		 *initializes lab hours and returns labHours as 1 or 2*/
		int labHours = (courseHours > 4) ? 2 :1;
		return labHours;
	}

	@Override
	public String getTitle() {
		//Returns the title of TA
		return "TA";
	}

}
