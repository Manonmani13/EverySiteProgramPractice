package com.example;

public class RemoveJunk {
    public static void main(String[] args) {
        String s="xT9v#L@z3!q8F$rPn2^Wm0*YkJb&7sUz";
        s.replace("[^a-zA-Z0-9]", "");
        System.out.println(s);
    }
}
