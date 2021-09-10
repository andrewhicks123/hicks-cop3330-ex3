package com.example.main;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in).useDelimiter("\n");
        System.out.print("What is the quote? ");
        String quote = input.next();
        System.out.print("Who said it? ");
        String name = input.next();
        System.out.print(name+" says, \""+quote+"\"");
    }
}
