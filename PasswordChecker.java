package com.company;

public class PasswordChecker {
    public static void main(String args[]){
        String pass = "A1_6e";
        int n = pass.length();
        if(n<4){
            System.out.println("Invalid");
        }
        char digit = pass.charAt(0);
        if(Character.isDigit(digit)){
            System.out.println("Invalid");
        }
        char ch;
        boolean capitalFlag = false;
        boolean lowerCaseFlag = false;
        boolean numberFlag = false;
        for(int i=0;i < pass.length();i++) {
            ch = pass.charAt(i);
            if(Character.isDigit(ch)) {
                numberFlag = true;
            }
            else if (Character.isUpperCase(ch)) {
                capitalFlag = true;
            } else if (Character.isLowerCase(ch)) {
                lowerCaseFlag = true;
            }
        }
        if(pass.contains(" ")||pass.contains("/")) {
            System.out.println("Invalid");
        } else if(numberFlag && capitalFlag && lowerCaseFlag){
            System.out.println("Valid");
        }
    }
}
