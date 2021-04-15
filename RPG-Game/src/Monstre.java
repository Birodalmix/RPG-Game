public enum Monstre {
	BAT,
	SPIDER,
	DOG;
	public static Monstre fromInteger(int y) {
        switch(y) {
        case 0:
            return BAT;
        case 1:
            return SPIDER;
        case 3:
            return DOG;
        }
        return null;
    }
}
