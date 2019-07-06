package main;

import domain.FunctionImpl;
import domain.IFunctionLambda;
import domain.LambdaExercise;
import domain.PredicateImpl;
import domain.ReferenceImpl;
import domain.SummaryLessonImpl;
import domain.SupplierImpl;

public class TestLambdas {

	public static void main(String[] args) {
		
		/*int x = 10;
		int y = 5;
		
		IFunctionLambda iflambda = (a, b) -> System.out.println( a + b );
		iflambda.suma(x, y);*/
		
		LambdaExercise exercise = new SummaryLessonImpl();
		exercise.showLambda();
		
		//System.out.println("Predicate example");

	}

}
