// Abstract class representing a person involved in a course
// (Professor, TA, or Student). Holds the fields and behavior
// common to all people, and implements ParticipateHours.
public abstract class Person implements ParticipateHours {

    protected String firstName;
    protected String lastName;
    protected String courseName;
    protected int courseHours;

    // Constructor to initialize the common fields shared by all people.
    public Person(String firstName, String lastName, String courseName, int courseHours) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.courseName = courseName;
        this.courseHours = courseHours;
    }

    // Each subclass (Professor, TA, Student) calculates its own
    // participating hours differently, so this stays abstract.
    public abstract int getParticipatingHours(int courseHours);

    // Returns the role label ("Professor", "TA", "Student") used
    // when printing this person's info. Implemented by each subclass.
    public abstract String getTitle();

    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getCourseName() { return courseName; }
    public int getCourseHours() { return courseHours; }

    // Formats this person's info for output as:
    // Title FirstName LastName TotalHours
    @Override
    public String toString() {
        return getTitle() + " " + firstName + " " + lastName + " " + getParticipatingHours(courseHours);
    }
}