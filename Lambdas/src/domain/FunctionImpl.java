package domain;

import java.util.function.Function;

public class FunctionImpl implements LambdaExercise {

	// Receive an argument and deliver an result
	@Override
	public void showLambda() {
		Function<Integer, Integer> add = x -> x + 8;
		System.out.println("The addition of 5 + 8 = " + add.apply(5));
		
		Function<String, Integer> lengthString = str -> str.length();
		String originalString = "Lambda function";
		System.out.println("The length of originalString is: " + lengthString.apply(originalString));
		
		
	}



}
