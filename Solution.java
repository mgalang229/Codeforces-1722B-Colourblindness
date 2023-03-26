import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		int T = 1;
		T = fs.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int n = fs.nextInt();
			char[][] grid = new char[2][];
			for (int i = 0; i < 2; i++) {
				grid[i] = fs.next().toCharArray();
			}
			boolean same = true;
			for (int i = 0; i < n; i++) {
				if ((grid[0][i] == 'R' && grid[1][i] != 'R') || (grid[1][i] == 'R' && grid[0][i] != 'R')) {
					same = false;
					break;
				}
			}
			System.out.println(same ? "YES" : "NO");
		}
		fs.close();
	}
}
