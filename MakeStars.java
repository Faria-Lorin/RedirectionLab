import java.util.*;
public class MakeStars{
  public static void main( String[]args ){
      //use the standard input (terminal input)
      //as the string that you read from]
      String out = "";
      Scanner n = new Scanner(System.in);
      while(n.hasNext()){
      String line = n.nextLine();

      for (int i = 0; i < line.length(); i++){
        if (line.charAt(i) == ' '){
          out += " ";
        }
        out += "*";
      }
    }
    System.out.println(out);
      //use hasNextLine()/nextLine() to loop over
      //all of the data

      //If you want to read the input word by word
      //this can be replaced with hasNext() and next()

  }
}
