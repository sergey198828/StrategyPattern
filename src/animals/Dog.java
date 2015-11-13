package animals;

import flyability.CantFly;

public class Dog extends Animal {
	
	public Dog(float weight, String name){
		super(weight,name);
		this.flyability=new CantFly();
	}

}
