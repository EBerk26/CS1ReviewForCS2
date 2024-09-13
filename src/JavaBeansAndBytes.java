import java.util.Random;

/**
 * CS2 Review Assignment!
 * Do NOT use ChatGPT or any other generative AI to assist you with this assignment
 * You may reference your own past work and the internet (not including AI)
 */

public class JavaBeansAndBytes {

    // Variables for the CoffeeShop
    String name;
    boolean isOpen;
    int yearFounded;

    public static void main(String[] args) {
        // Create a new CoffeeShop instance to run everything.
        JavaBeansAndBytes cafe = new JavaBeansAndBytes();
    }

    // Constructor for CoffeeShop
    public JavaBeansAndBytes() {
        name = "Java Beans & Bytes: The Code Café";
        isOpen = true;
        yearFounded = 1995;

        System.out.println("Welcome to " + name + "!");
        if (isOpen) {
            System.out.println("We are open!");
        } else {
            System.out.println("We are closed :(");
        }
        System.out.println("We were founded in " + yearFounded + ".");

        yearFounded = 2000;
        System.out.println("Updated founding year: "+yearFounded);

        // Calling methods
        randomDiscount();
        specialOfTheDay("strawberry mint soda");
        countCups();
        System.out.println("Congrats! You are the lucky winner of a "+randomDiscount()+"% discount!");
        baristasChoice();


        CoffeeDrink flatWhite = new CoffeeDrink(3,"flat white",false);
        CoffeeDrink englishBreakfast = new CoffeeDrink(2,"English Breakfast tea latte",true);

        flatWhite.printInfo();
        englishBreakfast.printInfo();


    }

    // Method to generate a random discount
    public int randomDiscount() {
        return((int)(Math.random()*31));
    }

    // Method with a parameter for the special of the day
    public void specialOfTheDay(String todaysSpecial) {
        System.out.println("Today's special is "+todaysSpecial+".");
    }

    // Method to show loops
    public void countCups() {
        System.out.println("Counting cups sold today:");
        for(int x =1;x<=5;x++){
            System.out.println(x);
        }
        for(int x =2;x<=11;x+=3){
            System.out.println(x);
        }
        for(int x =8;x>=0;x--){
            System.out.println(x);
        }
    }

    // Method to recommend a coffee based on a random number
    public void baristasChoice() {
        double chooser = Math.random();
        if (chooser<0.3){
            System.out.println("Barry the barista recommends the iced mango drinking chocolate.");
        } else if (chooser<0.6){
            System.out.println("Barry the barista recommends a candy cane mocha frappuchino.");
        } else if (chooser<0.9){
            System.out.println("Barry the barista recommends a blueberry muffin and frothed milk with a touch of sugar and vanilla.");
        } else {
            System.out.println("Barry the barista recommends water.");
        }
    }
}

