package teste;

public class Test {

	public static void main(String[] args) {
		System.err.println("agora vai");
		System.err.println("/ha");
		
		
		String b = "teste";
		Ha<String> ha = (a) -> a.concat(a);
	
		System.err.println("feito: "+ha);
	}
}
@FunctionalInterface
interface Ha<T>{
	
	
	public abstract String test(T v);
}