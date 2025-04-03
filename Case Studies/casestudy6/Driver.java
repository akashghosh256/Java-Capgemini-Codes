package CaseStudy6;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		  Subject javaSubject = new Subject("Java", 30);
		  Subject pythonSubject = new Subject("Python", 45);
		  Subject cppSubject = new Subject("C++", 60);
		  Subject[] availableSubjects = {javaSubject, pythonSubject, cppSubject};
		  System.out.print("Enter student name: ");
		  String studentName = scanner.nextLine();
		  System.out.print("Enter student email: ");
		  String studentEmail = scanner.nextLine();
		  
		  Student student = new Student(studentName, studentEmail, 10);
	
		  System.out.println("Available Subjects:");
		  for (int i = 0; i < availableSubjects.length; i++) {
		      System.out.println((i + 1) + ". " + availableSubjects[i].getName() + " (" + availableSubjects[i].getDuration() + " days)");
		  }
		
		  System.out.println("Select subjects by entering their number (e.g., 1 for Java). Type -1 to finish:");
		 
		  while (true) {
		      System.out.print("Enter your choice: ");
		      int choice = scanner.nextInt();
		      if (choice == -1) { 
		          break;
		      } else if (choice >= 1 && choice <= availableSubjects.length) { 
		          student.addSubject(availableSubjects[choice - 1]);
		          System.out.println(availableSubjects[choice - 1].getName() + " added.");
		      } else {
		          System.out.println("Invalid choice. Please select a valid subject number.");
		      }
		  }
		  System.out.println("\nStudent Details:");
		  System.out.println("Name: " + student.getName());
		  System.out.println("Email: " + student.getEmail());
		  System.out.println("\nSubjects enrolled:");
		 
		  for (int i = 0; i < student.getSubjectCount(); i++) {
		      Subject subject = student.getSubjects()[i];
		      System.out.println("- " + subject.getName() + " (Duration: " + subject.getDuration() + " days)");
		  }
		  scanner.close();

		
	}

}
