import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Driver {
	

	public static void main(String[] args) {
		String numbers[] = new String[3];
		State stateArray[] ;
		int numberOfStates,numberOfTransitions, numberOfFinalStates, sizeOfAlphabets;
		String alphabets[];
		HashMap<String, ArrayList<Integer>> dfaTable = new HashMap<String, ArrayList<Integer>>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of states , number of transitions and number of final states:");
		numbers = scanner.nextLine().split("\\s+");
		//Arrays.stream(numbers).forEach(e->System.out.println(e));
		numberOfStates = Integer.parseInt(numbers[0]);
		stateArray = new State[numberOfStates];
		for(int i = 0 ;i<numberOfStates;i++) {
			if(i == 0) {
				stateArray[i] = new State(false);
			}
			stateArray[i] = new State();
		}
		numberOfTransitions = Integer.parseInt(numbers[1]);
		numberOfFinalStates = Integer.parseInt(numbers[2]);
		System.out.println(numberOfStates + " "+numberOfTransitions+ " "+ numberOfFinalStates);
		System.out.println("Enter number of alphabets");
		sizeOfAlphabets = scanner.nextInt();
		scanner.nextLine();
		alphabets = new String[sizeOfAlphabets];
		System.out.println("Enter the alphabets by space: ");
		String alphas = scanner.nextLine();
		alphabets  = alphas.split("\\s+");
		//Arrays.stream(alphabets).forEach(e -> System.out.println(e));
	
		

	}

}
