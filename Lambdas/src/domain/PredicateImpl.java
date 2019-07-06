package domain;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateImpl implements LambdaExercise {
	
	//Received an argument and deliver an logic result

	@Override
	public void showLambda() {
		Predicate<String> predicate = (s) -> s.length() > 0;
		System.out.println(predicate.test("predicate"));
		System.out.println(predicate.negate().test("predicate"));
		
		List<Integer> listOfNumbers = Arrays.asList(1,2,3,4,5,6, 7, 8,9,10);
		
		System.out.println("Pair numbers:");
		evaluate(listOfNumbers, (n) -> n%2 == 0);
		
		System.out.println("Unpair numbers:");
		evaluate(listOfNumbers, (n) -> n%2 == 1);
		
		System.out.println("Numbers more than 5:");
		evaluate(listOfNumbers, (n) -> n > 5);
		
		
	}
	
	public static void evaluate(List<Integer> listOfNumbers, Predicate<Integer> predicate) {
		for(Integer n: listOfNumbers) {
			if(predicate.test(n)) {
				System.out.println(n +  " ");
			}
		}
		System.out.println();
	}
	
	
	

}
