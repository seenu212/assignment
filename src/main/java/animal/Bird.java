package animal;

class Bird implements Animal {
	public String walk() {
		
		return Constants.WALK;
	}
	 public String fly() {
	 return ("I am flying");
	 }
	 
	 public String sing()
	 {
		 return Constants.GENERIC_SOUND;
		 
	 }
	}
