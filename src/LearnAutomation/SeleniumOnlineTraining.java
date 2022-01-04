package LearnAutomation;

public class SeleniumOnlineTraining {
	String TrainerName="Mukesh";
	public void seleniumTraining () {
		String price="200 USD";
		System.out.println("Welcome to Online Training Program	");
		System.out.println("Thank you showing interest in training program");
		System.out.println("Selenium Training charges are " +price + " and Trainer name is " +TrainerName);
		System.out.println();
	}
	
	public void DevopsTraining () {
		String price="300 USD";
		System.out.println("Welcome to Online Training Program	");
		System.out.println("Thank you showing interest in training program");
		System.out.println("DevOps Training charges are " +price +" and Trainer name is " +TrainerName);
		System.out.println();
	}
	public void jmeterTraining () {
		String price="400 USD";
		System.out.println("Welcome to Online Training Program	");
		System.out.println("Thank you showing interest in training program");
		System.out.println("Jmeter Training charges are " +price +" and Trainer name is " +TrainerName);
		System.out.println();
	}
	public static void main(String[] args) {
	SeleniumOnlineTraining sot=new SeleniumOnlineTraining();
	sot.seleniumTraining();
	sot.DevopsTraining();
	sot.jmeterTraining();
}
}
