package com.CCProject;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws Exception {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter two numbers");
        String inp = myObj.nextLine();

        Lexer lexer = new Lexer(inp);
        Parser parser = new Parser(lexer);
        Interpretor intepret = new Interpretor(parser);
        int res = intepret.interpret();

       
        System.out.println("Result : " + res);
    }

}
