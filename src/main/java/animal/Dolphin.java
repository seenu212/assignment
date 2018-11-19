package animal;

public class Dolphin extends AquaticAnimal {
	
	@Override
	public String swim() {
		super.swim();
		return (super.swim() + "I am a great Swimmer");
	}

}
