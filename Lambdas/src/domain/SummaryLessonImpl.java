package domain;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class SummaryLessonImpl implements LambdaExercise{

	@Override
	public void showLambda() {
		List<User> names = new ArrayList<User>();
		names.add(new User("Elivar", "Oswaldo", 10, new Address("San Pedro")));
		names.add(new User("Antonio", "Carrion", 15, new Address("Bellavista")));
		names.add(new User("Juan", "Andrade", 12, new Address("San Pedro1")));
		names.add(new User("Luis", "Aguilar", 17, new Address("San Pedro2")));
		names.add(new User("Fidel", "Narvaez", 8, new Address("San Pedro3")));
		names.add(new User("Paul", "Guevara", 5, new Address("San Pedro4")));
		
		System.out.println("***********Predicate example*********");
		System.out.println("User more than 12 years old:" + names.stream().filter(x -> x.getAge() > 12).count());
		
		System.out.println("*********Function example*************");
		Function<User, Address> funcAddress = v -> v.getAddress();
		System.out.println(funcAddress.apply(names.get(0)).getName());
		
		System.out.println("*********Consumer example*************");
		Consumer<User> changeLastname = u -> u.setLastName("Aguirre");
		changeLastname.accept(names.get(0));
		names.forEach(System.out::println);
		
		System.out.println("*********Supplier example*************");
		Supplier<User> u = () -> new User("Augusto", "Velez", 5,  new Address("Cayambe"));
		System.out.println(u.get());
		
		
		
		
	}

}
