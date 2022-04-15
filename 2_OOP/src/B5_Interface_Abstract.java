interface Runner {
	void start();
	void stop();
}

//  All abstract, default, and static "methods" in an interface are "implicitly public".
//  All "constant" values defined in an interface are "implicitly public, static, and final".
interface Speed{
	double speedometer = 32; // The class implementing the interface does NOT HAVE to define the
	// variable.
	// Thought the variable can be overridden the value of the variable cannot be changed.
	void incSpeed(); // The class implementing the interface MUST define the methods.
	void decSpeed();
	// We can create the reference of the interface, but not make its object.
}

// Defines a "standard" for creating the subclass.
abstract class Human implements Speed, Runner {
	abstract void eat();
	abstract void sleep();
	private void dance(){
		System.out.println("Show 'em the moves.");
	}
}

// Classes assign "package-private" as default access modifier. This is weaker access than public.
// Hence, all interface methods must be implemented as public.
class Robot extends Human{
	
	private final double speedometer;
	
	public Robot(double speedometer){
		this.speedometer=speedometer;
	}
	
	public double getSpeed(){
		return speedometer;
	}
	
	// Interface methods are always public.
	@Override
	public void start() {
		System.out.println("Starting Robot.");
	}
	
	@Override
	public void stop() {
		System.out.println("Stopping Robot.");
	}
	
	@Override
	public void incSpeed() {
		System.out.println("Increasing speed.");
	}
	
	@Override
	public void decSpeed() {
		System.out.println("Decreasing speed.");
	}
	
	@Override
	void eat() {
		System.out.println("Charging Robot.");
	}
	
	@Override
	void sleep() {
		System.out.println("Sleep Robot.");
	}
	
	// A private method can be given higher privileges in the sense of access modifier.
	public void dance(){
		System.out.println("Dancing ROBOT.");
	}
	
	void shoot(){
		System.out.println("Shot laser beams.");
	}
}

public class B5_Interface_Abstract {
	public static void main(String[] args){
		Runner robot1 = new Robot(12);
		robot1.start();
		robot1.stop();
//		ro.bot1.eat(); // Cannot be done.
//		robot1.shoot(); // Cannot be done.
		Robot robot2 = new Robot(30);
		robot2.eat();
		robot2.start();
		robot2.incSpeed();
		robot2.shoot();
		System.out.println("The \"speed\" is :- "+robot2.getSpeed());
		robot2.dance();
//		Human robot3 = new Robot(50);
//		robot3.dance();
	}
}