package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

	int minNum = 0;
	int maxNum = 0;
	boolean flag = true;

	while(true){
        System.out.println("Enter number: ");
        boolean isNextInt = scanner.hasNextInt();

        if(isNextInt){
            int number = scanner.nextInt();
            if(flag){
                flag = false;
                minNum = number;
                maxNum = number;
            }

                if(number > maxNum){
                    maxNum = number;
                }
                if(number < minNum){
                    minNum = number;
                }


        } else {
            System.out.println("Invalid number.");
            break;
        }
        scanner.nextLine();
    }
        System.out.println("The minimum number is " + minNum + " and the maximum number is " + maxNum);
	    scanner.close();
    }
}
