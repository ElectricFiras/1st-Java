public class MyClass {

    public static void main (String[] args){

        System.out.println(printMsg("Thank you for teaching me Java"));
        System.out.println(guessMyNumber(5));
    }

    public static int counter = 0;
    public static String printMsg(String str1){
        return (str1);
    }

    public static String guessMyNumber (int num){
        int random = (int )(Math.random() * 10 + 1);

        if(num < 0 || num > 10){
            return "out of boundaries inter a digit between 0 and 10";
        } else if (num == random){
            return "You guessed my number!";
        } else if (counter == 3){
            return "Game over";
        } else {
            counter++;
            return "Try Again";
        }

    }
}
