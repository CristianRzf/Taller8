package Solución;

public class Shape {
	int numSides;
	boolean regular;
	Shape(){
		numSides = 3;
		regular = true;
	}
	Shape(int numero, boolean regular){
		numSides = numero;
		this.regular=regular;
	}
	public boolean isRegular() {
		return regular;
	}
	public int getSides() {
		return numSides;
		
	}
	public void setRegular (boolean regular) {
		this.regular = regular;
		
	}

}
