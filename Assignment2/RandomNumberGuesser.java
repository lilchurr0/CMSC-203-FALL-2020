import java.util.*;
public class RandomNumberGuesser {


    public static void main (String args[]){

        Scanner scan = new Scanner(System.in);

        String header= "****** Random Number Guesser ******\n\tGuess a number from 1 to 100\n";

        String numSent="Number of guesses is ";

        String highLow []={"Your guess is too high", "Your guess is too low"};

        int randNum, nextGuess, highGuess, lowGuess;

        String againResponse;

        boolean valid, again;

        again =true;

        System.out.println(header);

        highGuess=100;

        lowGuess=1;

    do {
        //creating random number
        randNum = RNG.rand();

        System.out.println("Enter your first guess");

        nextGuess = scan.nextInt();

        //changes count from 0 to 1
        RNG obj1= new RNG();

        do {

            System.out.println(numSent + RNG.getCount());

            if (nextGuess > randNum) {
                System.out.println(highLow[0]);
                highGuess = nextGuess;
            } else {
                System.out.println(highLow[1]);
                lowGuess = nextGuess;
            }

            System.out.println("enter your next guess between " + lowGuess + " and " + highGuess);

            do {
                nextGuess = scan.nextInt();

                valid = RNG.inputValidation(nextGuess, lowGuess, highGuess);
            }
            while (valid != true);

        } while (nextGuess != randNum);

        System.out.println("Congratulations you guessed correctly");

        System.out.println("Try again?(yes or no)");

        againResponse=scan.nextLine();
        againResponse=scan.nextLine();

        if(againResponse.equalsIgnoreCase("no"))
            again=false;
        else{
            RNG.resetCount();
            highGuess=100;
            lowGuess=1;
        }



    }while(again==true);

        System.out.println("Thanks for playing...\nProgrammer:Adrian Guerra");

    }
}
