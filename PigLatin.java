import java.util.*;
public class PigLatin {
  public static String pigLatinSimple(String s){
    String out = "";
    if (s.charAt(0) == 'a' || s.charAt(0) == 'e' || s.charAt(0) == 'i' || s.charAt(0) == 'o' || s.charAt(0) == 'u'){
        out = s;
        out += "hay";
      }
    else {
      for (int i = 1; i < s.length(); i++){
        out += s.charAt(i);
      }
      out += s.charAt(0) + "ay";
    }
    return out;
  }
  public static String pigLatin(String s){
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
