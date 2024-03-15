public class Main {

    public static int add(int numOne, int numTwo){
        return numOne+numTwo;
    }

    public static String greeting(String name){
        return "Bonjour, " + name + "!";
    }

    public static int add(int numOne, int numTwo, int numThree, int numFour){
        int sumOne = add(numOne, numTwo);
        int sumTwo = add(numThree, numFour);
        int finalSum = add(sumOne, sumTwo);
        return finalSum;
    }

    public static void printCapitalised(String toBePrinted){
        System.out.println(toBePrinted.toUpperCase());
    }

    public static void main(String[] args) {
        int resultOne = add(2,2);
        System.out.println(resultOne);
        String resultTwo = greeting("Emily");
        System.out.println(resultTwo);
        int resultThree = add(18,18,12,8);
        System.out.println(resultThree);
        printCapitalised("heyyy");


        // call the first add method and store the result into a variable called resultOne.

        // print resultOne.

        // call the greeting method and store the result into a variable called resultTwo.

        // print resultTwo.

        // call the second add method and store the result into a variable called resultThree.

        // print resultThree.

        // call the printCapitalised method.

    }

    /**
     * add
     * @param numOne - an integer
     * @param numTwo - an integer
     * @return the sum of numOne and numTwo (an integer)
     */


    /**
     * greeting
     * @param name - the name of a person (a String)
     * @return a greeting in the format of "Bonjour, [name]!" (a String)
     */


    /**
     * add
     * @param numOne - an integer
     * @param numTwo - an integer
     * @param numThree - an integer
     * @param numFour - an integer
     * @return the sum of numOne, numTwo, numThree, and numFour (an integer)
     */


    /**
     * printCapitalised
     * @param toBePrinted - a String that the user wishes to be printed in all caps.
     */




}
