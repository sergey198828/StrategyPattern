import animals.*;
import flyability.*;

public class Main {
	public static void main(String[] args){
		Animal kitty = new Bird(10, "Kitty");
		Animal jasper = new Dog(50,"Jasper");
		System.out.println(kitty.whatIsYourName());
		kitty.tryFly();
		System.out.println(jasper.whatIsYourName());
		jasper.tryFly();
		jasper.setFlyability(new CanFly());
		System.out.println(jasper.whatIsYourName());
		jasper.tryFly();
	}

}
