import java.util.*;
public class PigLatin {
  public static boolean startVowel(String v){
    return v.charAt(0) == 'a' || v.charAt(0) == 'e' || v.charAt(0) == 'i' || v.charAt(0) == 'o' || v.charAt(0) == 'u';
  }
  public static String pigLatinSimple(String s){
    String out = "";
    if (startVowel(s)) {
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
    if (startVowel(s)) {
        out = s;
        out += "hay";
      }
    return out;
  }

  public static void main(String[] args) {
    System.out.println(pigLatinSimple(args[0]));
    System.out.println(pigLatin(args[0]));
  }
}
