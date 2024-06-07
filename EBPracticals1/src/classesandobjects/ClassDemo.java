package classesandobjects;

class vehicle
{
	// instance variables
	int model;
	String Vehicle_name;
	
	//methods
	public void setVehicle()
	{
		model=2021;
		Vehicle_name="Hyndai i20";
	}
	public void showVehicle()
	{
		System.out.println("Car Model: " +model);
		System.out.println("Car Name: " +Vehicle_name);
	}
}
public class ClassDemo {

	public static void main(String[] args) {
		
			//creating a reference object to the class
			vehicle car = new vehicle();
			vehicle tractor = new vehicle();
			
			car.setVehicle();
			car.showVehicle();
			
			tractor.setVehicle();
			tractor.showVehicle();
	}

}
