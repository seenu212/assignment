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
		public String swim() {
			// TODO Auto-generated method stub
			return null;
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
		public String swim() {
			// TODO Auto-generated method stub
			return null;
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
	public String swim() {
		// TODO Auto-generated method stub
		return null;
	}
	
	void transform() {this.stage = new ButterflyStage();}
}
