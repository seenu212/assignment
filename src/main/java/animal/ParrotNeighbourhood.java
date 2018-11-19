package animal;

public interface ParrotNeighbourhood {

	String speakNative();

	ParrotNeighbourhood catNeighbourhood = new ParrotNeighbourhood() {
		public String speakNative() {
			return Constants.CAT_SOUND;
		}
	};
	ParrotNeighbourhood dogNeighbourhood = new ParrotNeighbourhood() {
		public String speakNative() {
			return Constants.DOG_SOUND;
		}
	};
	ParrotNeighbourhood roosterNeighbourhood = new ParrotNeighbourhood() {
		public String speakNative() {
			return Constants.ROOSTER_SOUND;
		}
	};
	
	
}
