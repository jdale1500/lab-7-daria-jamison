package edu.luc.cs271.linkedstack;

import java.util.Scanner;

public class ReverseLines {

  public static void main(final String[] args) {
    // TODO read successive input lines until EOF, then print out in reverse order
    LinkedStack<String> mores = new LinkedStack<String>();
    System.out.println("input lines");
    String line;
    final Scanner input = new Scanner(System.in);
    while (input.hasNextLine()) {
      line = input.nextLine();
      mores.push(line);
    }
    String temps = "";
    while (!mores.isEmpty()) {
      temps = temps + " " + mores.pop();
    }
    System.out.println(temps);
  }
}
