package staticDemo;

class vehicle
{
	//Static instance variable
	public static String cmpy = "Hyundai";
	private int model;
	private String vname;
	
	public int getModel() {
		return model;
	}
	public void setModel(int model) {
		this.model = model;
	}
	public String getVname() {
		return vname;
	}
	public void setVname(String vname) {
		this.vname = vname;
	}
}

public class StaicExample {

	public static void main(String[] args) {
		
		vehicle xcent = new vehicle();
		vehicle verna = new vehicle();
		vehicle creta = new vehicle();
		
		vehicle.cmpy = "BMW"; // Static members can invoke using the classname
		
		xcent.setModel(2021);
		xcent.setVname("Xcent");
		
		verna.setModel(2023);
		verna.setVname("Verna");
		
		creta.setModel(2024);
		creta.setVname("Creta");
		
		System.out.println("Company: " + vehicle.cmpy + " || " + "Model: " + xcent.getModel() + " || " + "Vehicle name: " + xcent.getVname());
		System.out.println("Company: " + vehicle.cmpy + " || " + "Model: " + verna.getModel() + " || " + "Vehicle name: " + verna.getVname());
		System.out.println("Company: " + vehicle.cmpy + " || " + "Model: " + creta.getModel() + " || " + "Vehicle name: " + creta.getVname());
	}

}
