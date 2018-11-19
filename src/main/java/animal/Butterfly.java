package animal;

public class Butterfly implements Animal{
	
	private class CaterpillarStage implements Animal
	{
		public String fly() {
			return null;//cannot fly
		}
		public String walk() {
			// 
			return Constants.WALK;
		}
		public String sing() {
			return "Insect Sound";//can sound
		}
	}
	
	private class ButterflyStage implements Animal
	{
		public String fly() {
			return Constants.FLY;//cannot fly
		}
		public String walk() {
			// 
			return Constants.WALK;
		}
		public String sing() {
			return null;//cannot sound
		}
		
	}
	
	
	private Animal stage = new CaterpillarStage();
	public String fly() {
		return this.stage.fly();
	}
	public String walk() {
		// 
		return this.stage.walk();
	}
	
	public String sing()
	{
		return this.stage.sing();
	}
	void transform() {this.stage = new ButterflyStage();}
}
