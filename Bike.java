package week1.day1;

public class Bike {

public void driveBike() {
		System.out.println("Drivebike");
}
public void applyBrake()
{
System.out.println("apply brake");
	}
public void Soundhorn()
{System.out.println("Soundhorn");
}
public void isPuncture()
{
	System.out.println("isPuncture");
}
public static void main(String[] args) {
	Bike b= new Bike();
	b.driveBike();
	b.applyBrake();
	b.applyBrake();
	b.isPuncture();
}
			
}