import java.util.*;
class srinu

{
	public static void main(String args[])
	{
		int i, j,n;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		for (i = 1; i <= n; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}