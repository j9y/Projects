package StudentDatabase;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses = null;
	private int tuitionBalance = 0;
	private static int costOfCourse = 600;
	private static int id = 1000;
	
	// Constructor: prompt user to enter student's name and year
	public Student () {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter student name first name: ");
		this.firstName = input.nextLine();
		
		System.out.println("Enter student name last name: ");
		this.lastName = input.nextLine();
		
		System.out.println("1- Freshmen\n2- Sophmore\n3 - Junior\n4 - Senior \nEnter student class level: ");
		this.gradeYear = input.nextInt();
		
		setStudentID();
		
		System.out.println(firstName+ " "+lastName+ " "+gradeYear+" "+studentID);
		
		
	
	}
	
	// Generate an ID
	private void setStudentID() {
		// Grade level + ID
		id++;
		this.studentID = gradeYear + "" +id;
	}
	
	// Enroll in courses
	public void enroll() {
		// Get inside a loop, user hits 0
		do {
			System.out.print("Enter course to enroll (Q to quit): ");
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();
			if (!course.equalsIgnoreCase("Q")) {
				courses = courses + "\n" + course;
				tuitionBalance = tuitionBalance + costOfCourse;
			}
			else {

				break;
				}
		}while (1 != 0);
		
		System.out.println("ENROLLED IN: "+courses);
	}
	
	// View balance 
	public void viewBalance() {
		System.out.println("Your balance is: $" +tuitionBalance);
	}
	
	// Pay tuition
	public void payTuition() {
		viewBalance();
		System.out.print("Please enter your payment: $");
		Scanner in = new Scanner (System.in);
		int payment = in.nextInt();
		tuitionBalance = tuitionBalance - payment;
		System.out.println("Thank you for your payment of $"+payment);
		viewBalance();
	}
	
	// Show status
	public String showInfo() {
		return "Name: " +firstName+" "+lastName+
				"\nCourses Enrolled: "+courses+
				"\nBalance: $"+tuitionBalance;
	}

}
