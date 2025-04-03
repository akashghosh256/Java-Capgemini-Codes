package AllString;

public class Student {

    private int id;
    private String name;
    private double percentage;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPercentage() {
        return percentage;
    }

    Student(int id, String name, double percentage) {
        this.id = id;
        this.name = name;
        this.percentage = percentage;
    }

    @Override
    public String toString() {
        return "Student " + this.name + "," + this.id + "," + this.percentage;
    }

    @Override
    public boolean equals(Object obj) {
    	Student demo = (Student)obj;
    	if(this.name.equalsIgnoreCase(demo.name)) return true;
    	else return false;
    }

    @Override
    public int hashCode() {
        return name.toLowerCase().hashCode();  // Case-insensitive hash code
    }

    public static void main(String[] args) {
        Student s1 = new Student(67, "WE", 88.06);
        Student s2 = new Student(67, "WE", 88.06);

        System.out.println(s1.toString());
        System.out.println(s2.toString());

        System.out.println(s1.equals(s2));  // Should return true

        // Demonstrating hashCode consistency
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode()); // Should be the same if equals() returns true
    }
}
