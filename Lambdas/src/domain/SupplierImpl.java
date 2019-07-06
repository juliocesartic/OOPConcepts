package domain;

import java.util.function.Supplier;

public class SupplierImpl implements LambdaExercise {

	// give a result without any  parameter
	@Override
	public void showLambda() {
		
		Supplier <String> string = () -> "Supplier example";
		System.out.println(string.get());
		
		Supplier<Persona> supplier = SupplierImpl::llenarPersona;
		
		Persona per = supplier.get();
		System.out.println(per.getNombre());
	}
	
	public static Persona llenarPersona() {
		return new Persona("Julio", "Jaramillo", "El Salto");
	}
	
	
	

}

