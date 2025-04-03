package CaseStudy6;

public class Student {
	private String name;
	private String email;
	private Subject[] subjects; 
	private int subjectCount; 
	public Student(String name, String email, int maxSubjects) {
	    this.name = name;
	    this.email = email;
	    this.subjects = new Subject[maxSubjects]; 
	    this.subjectCount = 0; 
	}
	public void addSubject(Subject subject) {
	    if (subjectCount < subjects.length) {
	        subjects[subjectCount++] = subject; 
	    } else {
	        System.out.println("Cannot add more subjects. Maximum limit reached.");
	    }
	}
	public Subject[] getSubjects() {
	    return subjects;
	}
	public int getSubjectCount() {
	    return subjectCount;
	}
	public String getName() {
	    return name;
	}
	public String getEmail() {
	    return email;

		
	}
	
	}
	
	 
	


