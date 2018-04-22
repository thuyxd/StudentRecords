package Bai3;

import java.util.Scanner;

public class Manage {
	public static void main(String[] args) {
		int choose, numberStudent, number;
		Scanner sc = new Scanner(System.in);
		Manage manage = new Manage();
		StudentRecord studentRecord = null;
		StudentRecord[] studentRecords = null;
		StudentRecord[] studentRecords2 = null;
		do {
			manage.Menu();
			System.out.println("Choose:  ");
			choose = sc.nextInt();
			switch (choose) {
			case 1: {
				System.out.println("Enter the number of classes");
				number = sc.nextInt();
				if (number > 0) {
					studentRecords2 = manage.studentRecords(studentRecords, number);
				} else {
					System.out.println("Please enter again");
				}
				break;
			}		
			case 2: {
				if (studentRecords2 != null) {
					System.out.println("STUDENT INFORMATION");
					manage.showStudentRecord(studentRecords2);
				}	

			}
			case 3: {
				if (studentRecords2 != null) {
					studentRecord = manage.counStudent(studentRecords2, 2002, "Hà Nội");
				}
				break;
			}
			case 0:
				System.exit(0);
			default:
				break;
			}
		} while (choose != 0);

	}

	private void Menu() {
		System.out.println("Option 1: Enter student profiles ");
		System.out.println("Option 2: Display student profiles");
		System.out.println("Option 3: Count the number of students born in 2002 and come from Hanoi ");
		System.out.println("Option 0: Exit");
	}
	private StudentRecord  counStudent(StudentRecord[] studentRecords, int YOB, String homeTown) {
		Student[] students = null;
		int count = 0;
		for (StudentRecord studentRecord : studentRecords) {
			students = studentRecord.getStudentList();
			if(students != null) {
				for (Student student : students) {
					if(homeTown.equalsIgnoreCase(student.getHomeTown()) && YOB == student.getYOB()) {
						count++;
					}
						
				}
			}
		}
		System.out.println(" The number of students born in 2002 and come from Hanoi: "+count);
		return null;
		
	}

	private Student student() {
		Student student = new Student();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter FullName: ");
		student.setFullName(s.nextLine());
		System.out.println("Enter Age: ");
		student.setAge(Integer.parseInt(s.nextLine()));
		System.out.println("Enter Year of Birth: ");
		student.setYOB(Integer.parseInt(s.nextLine()));
		System.out.println("Enter Home town: ");
		student.setHomeTown(s.nextLine());
		return student;
	}

	private void showStudent(Student student) {
		System.out.println("\tFullName: " + student.getFullName());
		System.out.println("\tAge: " + student.getAge());
		System.out.println("\tYear of Birth: " + student.getYOB());
		System.out.println("\tHome town: " + student.getHomeTown());
	}

	private Student[] student(Student[] students, int numberStudent) {
		int i = 0;
		students = new Student[numberStudent];
		for (int j = 0; j < students.length; j++) {
			System.out.println("Enter the student's personal information " + (++i));
			students[j] = this.student();
		}
		return students;
	}

	private void showStudents(Student[] students) {
		int i = 0;
		for (Student student : students) {
			System.out.println("Student's personal information " + (++i));
			this.showStudent(student);
		}
	}

	private StudentRecord studentRecord() {
		int numberStudent;
		StudentRecord studentRecords = new StudentRecord();
		Student sRecords = null;
		Scanner sc = new Scanner(System.in);
		Student[] students = null;
		Student[] students2 = null;
		System.out.println("Enter class: ");
		studentRecords.setClasss(sc.nextLine());
		System.out.println("Enter course: ");
		studentRecords.setCourse(sc.nextLine());
		System.out.println("Enter semester:");
		studentRecords.setSemester(sc.nextLine());
		System.out.println("Enter the student number: ");
		numberStudent = Integer.parseInt(sc.nextLine());
		studentRecords.setNumberStudent(numberStudent);
		students2 = this.student(students2, numberStudent);
		studentRecords.setStudentList(students2);

		return studentRecords;
	}

	private void showStudentRecord(StudentRecord[] studentRecords) {
		for (StudentRecord studentRecord : studentRecords) {
			System.out.println("\tClass: " + studentRecord.getClasss());
			System.out.println("\tCourse: " + studentRecord.getCourse());
			System.out.println("\tSemester: " + studentRecord.getSemester());
			this.showStudents(studentRecord.getStudentList());
			System.out.println("*******************************");
		}
	}

	private StudentRecord[] studentRecords(StudentRecord[] studentRecords, int number) {
		studentRecords = new StudentRecord[number];
		for (int i = 0; i < studentRecords.length; i++) {
			studentRecords[i] = this.studentRecord();
		}
		return studentRecords;
	}

}
