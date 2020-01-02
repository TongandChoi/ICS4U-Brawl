import java.util.*;
import java.io.*;

class Main {
  public static void main(String[]args) {
    Fighter rohit = new Fighter ("Rohit", "Speed", 120, 160, 100, 185);
    Fighter jason = new Fighter ("Jason", "Speed", 140, 170, 95, 190);
    Fighter sadiq = new Fighter ("Sadiq", "Speed", 150, 150, 110, 185);
    Fighter chung = new Fighter ("Nathan", "Speed", 130, 175, 120, 190);
    Fighter arman = new Fighter ("Arman", "Speed", 100, 175, 85, 195);
    
    Fighter kai = new Fighter ("Kai", "Brain", 145, 190, 110, 120);
    Fighter kai_xiang = new Fighter ("Kai Xiang", "Brain", 145, 185, 120, 130);
    Fighter mahyar = new Fighter ("Mahyar", "Brain", 145, 195, 130, 90);
    Fighter ethan = new Fighter ("Ethan", "Brain", 130, 185, 175, 100);
    Fighter frank = new Fighter ("Frank", "Brain", 110, 195, 115, 150);
    
    Fighter tobe = new Fighter ("Tobe", "Strength", 180, 175, 195, 85);
    Fighter sean = new Fighter ("Sean", "Strength", 180, 180, 185, 95);
    Fighter wilson = new Fighter ("Wilson", "Strength", 120, 170, 190, 120);
    
    Fighter chu = new Fighter ("Mr. Chu", "Speed & Strength & Brain", 200, 250, 120, 250);
    
    System.out.println(rohit);
    System.out.println("");
    System.out.println(frank);
    System.out.println("");
    System.out.println(chu);
  }
}