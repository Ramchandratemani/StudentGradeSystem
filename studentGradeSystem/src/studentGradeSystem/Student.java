package studentGradeSystem;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Student {

	private HashMap<String, Grade> sdetails;
	Scanner sc;
	String sname, sname1;
	
	public Student() {
		this.sdetails = new HashMap<>();
		this.sc = new Scanner(System.in);
	}
	
	public void Add() {
		
		 System.out.println("");
		 System.out.println("Please Enter Student name: ");
		 sname1 = sc.nextLine();
		 
		 sname = sname1.toUpperCase();
		 
		 System.out.println("Please enter Maths grade: ");
		 int mathsgrade = sc.nextInt();
		 
		 if(mathsgrade < 0 || mathsgrade > 100) {
			 System.out.println("Please Enter Correct Marks between 0 - 100");
			 mathsgrade = sc.nextInt();
		 }
		 
		 System.out.println("Please enter Science grade: ");
		 int sciencegrade = sc.nextInt();
		 
		 if(sciencegrade < 0 || sciencegrade > 100) {
			 System.out.println("Please Enter Correct Marks between 0 - 100");
			 sciencegrade = sc.nextInt();
		 }
		 
		 System.out.println("Please enter English grade: ");
		 int englishgrade = sc.nextInt();
		 
		 if(englishgrade < 0 || englishgrade > 100) {
			 System.out.println("Please Enter Correct Marks between 0 - 100");
			 englishgrade = sc.nextInt();
		 }
		 
		 System.out.println("Data added successfully!!");
		 sc.nextLine();
		 
		 Grade newgrade = new Grade(mathsgrade, sciencegrade, englishgrade);
		 sdetails.put(sname, newgrade);
	}

	public void Update() {
		
		System.out.println("");
		System.out.println("Please enter the student name to update: ");
		sname1 = sc.nextLine();	
		sname = sname1.toUpperCase();
		
		if(sdetails.containsKey(sname)) {
			
			 System.out.println("Please enter updated Maths grade: ");
			 int mathsgrade = sc.nextInt();
			 
			 if(mathsgrade < 0 || mathsgrade > 100) {
				 System.out.println("Please Enter Correct Marks between 0 - 100");
				 mathsgrade = sc.nextInt();
			 }
			 
			 System.out.println("Please enter updated Science grade: ");
			 int sciencegrade = sc.nextInt();
			 
			 if(sciencegrade < 0 || sciencegrade > 100) {
				 System.out.println("Please Enter Correct Marks between 0 - 100");
				 sciencegrade = sc.nextInt();
			 }
			 
			 System.out.println("Please enter updated English grade: ");
			 int englishgrade = sc.nextInt();
			 
			 if(englishgrade < 0 || englishgrade > 100) {
				 System.out.println("Please Enter Correct Marks between 0 - 100");
				 englishgrade = sc.nextInt();
			 }
			 
			Grade newgrade = new Grade(mathsgrade, sciencegrade, englishgrade);
			
			sdetails.replace(sname, newgrade);
			
			Grade  a = sdetails.get(sname);
			System.out.println("");
			System.out.println("Updated deatils: ");
			System.out.println("");
			System.out.println("Student: " + sname + " : " + a);
		}
		else {
			System.out.println("");
			System.out.println("Student name was not found!!!");
		}
	}

	public void View() {
		
		System.out.println("");
		System.out.println("Please enter the student name: ");
		sname1 = sc.nextLine();	
		sname = sname1.toUpperCase();

		
		if(sdetails.containsKey(sname)) {
			Grade  a = sdetails.get(sname);
			System.out.println("Student: " + sname + " : " + a);
		}
		else {
			System.out.println("");
			System.out.println("Student details not found!!");
		}
	}

	public void ViewAll() {
		
		System.out.println("");
		System.out.println("Students records: ");
		for(Map.Entry<String, Grade> entry: sdetails.entrySet()) {
			System.out.println("Student: " + entry.getKey() + " : " + entry.getValue());
		}
		
	}

	public void Average() {
		
		System.out.println("");
		System.out.println("Calculate Average for every student: ");
		System.out.println("");
		System.out.println("Students records: ");
		
		if(sdetails.isEmpty()) {
			System.out.println("No student records found!");
		}
		else {
			for(Map.Entry<String, Grade> entry: sdetails.entrySet()) {
				String studentname = entry.getKey();
				Grade grade = entry.getValue();
				
				int totalMarks = grade.getEnglishgrade() + grade.getMathgrade() + grade.getSciencegrade();
				double average = totalMarks / 3.0;
				
				System.out.println("Student: " + studentname + " has an average of  " + average);
			}
		}
		
		
	}

}
