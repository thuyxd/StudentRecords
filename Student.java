package Bai3;

public class Student {
	private String fullName;
	private int age;
	private int YOB;
	private String homeTown;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String fullName, int age, int yOB, String homeTown) {
		super();
		this.fullName = fullName;
		this.age = age;
		this.YOB = yOB;
		this.homeTown = homeTown;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getYOB() {
		return YOB;
	}

	public void setYOB(int yOB) {
		YOB = yOB;
	}

	public String getHomeTown() {
		return homeTown;
	}

	public void setHomeTown(String homeTown) {
		this.homeTown = homeTown;
	}

}
