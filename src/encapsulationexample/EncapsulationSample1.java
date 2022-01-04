package encapsulationexample;
/*Hiding internal state and requiring all interaction to be performed through an objects method { getter() & setter()} 
 is called as Data Encapsulation. 
*/
	public class EncapsulationSample1 {
	private String status;
	 void activateSimcard() {
		status="Active";
	}
	public void deactivateSimcard() {
		status="inactive";
	}

	public String getStatus() {
		return status;
	}
}

	