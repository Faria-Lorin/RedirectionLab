import java.util.*;
public class PigLatin {
  public static boolean startVowel(String v, int i){
    return v.charAt(i) == 'a' || v.charAt(i) == 'e' || v.charAt(i) == 'i' || v.charAt(i) == 'o' || v.charAt(i) == 'u';
  }
  public static String pigLatinSimple(String s){
    String out = "";
    if (startVowel(s,0)) {
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
    if (startVowel(s,0)) {
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
