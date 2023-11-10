
public class SwapValues {

	public static void main(String[] args) {
		// Random integer values
				int m = 9, n = 5;

				// Calling above function to
				// reverse the numbers
				swapValuesUsingThirdVariable(m, n);
		}

	private static void swapValuesUsingThirdVariable(int m, int n) {
		int temp = m;
		m = n;
		n = temp;
		System.out.println("Value of m is " + m
						+ " and Value of n is " + n);
		
	}
	}

