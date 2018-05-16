import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.stream.Collectors;

public class Pocetna {

	public static void main(String[] args) {
		List<Integer> listaNaBroevi;
		listaNaBroevi = new Vector<>();
		listaNaBroevi.add(4);
		listaNaBroevi.add(15);
		listaNaBroevi.add(88);
		listaNaBroevi.add(22);
		List<Integer> pomailiOd50 = listaNaBroevi.stream()
				.filter(x -> x<50)
				.map(x -> x*2)	
				.collect(Collectors.toList());
		System.out.println(pomailiOd50);
		
	}

}
