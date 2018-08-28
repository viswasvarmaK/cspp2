import java.util.Scanner;
/**
class formule
{
	public static void main(String[] args)
	{
		/**
		 * { var_description }
		 */
		Scanner ip = new Scanner(System.in);
		int base = ip.nextInt();
		int height = ip.nextInt();
		float formulee = AreaofTriangle(base, height);
		System.out.println(formulee);
	}
	public static float AreaofTriangle(float a, float b)
	{
	    return 0.5f * a * b;
	}
}