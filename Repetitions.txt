/*
 * We burn
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
    Scanner s = new Scanner(System.in);
    int streak=1, maxStreak=1;
    
    String dna=s.nextLine();
    System.out.print(dna.length());
    for (int i = 0; i < dna.length(); i++)
    {
  
    if(dna.charAt(i)==dna.charAt(i-1)){
        streak++;
        maxStreak=Math.max(maxStreak,streak);
    }
    else
    {
        streak=1;
    }
    }
    System.out.print(maxStreak);
    }
}
//for (int i = 0; i < s.length(); i++){
//    char c = s.charAt(i);  