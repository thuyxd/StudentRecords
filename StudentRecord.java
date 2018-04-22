package Bai3;

public class StudentRecord {
	private String Classs;
	private String course;
	private String semester;
	private int numberStudent;
	private Student[] studentList;
	public StudentRecord() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentRecord(String classs, String course, String semester, int numberStudent, Student[] studentList) {
		super();
		Classs = classs;
		this.course = course;
		this.semester = semester;
		this.numberStudent = numberStudent;
		this.studentList = studentList;
	}
	public String getClasss() {
		return Classs;
	}
	public void setClasss(String classs) {
		Classs = classs;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getSemester() {
		return semester;
	}
	public void setSemester(String semester) {
		this.semester = semester;
	}
	public int getNumberStudent() {
		return numberStudent;
	}
	public void setNumberStudent(int numberStudent) {
		this.numberStudent = numberStudent;
	}
	public Student[] getStudentList() {
		return studentList;
	}
	public void setStudentList(Student[] studentList) {
		this.studentList = studentList;
	}
	
	
}
