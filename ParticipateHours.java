// Interface that defines the contract for calculating a person's
// participating hours for a given course.
public interface ParticipateHours {

    // Returns how many hours this person actually participates in,
    // based on the total hours of the course.
    int getParticipatingHours(int courseHours);
}