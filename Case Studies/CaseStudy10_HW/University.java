package CaseStudy10_HW;

public class University {
    private Person[] person;
    private int countPerson;

    public University(int countPeople) {
        this.person = new Person[countPeople];
        this.countPerson = 0;
    }

    public Person[] getPerson() {
        return person;
    }

    public void setPerson(Person[] person) {
        this.person = person;
    }

    public int getCountPerson() {
        return countPerson;
    }

    public void setCountPerson(int countPerson) {
        this.countPerson = countPerson;
    }

    public void addPerson(Person p) { 
        if (countPerson < this.person.length) {
            this.person[countPerson] = p;
            countPerson++; 
        } else {
            System.out.println("It's full!");
        }
    }
    
    public void showPerson() {
        System.out.println("People in the university:");
        if (countPerson == 0) {
            System.out.println("No people available.");
        } else {
            for (int i = 0; i < countPerson; i++) {
                person[i].displayInfo(); 
                }
        }
    }

}
