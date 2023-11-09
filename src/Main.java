import java.util.Random;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
  public static void main(String[] args) {
    //Play again Loop pt1
    boolean again = true;
    while (again == true) {
      //INTRO LIKE PDF
      System.out.println("*************************************");
      System.out.println("\u00A0\u00A0\u00A0\u00A0\u00A0\u00A0\u00A0 ZUFALLSZAHL RATEN");
      System.out.println("\u00A0\u00A0 Sie muessen eine zufaellige Zahl");
      System.out.println("\u00A0\u00A0\u00A0 zwischen 1 und 1.000 raten");
      System.out.println("\u00A0 Dabei haben Sie maximal 10 Versuche");
      System.out.println("Nach den 10 Versuchen haben Sie verloren !");
      System.out.println("*************************************");
      //PROCESSING RANDOM NUMBER
      Random rnd = new Random();
      int number = rnd.nextInt(1001);
      //PROCESSING INPUT
      int count = 0;
      Scanner sc = new Scanner(System.in);
      while (count != 10) {
      int yournumber = sc.nextInt();
        count++;
        if (yournumber == number) {
          System.out.println("Ihr "+count +". Versuch:   " + yournumber);
          break;
        }
        if (yournumber > number) {
          System.out.println("Ihr "+ count +". Versuch:   " + yournumber);
          System.out.println("Die Zahl war zu hoch");
        }
        if (yournumber < number) {
          System.out.println("Ihr "+ count +". Versuch:   " + yournumber);
          System.out.println("Die Zahl war zu niedrig");
        }

        System.out.println();

      }
      //PROCESSING WINNING&LOSING
      if (count == 10) {
        System.out.println("*************************************");
        System.out.println("\u00A0\u00A0\u00A0\u00A0 Leider verloren");
        System.out.println("*************************************");
      } else {
        System.out.println("*************************************");
        System.out.println("\u00A0\u00A0\u00A0\u00A0 Herzlichen Glueckwunsch");
        System.out.println("\u00A0\u00A0\u00A0\u00A0\u00A0\u00A0 Sie haben gewonnen");
        System.out.println("*************************************");
      }
      //Play again Loop pt2
      System.out.println("Möchten Sie noch einmal spielen? (Ja:1/Nein:2)");
      if (sc.nextInt()!=1){
        again=false;
      }
    }
  }
}