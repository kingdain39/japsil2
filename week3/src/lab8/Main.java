package lab8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> 오늘먹은거 = new HashSet<>(Arrays.asList("목살구이, 진미채, 쌈채소, 절편, 소금빵"));
		Map<String, Integer> 지출 = Map.of("EDOC책 구입", 25000, "기후동행카드 충전", 55000, "할리스커피 페퍼민트",4900);
		ArrayList<String> 오늘할거 = new ArrayList<>(Arrays.asList("EDOC책구매","lab8번 하기","아점 먹기","씻기","자프실 청강가기","승연과외가기"));
		
		PrettyPrinter printer = new Printer_forEach();
		printer.show(오늘먹은거);
		printer.show(지출);
		printer.show(오늘할거);

	}

}
