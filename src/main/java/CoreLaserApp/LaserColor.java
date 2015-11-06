package CoreLaserApp;

/**
 * Created by cain on 11/6/15.
 */
public enum LaserColor {
    BLUE450,
    BLUE473,
    GREEN532,
    YELLOW589,
    RED633;

    @Override
    public String toString() {
        switch (this) {
            case BLUE450:
                return "Blue 450 nm";
            case BLUE473:
                return "Blue 473 nm";
            case GREEN532:
                return "Green 532 nm";
            case YELLOW589:
                return "Yellow 589 nm";
            case RED633:
                return "Red 633 nm";
            default:
                throw new IllegalArgumentException();
        }
    }

}
