package string;

import java.util.Stack;

public class PAthh {
	public static void main(String[] args) {
		Stack<String> stack=new Stack();
		String s="/home/";
		String part[]=s.split("/");
		
		for(String p:part) {
			if(p.equals("")||p.equals(".")) {
				continue;
			}
			if(p.equals("..")) {
				if(!stack.isEmpty()) {
					stack.pop();
				}
			}else {
				stack.push(p);
			}
			
		}
		if(stack.isEmpty()) {
			System.out.println("/");
		}
		
		String sp="";
		for(String va:stack) {
			sp+="/"+va;
		}
		System.out.println(sp);
	}

}
