// Multiple inheritance is supported in java via interface

package interface_example; 

public class Mediaplayer implements Audio, Video{

	public void sound() {
		System.out.println("ding dong");
	}
	public void picture() {
		System.out.println("take a picture");
	}
	
	
	public static void main(String[] args) {
	//	Mediaplayer m=new Mediaplayer();
		Video a=new Mediaplayer();
		a.sound();
		a.picture();
	}
}
