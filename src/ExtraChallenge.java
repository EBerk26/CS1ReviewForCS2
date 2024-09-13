public class ExtraChallenge {
    public static void main(String[] args) {

        System.out.println("Pattern 11");
        newLine();
        for (int x = 1; x <= 5; x++) {
            for (int y = 1; y <= x; y++) {
                System.out.print("# ");
            }
            newLine();
        }
        newLine();

        //Pattern 9
        System.out.println("Pattern 9");
        newLine();
        int numberOfStars = 1;
        int additionDeterminer = 4;
        int amountToAdd;
        while (numberOfStars > 0) {
            if (additionDeterminer > 0) {
                amountToAdd = 2;
            } else {
                amountToAdd = -2;
            }
            for (int z = 1; z <= 2; z++) {
                for (int y = 1; y <= (9 - numberOfStars) / 2; y++) {
                    System.out.print(" ");
                }
                if (z == 1) {
                    for (int y = 1; y <= numberOfStars; y++) {
                        System.out.print("*");
                    }
                }
            }
            numberOfStars += amountToAdd;
            additionDeterminer -= 1;
            newLine();
        }
        newLine();
        //Pattern 10
        System.out.println("Pattern 10");
        newLine();
        for (int numOfSpaces = 7; numOfSpaces >= -7; numOfSpaces -= 2) {
            if (numOfSpaces == -1) {
                System.out.println("    *    "); //this sort of feels like cheating...
            }
            for (int x = 1; x <= 3.5 - Math.abs(numOfSpaces) / 2; x++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int x = 1; x <= Math.abs(numOfSpaces); x++) {
                System.out.print(" ");
            }
            System.out.print("*");
            newLine();
        }
        newLine();
        //Pattern 13
        System.out.println("Pattern 13");
        for (int x = 5; x >= 1; x--) {
            for (int y = 0; y < 5-x; y++) {
                System.out.print(1);
            }
            for (int y = 1; y <= x; y++) {
                System.out.print((6 - x) * 2);
            }
            newLine();
        }
        newLine();
        System.out.println("Pattern 12");

        for(int x =16;x>=0;x-=4){
            for(int z = 1; z<=2; z++) {
                for (int y = 1; y <= 5 - x / 4; y++) {
                    System.out.print("# ");
                }
                if(z==1){
                    for (int y = 1; y <= x; y++) {
                    System.out.print(" ");
                    }
                }
            }
            newLine();
        }

    }



    static void newLine(){
        System.out.println();
    }
}