package easy;

import java.util.Stack;

public class BalancedBraces {

	public void demo() {

		String braces = "{()}";
		braces = "{()}{}()()()({}[]{}{})[] {}";

		boolean balanced = isBalanced(braces);
		System.out.println(braces + " is " + (balanced ? "balanced" : "not balanced"));
	}

	private boolean isBalanced(String s) {

		Stack<Character> stack = new Stack<>();

		boolean balanced = true;
		loop: for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			switch (c) {
			case '(':
			case '{':
			case '[':
				stack.push(c);
				break;

			case ')':
			case '}':
			case ']':
				if(stack.empty()) {
					return false;
				}
				char p = stack.pop();
				balanced = isCorresponding(c, p);
				if (!balanced) {
					break loop;
				}
			}
		}

		return balanced;
	}

	private boolean isCorresponding(char c, char p) {

		switch (p) {
		case '(':
			return c == ')';
		case '{':
			return c == '}';
		case '[':
			return c == ']';
		default:
			return false;
		}
	}

}
