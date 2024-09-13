public class ExtraChallenge {
    public static void main(String[] args) {
        //Pattern 11 - 4 LOC
        System.out.println("Pattern 11");
        newLine();
        for (int x = 1; x <= 5; x++) {
            for (int y = 1; y <= x; y++) {
                System.out.print("# ");
            }
            newLine();
        }

        newLine();

        //Pattern 9 - 6 LOC
        System.out.println("Pattern 9");
        newLine();
        for(int x =1; x<=9; x++){
            for(int y =1;y<=Math.abs(x-5);y++){
                System.out.print(" ");
            }
            for (int y =1; y<=9-2*Math.abs(x-5);y++){
                System.out.print("*");
            }
            newLine();
        }

        newLine();
        //Pattern 10 - 11 LOC
        System.out.println("Pattern 10");
        newLine();
        for(int x=1;x<=9;x++){
            for(int y = 1; y<=4-Math.abs(x-5);y++){
                System.out.print(" ");
            }
            System.out.print("*");
            if(2*(Math.abs(x-5)-1)<0){
                newLine();
            } else {
                for (int y = 1; y <= 2*(Math.abs(x-5))-1; y++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                newLine();
            }
        }
        newLine();
        //Pattern 13 - 6 LOC
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

        System.out.println("Pattern 12"); //8 LOC
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