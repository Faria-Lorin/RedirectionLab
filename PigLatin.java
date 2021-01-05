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
    else if ((startVowel(s,0) == false && startVowel(s,1) == false) || s.substring(0, 2).equals("qu")){
      for (int i = 2; i < s.length(); i++){
        out += s.charAt(i);
      }
      out += s.substring(0, 2) + "ay";
    }
    else {
      for (int i = 1; i < s.length(); i++){
        out += s.charAt(i);
      }
      out += s.charAt(0) + "ay";
    }
    return out;
  }

  public static String pigLatinBest(String s){
    String out = "";
    String punctuation = "";
    if (Character.isLetter(s.charAt(s.length()-1)) == false && Character.isDigit(s.charAt(s.length()-1)) == false){
      punctuation += s.charAt(s.length() - 1);
      s = s.substring(0, s.length()-1);
    }
    if (Character.isLetter(s.charAt(0)) == false){
      out = s;
    }

    out += punctuation;
    return out;
  }

  public static void main(String[] args) {
    System.out.println(pigLatinSimple(args[0]));
    System.out.println(pigLatin(args[0]));
    System.out.println(pigLatinBest(args[0]));
  }
}
