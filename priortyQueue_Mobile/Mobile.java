package priortyQueue_Mobile;

public class Mobile {
private String brand;
private String model;
private  double  price;


public void setBrand(String brand) {
	this.brand = brand;
}

public String getBrand() {
	return brand;
}

public void setmodel(String model) {
	this.model = model;
}

public String getModel() {
	return model;
}
 public  Mobile(String brand, String model, double price) {
	 this.brand = brand;
	 this.model = model;
	 this.price = price;
 }

}
