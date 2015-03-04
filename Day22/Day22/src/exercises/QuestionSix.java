package exercises;

import java.util.Arrays;
import java.util.List;


public class QuestionSix {
	public static void main(String[] args) {
		new QuestionSix().launch();
	}
	public void launch(){
		List<String> words = Arrays.asList("Hello", "Bonjour", "engine", "Hurray", "What", "Dog", "boat", "Egg", "Queen", "Soq", "Eet");
		words.stream().map(str -> str.toUpperCase()).filter(str -> str.length() < 4);
		System.out.println("nothing printed as intermediate operations only executed when terminal operation is present");
		words.stream().filter(s -> {System.out.println("filter: " + s); return true;}).forEach(str -> System.out.println(" forEach: " + str));
		//proves there is lazy evaluation.
	}
}
