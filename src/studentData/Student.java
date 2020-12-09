package studentData;

public class Student extends Person implements StudentService{
	
	private String fullname;
	private int cardIdentitas;	
	private String domisili;
	
	private String courseName;
	private String lecturer;
	private int sks;
	private String room;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Student(String firstname, String lastname, String domisili, int cardIdentitas) {
		super(firstname, lastname, domisili);
		// TODO Auto-generated constructor stub
		this.fullname = firstname + " " +lastname;
		this.cardIdentitas = cardIdentitas;
		this.domisili = domisili;
	}
	
	

	public Student(String courseName, String lecturer, int sks, String room) {
		super();
		this.courseName = courseName;
		this.lecturer = lecturer;
		this.sks = sks;
		this.room = room;
	}
	
	public String getFullname() {
		return fullname;
	}


	public void setFullname(String fullname) {
		this.fullname = fullname;
	}


	public int getCardIdentitas() {
		return cardIdentitas;
	}


	public void setCardIdentitas(int cardIdentitas) {
		this.cardIdentitas = cardIdentitas;
	}


	public String getCourseName() {
		return courseName;
	}


	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}


	public String getLecturer() {
		return lecturer;
	}


	public void setLecturer(String lecturer) {
		this.lecturer = lecturer;
	}


	public int getSks() {
		return sks;
	}


	public void setSks(int sks) {
		this.sks = sks;
	}


	public String getRoom() {
		return room;
	}


	public void setRoom(String room) {
		this.room = room;
	}


	public String getDomisili() {
		return domisili;
	}


	public void setDomisili(String domisili) {
		this.domisili = domisili;
	}


	@Override
	public void studentRegistration(String fullname, int cardIdentitas, String domisili) {
		// TODO Auto-generated method stub
		System.out.println("Name: "+fullname);
		System.out.println("NIM: "+cardIdentitas);
		System.out.println("Domisili: "+domisili);
	}

	@Override
	public void learningPlan(String courseName, String lecturer, int sks, String room) {
		// TODO Auto-generated method stub
		StudentService.super.learningPlan(courseName, lecturer, sks, room);
	}
	 
}	