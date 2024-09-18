import java.util.Scanner;

/**
 * Skill Builder 0
 *
 * @author (You)
 * @version (2.1, 2.2)
 */
public class SkillBuilder1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What's your name?");
        String userStr = input.nextLine();
        System.out.println("Enter a floating-point number:");
        float spice =input.nextFloat();

        double sum = 4.0/3;
        double power = Math.sqrt(5)/Math.pow(spice, 3);
        sum = sum * Math.pow(2,power);
        double roundSum = (int)(sum*100) /100.0;


        System.out.println("Well " +userStr + "," + " the spice value resulted in " + sum  );
        System.out.println("And the converted value is" + roundSum);

    }

    public static void calcWallPaint() {
        Scanner input = new Scanner(System.in);

        final double squareFeetPerGallons = 350.0;
        final double gallonsPerCan = 1.0;

        // Prompt user to input wall's width
        System.out.println("Enter wall height (feet):");
        double wallHeight = input.nextDouble();

        // Prompt user to input wall's width
        System.out.println("Enter wall width (feet):");
        double wallWidth = input.nextDouble();

        // TODO: Calculate and output the wall's area
        double area = wallHeight * wallWidth;
        System.out.println("Wall area: " + area + " square feet");

        // TODO: Calculate and output the amount of paint in gallons needed to paint the wall
        //Assume a gallon of paint covers 350 square feet.
        double gallon = 350.0;
        double paint = area / gallon;
        System.out.println("Paint needed: " + paint + " gallons");

        // TODO: Calculate and output the number of 1 gallon cans needed to paint the wall, rounded up to nearest integer

        double cans = (double) Math.ceil(paint);

        System.out.println("Cans needed: " + cans + " can(s)");
    }
}
