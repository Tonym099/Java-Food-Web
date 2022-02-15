/**
 * This class represent a Fly object
 * @author Yongqi
 * @version 1
 */
public class Fly {
    private double mass;
    private double speed;

    public static final int DEFAULT_MASS = 5;
    public static final int DEFAULT_SPEED = 10;

    /**
     * Default Fly constructor
     */
    public Fly() {
        this(DEFAULT_MASS, DEFAULT_SPEED);
    }

    /**
     * Constructor can set mass
     * @param initMass sets mass
     */
    public Fly(double initMass) {
        this(initMass, DEFAULT_SPEED);
    }

    /**
     * Advance Fly constructor
     * @param mass sets mass
     * @param speed sets speed
     */
    public Fly(double mass, double speed) {
        this.mass = mass;
        this.speed = speed;
    }

    /**
     * Adds mass and speed
     * @param addMass adds mass
     */
    public void grow(int addMass) {
//        System.out.print("Adding " + addMass + "g to " + mass + "g:");
        mass += addMass;
//        System.out.println(" Mass Now " + mass + "g");

        if (mass < 20) {
//            System.out.println("Adding " + addMass + "m/s to " + speed + "m/s:");
            speed += addMass;
        } else {
//            System.out.println("Subtracting " + (addMass/2.0) + " m/s from " + speed + "m/s:");
            speed -= 0.5 * (mass - 20);
        }
//        System.out.println("Speed now " + speed + "m/s");
    }

    /**
     * Checks if dead
     * @return if dead
     */
    public boolean isDead() {
        boolean noMass = false;
        if (mass == 0) {
//            System.out.println("Dead");
            noMass = true;
        }
        return noMass;
    }

    /**
     * Returns speed and mass
     * @return string
     */
    public String toString() {
        String formatSpeed = String.format("%.2f", speed);
        String formatMass = String.format("%.2f", mass);

        if (isDead()) {
            return "I’m dead, but I used to be a fly with a speed of " + formatSpeed;
        }
        return "I’m a speedy fly with " + formatSpeed + " speed and " + formatMass + " mass.";
    }

    /**
     * get speed
     * @return speed
     */
    public final double getSpeed() {
        return speed;
    }

    /**
     * sets speed
     * @param speed new speed
     */
    public final void setSpeed(double speed) {
        this.speed = speed;
    }

    /**
     * gets mass
     * @return mass
     */
    public final double getMass() {
        return mass;
    }

    /**
     * sets mass
     * @param mass new mass
     */
    public final void setMass(double mass) {
        this.mass = mass;
    }
}