import java.util.*;
public class PigLatin {
  public static String pigLatinSimple(String s){
    String out = "";
    if (s.charAt(0) == 'a' || s.charAt(0) == 'e' || s.charAt(0) == 'i' || s.charAt(0) == 'o' || s.charAt(0) == 'u'){
        out = s;
        out += "hay";
      }
      return out;
    }
  public static void main(String[] args) {
    System.out.println(pigLatinSimple(args[0]));
  }
}
