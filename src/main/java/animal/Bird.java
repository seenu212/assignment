package animal;

class Bird implements Animal {
	public String walk() {
		
		return Constants.WALK;
	}
	 public String fly() {
	 return Constants.FLY;
	 }
	 
	 public String sing()
	 {
		 return Constants.GENERIC_SOUND;
		 
	 }
	 public String swim() {
		//subclass will implement
		return null;
	}
	}
