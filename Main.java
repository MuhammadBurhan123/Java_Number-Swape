public class Main{
    public static void main(String[] args) {
        int numberOne = 4;
        int numberTwo = 6;

        System.out.println("Number one: " + numberOne + " Number two: " + numberTwo);
        
        //With Temp Varialbe
        int temp = numberOne;
        numberOne = numberTwo;
        numberTwo = temp;
        System.out.println("Number one: " + numberOne + " Number two: " + numberTwo);
        
        //Without Temp Variable
        numberOne += numberTwo;
        numberTwo = numberOne - numberTwo;
        numberOne -= numberTwo;
        System.out.println("Number one: " + numberOne + " Number two: " + numberTwo);

    }
}