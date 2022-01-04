package interface_example;
/* if you are not inheriting 2 interfaces (Audio & Video)
and we are trying to call the methods of interfaces (video or audio)by creating object in child implementable class 
by giving reference of video interface, 
then we will get compile time error.*/
public interface Video extends Audio{
	void picture();
	


}
