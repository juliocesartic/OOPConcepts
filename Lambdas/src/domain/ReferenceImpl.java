package domain;

import java.util.ArrayList;
import java.util.List;

public class ReferenceImpl implements LambdaExercise{

	@Override
	public void showLambda() {
		List names = new ArrayList();
		names.add("Andrea");
		names.add("Luisa");
		names.add("Diego");
		names.add("Paul");
		names.add("Dario");
		names.forEach(System.out::println);
		
	}

}
