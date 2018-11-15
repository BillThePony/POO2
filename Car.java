package oui;
public class Car extends Vehicule {
	
	public Car(String brand, int kilometers) {
		super(brand, kilometers);
	}
	


	public String doStuff() {
		 return ("Je suis une " + this.brand + " et je fais vroum vroum !");
	}
}
