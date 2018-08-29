import java.util.Scanner;
public class Bigger {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	if (a == b) {
		System.out.println("Both are Equal");
	}
	if (a < b) {
		System.out.println("b is bigger");
	}
	if (a > b) {
        System.out.println("a is bigger");
	}	
	}
}