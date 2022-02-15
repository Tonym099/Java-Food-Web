/*
In order to help learn course concepts, I consulted related material that can be found at
stackoverflow.com, w3schools.com, geeksforgeeks.org
 */

/**
 * Driver for Fly and Frog objects
 * @author Yongqi
 * @version 1
 */
public class Pond {
    /**
     * main method
     * @param args lines
     */
    public static void main(String[] args) {
        Frog frog1 = new Frog("Peepo");
        Frog frog2 = new Frog("Pepe", 10, 15);
        Frog frog3 = new Frog("Peepaw", 4.6, 5);
        Frog frog4 = new Frog("PersonalFrog", 20, 10);

        Fly fly1 = new Fly(1, 3);
        Fly fly2 = new Fly(6);
        Fly fly3 = new Fly();

//        Object[] arr = new Object[7];
//        arr[0] = frog1;
//        arr[1] = frog2;
//        arr[2] = frog3;
//        arr[3] = frog4;
//        arr[4] = fly1;
//        arr[5] = fly2;
//        arr[6] = fly3;
//
//        for (Object o : arr) {
//            System.out.println(o);
//        }

        frog1.setSpecies("1331 Frogs");
        System.out.println(frog1);
        frog1.eat(fly2);
        System.out.println(fly2);
        frog1.grow(8);
        frog1.eat(fly2);
        System.out.println(fly2);
        System.out.println(frog4);
        frog3.grow(3);
        System.out.println(frog3);
        System.out.println(frog2);

    }
}
