package com.bridgelabz.datastructPrograms;

import com.bridgelabz.utility.Stack;

/**
 * @author swati
 * return boolean output Arithmetic Expression is balanced or not.
 */
public class BalancedParentheses {
	public static boolean isbalancedParenthes(String str) {
		int len = str.length();
		Stack stack = new Stack();
		for(int i=0; i<len; i++) {
			if(str.charAt(i)=='(') {
				stack.push("(");
			}else if(str.charAt(i)==')') {
				if(stack.peek()=="(" && !stack.isEmpty()) {
					stack.pop();
					
				}else {
					return false;
				}
			}
		}
		if(!stack.isEmpty()) {
			return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		String str = "(5+6)∗(7+8)/(4+3)(5+6)∗(7+8)/(4+3)";
		System.out.println(BalancedParentheses.isbalancedParenthes(str));
	}

}
	
