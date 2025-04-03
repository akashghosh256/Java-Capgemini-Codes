package CaseStudy10_HW;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        University university = new University(3); 
        
        System.out.println("Enter 1 to add students, 2 to add professors:");
        int choice = sc.nextInt();
        
        Person p1 = null;
        Person p2 = null;
        Person p3 = null;
        switch (choice) {
            case 1: {
               
                p1 = new Student("Kanishka", 12, 100);
                p2 = new Student("Lanishka", 22, 200);
                p3 = new Student("Tanishka", 32, 300);
                university.addPerson(p1);
                university.addPerson(p2);
                university.addPerson(p3);
                university.showPerson();
                break;
            }
            case 2: {
               
                p1 = new Professor("Fanishka", 40, "Java");
                p2 = new Professor("Hanishka", 50, "Lava");
                p3 = new Professor("Panishka", 60, "Oava");
                university.addPerson(p1);
                university.addPerson(p2);
                university.addPerson(p3); 
                university.showPerson();
                break;
            }
            default: {
                System.out.println("Invalid choice.");
            }
        }

        sc.close(); 
    }
}
