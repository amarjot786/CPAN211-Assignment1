
//Extends all common data from Persons class into Student,Professor, and TA class
public class Professor extends Person{
	
	//Professor constructor for Person super class variables
	public Professor(String firstName, String lastName, String courseName, int courseHours) {
		super(firstName, lastName, courseName, courseHours);
		// TODO Auto-generated constructor stub
	}
	
	/*This override function returns lecture hours*/
	@Override
	public int getParticipatingHours(int courseHours) {
		/*Utilizing labHours from TA to calculate lectureHours*/
		int labHours = (courseHours > 4) ? 2 :1;
		int lectureHours = courseHours - labHours;
		
		return lectureHours;
	}

	@Override
	public String getTitle() {
		//Returns the title of the Class
		return "Professor";
	}

}
