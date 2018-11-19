package animal;

public class Parrot extends Bird {
	
	private ParrotNeighbourhood neighbour;
	
	@Override
	 public String sing()
	 {
		if (this.neighbour !=  null)
		return this.neighbour.speakNative();
		else
			return Constants.PARROT_SOUND;
		 
	 }

	public ParrotNeighbourhood getNeighbour() {
		return neighbour;
	}

	public void setNeighbour(ParrotNeighbourhood neighbour) {
		this.neighbour = neighbour;
	}
	

}
