public enum Spec {
    WARIOR,
    ARCHER;

    public static Spec fromInteger(int x) {
        switch(x) {
        case 0:
            return WARIOR;
        case 1:
            return ARCHER;
        }
        return null;
    }
}
