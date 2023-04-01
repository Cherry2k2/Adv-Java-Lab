import annotations.*;

// @RestController(number = 10)
@SortController(strategy = TYPE.MERGE)
public class CustomController {

	
	@Sort(invoke=true)
	public String method() {
		List<Integer> list = Arrays.asList(1,5,2,3,9,0);
		return list;
	}
	// List<Integer> list = {1,5,2,3,9,0};
	// List<Integer> list = Arrays.asList(1,5,2,3,9,0);
	

// @SortController(list={1,3,-5,-9,0},strategy =  "MERGE")


	// public string field;
	


	// @RequestMapping
	// public String method() {
	// 	System.out.println("Sairam0");
	// 	return "Sairam";
	// }

	// @RequestMapping (invoke = true)
	// public String method1() {
	// 	System.out.println("Sairam1");
	// 	return "Sairam";
	// }

	// @RequestMapping
	// public String method2() {
	// 	System.out.println("Sairam2");
	// 	return "Sairam";
	// }

	// @RequestMapping (invoke = true)
	// public String method3() {
	// 	System.out.println("Sairam3");
	// 	return "Sairam";
	// }

}
