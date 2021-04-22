public enum Monstre {
	BAT,
	SPIDER,
	DOG;
	public static Monstre fromInteger(int y) {
        switch(y) {
        case 1:
            return BAT;
        case 2:
            return SPIDER;
        case 3:
            return DOG;
        }
        return null;
    }
}
