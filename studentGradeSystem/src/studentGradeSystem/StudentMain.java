package studentGradeSystem;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		Student stu = new Student();
		
		System.out.println("Welcome to Student Grading System!");
		System.out.println("");
		
		System.out.println("Please enter your  username: ");
		String user = sc.nextLine();
		
		while(true) {
			System.out.println("");
			System.out.println("Please choose the options from below: ");
			System.out.println("");
			
			System.out.println("1. Add Student and grades: ");
			System.out.println("2. Update Student and grades: ");
			System.out.println("3. View Student and grades: ");
			System.out.println("4. View all Students and grades: ");
			System.out.println("5. Calculate average grade for student: ");
			System.out.println("6. Exit");
			
			try {
				int choice = sc.nextInt();
				
				switch(choice) {
					
				case 1: 
					stu.Add();
					break;
				
				case 2:
					stu.Update();
					break;
				
				case 3:
					stu.View();
					break;
				
				case 4:
					stu.ViewAll();
					break;
				
				case 5:
					stu.Average();
					break;
					
				case 6:
					System.exit(0);
					break;
				
				default:
					System.out.println("Wrong Choice, choose between 1-6: ");
					break;		
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Invalid Input. Please enter a valid number between 1-6: ");
				sc.nextLine();
			}
		}
		
	}

}
