package org.APCSLowell;

public class Palindrome {
    public boolean palindrome(String s) {
        if(reverse(reverse(s)).equals(reverse(s))) {return true;}
        return false;
    }
    public String reverse(String s) {
        String n = new String();
        for(int i = s.length()-1; i >= 0; i--) {
        if(Character.isLetter(s.charAt(i))) {n = n + s.substring(i, i+1);}
        }
        return n.toLowerCase();
    }
}
