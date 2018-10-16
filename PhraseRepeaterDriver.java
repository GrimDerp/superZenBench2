import java.util.Scanner;

public class PhraseRepeaterDriver {
  public static void main( String[] args){
    Scanner keyboard = new Scanner(System.in);
    
    System.out.print("Enter a note: ");
    String msg = keyboard.nextLine();
    System.out.print("How many more times: ");
    int n = keyboard.nextInt();
    
    PhraseRepeater pr = new PhraseRepeater();
    pr.setValues(msg, n);
    System.out.println( pr.getRepeatedPhrase() );
  }
}
