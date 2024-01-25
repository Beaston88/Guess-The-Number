import java.util.Scanner;
import java.util.Random;
class game{
    int userInput;
    int javaGuess;
    int noOfGuesses = 1;
    public game(int x){
        javaGuess = x;
    }
    int getJavaGuess(){
        return javaGuess;
    }
    void set(int n){
        userInput = n;
    }
    int getUserInput(){
        return userInput;
    }
    boolean isCorrectNumber(){
        if(javaGuess == userInput){
            return true;
        }
        return false;
    }
    void set(){
        noOfGuesses++;
    }
    int get(){
        return noOfGuesses;
    }

}
public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        game myGame = new game(rand.nextInt(0,101));
        System.out.println("Hey how's you doin' man!\nGetting bored ?\nLet's have some fun and look how's your guessing power" );
        System.out.println("Common guess a number. If it matches with mine then you win the game. Ready ?");
        System.out.println("Guess your Number (between 0 to 100) : ");
        myGame.set(sc.nextInt());
        boolean isChecking = false;
        while(!isChecking) {
            if (myGame.isCorrectNumber()) {
                System.out.println("Yohoooo!!! You won the game.");
                isChecking = true;
                break;
            } else {
                if (myGame.getUserInput() > myGame.getJavaGuess()) {
                    System.out.println("You have choosen a bigger number.\nThink Smaller");
                    myGame.set();
                    System.out.println("Guess again : ");
                    myGame.set(sc.nextInt());
                } else if (myGame.getUserInput() < myGame.getJavaGuess()) {
                    System.out.println("You have choosen a smaller number.\n Think larger");
                    myGame.set();
                    System.out.println("Guess again : ");
                    myGame.set(sc.nextInt());
                }
            }
        }
        System.out.println("No of guesses you required is : " + myGame.get());
    }
}
    

