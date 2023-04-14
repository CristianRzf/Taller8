package Solución;

public class Student {
	String nombre;
	int credits, qualityPoints;
	double gpa;

	Student(String nombre, int credits, int qualityPoints) {
		this.nombre = nombre;
		this.credits = credits;
		this.qualityPoints = qualityPoints;
		gpa = (double) qualityPoints / (double) credits;
	}

	public double getGPA() {
		return gpa;
	}

	public Student(int credits, int qualityPoints) {
		this.credits += credits;
		this.qualityPoints += qualityPoints;
		gpa = (double) qualityPoints / (double) credits;
	}

	Student Mary = new Student("Mary Jones", 14, 46);
	Student John = new Student("Mary Jones", 60, 173);
	Student Ari = new Student("Mary Jones", 31, 69);
	
	ari.addCredits(13,52);

}
