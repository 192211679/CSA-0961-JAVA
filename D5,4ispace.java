import java.util.*;
class ispace
{
	public static void main(String args[])
	{
		int i, j,n;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		for (i = 1; i <= n; i++) {
			for (j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
}