package javasessions;

public class TimeComplexityProcess {
	// Time Complexity : is the number of operations an algorithm performs to
	// complete its task (considering that each operation takes the same amount of
	// time).
	// The algorithm that performs the task in the smallest number of operations is
	// considered the most efficient one in terms of the time complexity.
	public static void main(String[] args) {
		int i = 10;
		System.out.println(i);
		// O(1) -constant time/linear time

		for (int p = 1; p < 1000000000; p++) {
			System.out.println(p);
		}
		// n =1 for p=1
		// p<1000000000 will run n number of time and p++ will also run n number of
		// times and syso(p) also run n number of times so
		// we can say 1+n+n+n ==> 3n+1(linear equation)
		// we can avoid 1 as it will not make any difference and we can also avoid
		// constants and 3n will become n and ultimately the time taken is O(n)->O of n

	}

}
