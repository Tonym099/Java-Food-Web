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
    private static String species = "Rare Pepe";

    private static final int DEFAULT_AGE = 5;
    private static final double DEFAULT_TONGUESPEED = 5;

    /**
     * Advance Frog constructor
     * @param name string
     * @param age number
     * @param tongueSpeed number
     */
    public Frog(String name, int age, double tongueSpeed) {
        this.name = name;
        this.age = age;
        this.tongueSpeed = tongueSpeed;
        isFroglet = age < 7 && age > 1;
    }

    /**
     * Alternate advance frog constructor
     * @param name string
     * @param ageInYears number
     * @param tongueSpeed number
     */
    public Frog(String name, double ageInYears, double tongueSpeed) {
        this(name, (int) ageInYears * 12, tongueSpeed);
    }

    /**
     * default constructor
     * @param name string
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
     * @param addAge number
     */
    public void grow(int addAge) {
        while (addAge > 0) {
            if (age < 12) {
                tongueSpeed++;
            }
            if (age >= 30) {
                tongueSpeed -= 0.5;
            }
            age++;
            addAge--;
        }
        isFroglet = age < 7 && age > 1;
    }

    /**
     * Eats and kills a fly object
     * @param fly Fly object to be eaten
     */
    public void eat(Fly fly) {
        if (!fly.isDead()) {
            if (fly.getSpeed() < tongueSpeed) {
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
        Frog.species = species;
    }
}
