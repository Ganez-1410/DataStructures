import java.util.Scanner;

public class Stack {
	static int[] stack=new int[100];
	static int top=-1;
	static void push(int x) {
		if(top==stack.length-1)
			System.out.println("Stack Underflow...");
		else
			stack[++top]=x;
	}
	static int pop() {
		if(top==-1) {
			System.out.println("Stack Overflow...");
			return 0;
	    }
		else {
			int a=stack[top--];
			return a;
		}
	}
	static int peek() {
		return top==-1?0:stack[top];
	}
	static boolean isEmpty() {
		return top==-1?true:false;
	}
	static void print() {
		for(int i=0;i<top+1;i++)
			System.out.print(stack[i]+" ");
		System.out.println();
	}
public static void main(String[] args) {
	System.out.println("---STACK DATA STRUCTURE---");
	Scanner sc=new Scanner(System.in);
	String s="";
	do {
    System.out.println("1.push\n2.pop\n3.peek\n4.isEmpty\n5.print");
    int a=sc.nextInt();
    if(a<0 || a>6) {
    	System.out.println("Give correct option...");
    	continue;
    }
    else {
    	switch(a) {
    	case 1:{
    		System.out.print("Enter element:");
    		push(sc.nextInt());
    	    break;
    	       }
    	case 2:{
    		int x=pop();
    		if(x>0)
    		System.out.println("Deleted element is "+x);
    	       break;
    	       }
    	case 3:{
    		int y=peek();
    		if(y>0)
    		  System.out.println("Peek or top or Last element is "+y);
    		else
    		  System.out.println("Stack Underflow");
    	    break;
    	}
    	case 4:{
    		System.out.println(isEmpty()?"Stack is empty":"Stack is not empty");
    	       break;
    	       }
    	case 5:{
    		System.out.print("Stack elements are:");
    		print();
    		break;
    	}
    	}
    }
    System.out.println("Do you want to continue (yes or no)");
    s=sc.next();
	}while(s.equals("yes"));
}
}