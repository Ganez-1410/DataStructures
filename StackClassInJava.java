import java.util.Stack;
public class StackClassInJava {
	static void push(Stack s) {
		for(int i=1;i<=20;i++) {
			s.push(i);
		}
	}
	static void pop(Stack s) {
		for(int i=0;i<5;i++)
			System.out.println(s.pop());
	}
public static void main(String[] args) {
	Stack s=new Stack();
	push(s);
	System.out.println(s);
	pop(s);
	System.out.println(s);
}
}
