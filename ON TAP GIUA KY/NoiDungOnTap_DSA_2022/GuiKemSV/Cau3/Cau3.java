import java.util.Stack;

public class Cau3 {
	public static int solve(String c, int a, int b) {
		switch (c) {
			case "+":
				return a + b;
			case "-":
				return a - b;
		}
		return 0;
	}

	private static boolean isNumber(String str) {
		return str.matches("0|([1-9][0-9]*)");
	}

	public static int calculate(String[] expression) {
		Stack<Integer> stack = new Stack<>();
		for (String number : expression) {
			if (isNumber(number)) {
				stack.push(Integer.parseInt(number));
			} else {
				int a = stack.pop();
				int b = stack.pop();
				stack.push(solve(number, a, b));
			}
		}
		return stack.pop();
	}

	public static void main(String args[]) {
		System.out.println(calculate(new String[] { "31", "12", "+" }));
	}
}