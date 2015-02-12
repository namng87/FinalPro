import java.util.Scanner;

public class Diving{
	
	private Scanner keyboard; //declaring variables

	public Diving() {
		
		keyboard = new Scanner(System.in);
		float score = calculateScore();
		System.out.println("");
		System.out.println("Diver's Final Score: " + score);
		
	}
	
	public float calculateScore() { // calculate scores
		
		float difficulty = inputValidDegreeOfDifficulty(); // entering and validating diff
		float[] scores = inputAllScores(); // collects scores from judges
		scores = sort(scores);// applying another method to the scores
		
		float score = 0;
		
		for (int i=0; i<scores.length - 1; i++) // sum of scores
			score += scores[i];
		System.out.println( score * difficulty);
		System.out.println(score * .6f);
		return (score * difficulty * .6f); // returning final score
		
	}
	
	public float inputValidDegreeOfDifficulty() { // finding difficulty
		
		float difficulty = 0; //new variable
		while (true) { // input difficulty, loops infinitely
			
			System.out.print("Please Enter the Difficulty: ");
			difficulty = keyboard.nextFloat();
			System.out.println("Degree of Difficulty is: " + difficulty);
			
			if (difficulty >= 1.2 && difficulty <= 3.8) // checks input if in range of difficulty
				break; // if so then break
			else
				System.out.println("Invalid Difficulty."); // if not return if out of range
			
		}
		return difficulty;
		
	}
	
	public float[] inputAllScores() { // creates the array of all scores
		
		float[] scores = new float[7]; // creates array size of 7 
		
		for (int i=0; i<7; i++) // adds scores into array
			scores[i] = inputValidScore(i);
		return scores;
		
	}
	
	public float[] sort(float[] array) { // sorting to remove lowest and highest score
		
		float temp = array[0];
		int min = 0;
		int max = 0;
		
		for (int i=1; i<array.length - 1; i++) { // finds lowest and highest values' index
			
			if (temp > array[i]) { 
				min = i;
			}
			if (temp < array[i]) {
				max = i;
			}
		}
		
		array[min] = 0; // set lowest and highest values to 0
		array[max] = 0;
			
		return array;
		
	}
	
	public float inputValidScore(int judgeNumber) { // checks if valid score
		
		float score = 0;
		
		while (true) { // loops infinitely until a valid score is entered
			
			System.out.print("Judge " + (judgeNumber + 1) + " score: ");
			score = keyboard.nextFloat();
			
			if (score >= 0 && score <= 10)// checks score
				break;
			else
				System.out.println("Invalid Score.");
			
		}
		return score;
		
	}

	public static void main(String[] args) {
		
		new Diving();
		
	}
}
