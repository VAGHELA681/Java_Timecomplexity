public class Main {
	public static void main(String[] args) {
		int n = 5;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.println(j);
			}
		}
	}
}

//outer loop n times
//inner loop i times
// i = 0
// i = 1
// i = 2
// i = 3
// i = 4
// i = 5

//total = 1 + 2 + 3 + 4 (n-1) = n(n-1)/2
//=>n2/2
//=>0(n2)
  
