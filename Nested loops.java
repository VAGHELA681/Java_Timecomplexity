public class Main {
	public static void main(String[] args) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.println(i + " " + j);
			}
		}
	}
}

// outer loop n times
// inner loop n times
// n * n = 2n
// 0(n2) times
