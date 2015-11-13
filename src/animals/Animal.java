package animals;
import flyability.*;

public abstract class Animal {
	protected float weight;
	protected String name;
	protected Fly flyability;

	public Animal(float weight, String name){
		this.weight=weight;
		this.name=name;
	}
	
	public float getWeight(){
		return this.weight;
	}
	
	public void setWeight(float weight){
		this.weight =weight;
	}
	
	public String whatIsYourName(){
		return this.name;
	}
	
	public void setName(String name){
		this.name=name;
	}
	
	public void setFlyability(Fly flyability){
		this.flyability=flyability;
	}
	
	public void tryFly(){
		System.out.println(this.flyability.fly());
	}
}
