
public class Computer_Info {
	public static void main(String[] args) {
		
		Computer c1 = new Computer();
		c1.setCname("Dell");
		c1.setCyear(1900);
		c1.setCcost(15000);
		
		System.out.println("Computer name: " + c1.getCname());
		System.out.println("Computer year: " + c1.getCyear());
		System.out.println("Computer Price: " + c1.getCcost());
	}
}
