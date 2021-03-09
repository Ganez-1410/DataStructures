import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
import java.util.Stack;

public class BalancingParenthesis {
	static boolean check(String s) {
		Deque<Character> d=new ArrayDeque<Character>();
		Stack<Integer> st=new Stack<Integer>();
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c=='{'||c=='['||c=='(') {
				d.push(c);
				continue;
			}
			if(d.isEmpty())
				return false;
			switch(c) {
			case '}':
				d.pop();
				if(c=='('||c=='[')
					return false;
				break;
			case ']':
				d.pop();
				if(c=='('||c=='{') 
					return false;
				break;
			case ')':
				d.pop();
				if(c=='{'||c=='[')
					return false;
				break;
			}
		}
		return d.isEmpty();
	}
public static void main(String[] args) {
	String s=new Scanner(System.in).next();
	if(check(s))
		System.out.println("Balanced...");
	else
		System.out.println("Not Balanced...");
}
}
