package Chapter1;

/**
 * Program shows how to find perimeter of circle.
 *
 * @author Donavon Mitchell
 */
public class C1_8 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        double Peri;
        double Area;
        double R = 5.5;
        Peri = (2 * R * 3.14);
        Area = (R * R * 3.14);
        System.out.println("The Perimeter of the Circle is " + Peri + ", and the Area is " + Area);
    }
}
