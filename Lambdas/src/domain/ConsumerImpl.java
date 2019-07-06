package domain;

import java.util.function.Consumer;

public class ConsumerImpl implements LambdaExercise{
	// use a resource as parameter and extract the information according the consumer expression
	@Override
	public void showLambda() {

		Consumer<Persona> person = (p) -> System.out.println("Hello, " + p.getNombre());
		person.accept(new Persona("Cesar", "Salcedo", "España"));
		
	}

}
