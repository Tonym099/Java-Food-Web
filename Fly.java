/**
 * This class represent a Fly object
 * @author Yongqi
 * @version 1
 */
public class Fly {
    private double mass;
    private double speed;

    private static final int DEFAULT_MASS = 5;
    private static final int DEFAULT_SPEED = 10;

    /**
     * Default Fly constructor
     */
    public Fly() {
        this(DEFAULT_MASS, DEFAULT_SPEED);
    }

    /**
     * Can set mass
     * @param mass number
     */
    public Fly(double mass) {
        this(mass, DEFAULT_SPEED);
    }

    /**
     * Advance Fly constructor
     * @param mass first number
     * @param speed second number
     */
    public Fly(double mass, double speed) {
        this.mass = mass;
        this.speed = speed;
    }

    /**
     * Adds mass and speed
     * @param addMass number
     */
    public void grow(int addMass) {
        while (addMass > 0) {
            if (mass < 20) {
                speed++;
            }
            if (mass >= 20) {
                speed -= 0.5;
            }
            mass++;
            addMass--;
        }
    }

    /**
     * Checks if dead
     * @return boolean
     */
    public boolean isDead() {
        return mass == 0;
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
     * @return double
     */
    public final double getSpeed() {
        return speed;
    }

    /**
     * sets speed
     * @param speed number
     */
    public final void setSpeed(double speed) {
        this.speed = speed;
    }

    /**
     * gets mass
     * @return number
     */
    public final double getMass() {
        return mass;
    }

    /**
     * sets mass
     * @param mass number
     */
    public final void setMass(double mass) {
        this.mass = mass;
    }

}