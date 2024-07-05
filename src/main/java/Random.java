//import com.sun.tools.jdeprscan.scan.Scan;

import java.util.ArrayList;
import java.util.Scanner;

public class Random {
    int randomNumberBetween0To100;
    int amountOfGuess =0;
    boolean exitApp = false;
    int userNumber;
    ArrayList<Integer> inputs = new ArrayList<Integer>();

    public boolean isExitApp() {
        return exitApp;
    }

    public void setExitApp(boolean exitApp) {
        this.exitApp = exitApp;
    }

    public int getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(int userNumber) {
        this.userNumber = userNumber;
        setAmountOfGuess();
    }

    public Random() {
    }

    public int getRandomNumberBetween0To100() {
        return randomNumberBetween0To100;
    }

    public void setRandomNumberBetween0To100(int randomNumberBetween0To100) {
        this.randomNumberBetween0To100 = randomNumberBetween0To100;
    }

    public int getAmountOfGuess() {
        return amountOfGuess;
    }

    public void setAmountOfGuess() {
        if(!inputs.contains(userNumber)){
            inputs.add(userNumber);
        }
        amountOfGuess = inputs.size();
    }

    public void generateRandomNum(){
        int r = (int) (Math.random() * (100 - 1)) + 1;
        this.randomNumberBetween0To100 = r;
    }

    public void checkNumberToHighOrNot(){
        if(this.getUserNumber() > randomNumberBetween0To100){
            System.out.println("Your number is too high");
        }else if (this.getUserNumber() < randomNumberBetween0To100){
            System.out.println("Your number is too low.");
        }else{
            System.out.println("Congrats, you got the number in " + amountOfGuess + " of tries! ");
            exitApp = true;

        }
    }
    public void runApp(){
        generateRandomNum();
        System.out.println(randomNumberBetween0To100);
        while(!exitApp){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter a number. Your number is between 0 and 100");

            int userInput = scanner.nextInt();
            setUserNumber(userInput);
           // amountOfGuess++;
            System.out.println("your input is: " + userInput);
            checkNumberToHighOrNot();
        }

    }




}
