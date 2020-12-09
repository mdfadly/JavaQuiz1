package studentData;

public interface StudentService {
	public void studentRegistration(String fullname, int cardIdentitas, String domisili);
	
	default void learningPlan(String courseName, String lecturer, int sks, String room) {
		System.out.println("Course Name: " + courseName);
		System.out.println("Lecturer: " + lecturer);
		System.out.println("Number SKS: " + sks);
		System.out.println("Room Class: " + room);
	}
}
