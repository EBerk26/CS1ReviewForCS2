// CoffeeDrink object class

class CoffeeDrink {

    int numberOfCups;
    String flavor;
    boolean hasWhippedCream;
    String whippedCreamString;

    // Constructor for CoffeeDrink class
    public CoffeeDrink(int param_numberofCups, String param_flavor, boolean param_hasWhippedCream) {
        numberOfCups=param_numberofCups;
        flavor=param_flavor;
        hasWhippedCream=param_hasWhippedCream;
    }

    // Method to print information about the CoffeeDrink
    public void printInfo() {
        if (hasWhippedCream){
            whippedCreamString = "have";
        } else{
            whippedCreamString = "do not have";
        }
        System.out.println("Order ready! There are "+numberOfCups+" cups of the "+flavor+" drink. They "+whippedCreamString+" whipped cream.");

    }
}
