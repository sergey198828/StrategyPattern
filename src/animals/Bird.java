package animals;

import flyability.CanFly;

public class Bird extends Animal {
	
	public Bird(float weight, String name){
		super(weight,name);
		this.flyability=new CanFly();
	}

}
