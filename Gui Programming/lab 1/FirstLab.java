/*
The purpose of this program is to create a guessing game
with a for and while loop, if statement and a method.
user will guess between 1 - 3 and a counter will check for correct guess.
*/


import java.util.Scanner;
public class FirstLab {

	//declare variables
	int correct;
	int guess = 0, counter =0, score =0, x=0, result;

	//main method
	public static void main(String[] args){
		FirstLab myLab = new FirstLab();
		Scanner input = new Scanner(System.in);

		//for loop
		
		for(int i=0;i<3;i++){
			myLab.x=0;
			//while loop
			while(myLab.x==0){
				myLab.correct = 1 +(int)(Math.random()*3);
				myLab.counter++;
				System.out.print("Guess a number between 1 and 3: ");
				myLab.guess = input.nextInt();
				myLab.result = myLab.check(myLab.guess);
				myLab.x=myLab.result;

			}//end while
		}//end for
		System.exit(0);
	}//main

	//check method
	public int check(int a){

		//if to check if guess is correct
		if(guess == correct){
			score++;
			System.out.println("You guessed correct");
			System.out.println(score + "/ " + counter);
			x=1;
		}
		else{
			System.out.println("incorrect guess");
			x=0;
		}
		return x;

	}//end check class
}//end class