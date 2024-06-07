package classesandobjects;

class vehiclee
{
	int speed,model;
	String vname,color;
	
	public void setVal(int s, int m, String name, String c)
	{
		speed=s;
		model=m;
		vname=name;
		color=c;
	}
	public void run()
	{
		System.out.println("The " + vname + " is running");
		System.out.println("speed is " + speed);
		System.out.println("Name of the " + vname + " and model is  " + model);
		System.out.println("The color is " +color);
		
	}
	public void stop()
	{
		System.out.println("The " +vname + " is stopped");
		System.out.println(".................................................");
	}
}
public class ClassDemo1 {

	public static void main(String[] args) {
			
			vehiclee car = new vehiclee();
			vehiclee SUV = new vehiclee();
			vehiclee jeep = new vehiclee();
			
			car.setVal(200,	2021, "i20", "RED");
			car.run();
			car.stop();
			
			SUV.setVal(300, 2023, "BMW", "White");
			SUV.run();
			SUV.stop();
			
			jeep.setVal(350, 2022, "Jeep", "Blue");
			jeep.run();
			jeep.stop();

	}

}
