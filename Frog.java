/**
 * This class represent a Frog object
 * @author Yongqi
 * @version 1
 */
public class Frog {
    private String name;
    private int age;
    private double tongueSpeed;
    private boolean isFroglet;
    private String species = "Rare Pepe";

    public static final int DEFAULT_AGE = 5;
    public static final double DEFAULT_TONGUESPEED = 5;

    /**
     * Advance Frog constructor
     * @param name name of frog
     * @param age age of frog
     * @param tongueSpeed speed of frog
     */
    public Frog(String name, int age, double tongueSpeed) {
        this.name = name;
        this.age = age;
        this.tongueSpeed = tongueSpeed;
        isFroglet = age < 7;
    }

    /**
     * Alternate advance frog constructor
     * @param name name of frog
     * @param ageInYears is converted into age in months of frog
     * @param tongueSpeed speed of frog
     */
    public Frog(String name, double ageInYears, double tongueSpeed) {
        this(name, (int) ageInYears * 12, tongueSpeed);
    }

    /**
     * default constructor
     * @param name name of frog
     */
    public Frog(String name) {
        this(name, DEFAULT_AGE, DEFAULT_TONGUESPEED);
    }

    /**
     * default grow method
     */
    public void grow() {
        grow(1);
    }

    /**
     * Advance method, increase age and increase/decrease speed depending on age
     * @param addAge increase age
     */
    public void grow(int addAge) {
//        System.out.print("Adding " + addAge + " months to " + age + " months:");
        age += addAge;
//        System.out.println(" Age Now " + age + " months");

        if (age < 12) {
//            System.out.println("Adding " + addAge + "m/s to " + tongeSpeed + "m/s:");
            tongueSpeed += addAge;
        } else if (age > 30) {
//            System.out.println("Subtracting " + (age-30) + " m/s from " + tongeSpeed + "m/s:");
            if (tongueSpeed - (age - 30) < 5) {
                tongueSpeed = 5;
            } else {
                tongueSpeed -= age - 30;
            }
        }
//        System.out.println("Speed now " + tongeSpeed + "m/s");
    }

    /**
     * Eats and kills a fly object
     * @param fly fly object to be eaten
     */
    public void eat(Fly fly) {
        if (!fly.isDead()) {
            if (fly.getSpeed() > tongueSpeed) {
                if (fly.getMass() >= (0.5 * age)) {
                    grow();
                }
                fly.setMass(0);
            } else {
                fly.grow(1);
            }
        }
    }

    /**
     * Convert data into string
     * @return a string
     */
    public String toString() {
        String formatAge = String.format("%.2f", (float) age);
        String formatTongueSpeed = String.format("%.2f", tongueSpeed);

        if (isFroglet) {
            return "My name is " + name + " and I’m a rare froglet! I’m " + formatAge
                    + " months old and my tongue has a speed of " + formatTongueSpeed + ".";
        }
        return "My name is " + name + " and I’m a rare frog. I’m " + formatAge
                + " months old and my tongue has a speed of " + formatTongueSpeed + ".";
    }

    /**
     * get species
     * @return species
     */
    public final String getSpecies() {
        return species;
    }

    /**
     * set species
     * @param species set new species of frog
     */
    public final void setSpecies(String species) {
        this.species = species;
    }
}
