package ex01;
import java.util.ArrayList;
import java.util.List;

public class CadenesEx01 {

	public static void main(String[] args) {
		List<String> llista= List.of("AAa","bcd","Ama","opo","ara","ASA","Ajsdfkjh");
		
		llista.stream().filter((x)->x.startsWith("A")).
			filter((x)->x.length()==3).forEach((x)->System.out.println(x));
		
	}

}


