package BookManagementSystem;

 abstract class Person {
 protected int id;
 protected String name;
 
 public Person(int id, String name) {
	 this.id = id;
	 this.name = name;
 }
 abstract void showRole();
 
 
}
