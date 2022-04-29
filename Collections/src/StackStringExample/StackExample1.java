package StackStringExample;

import java.util.Stack;

public class StackExample1 {

	public static void main(String[] args) {
		Stack<String> s1 = new Stack<String>();
		s1.push("Mself");
		s1.push("Someone");
		s1.push("AnyOne");
		s1.push("NoOne");
		s1.push("Everyone");
		
		System.out.println(s1);
		s1.pop();
		System.out.println(s1);
		System.out.println(s1.peek());
		System.out.println(s1);
		
		System.out.println(s1.pop());
		System.out.println(s1);

	}

}
