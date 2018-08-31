import java.util.*;
public class Concatinate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String a = new String("hello ");
		System.out.println(a.concat(s)+"!");
	}
}