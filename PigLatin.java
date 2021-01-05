import java.util.*;
public class PigLatin {
  public static boolean startVowel(String v, int i){
    return v.charAt(i) == 'a' || v.charAt(i) == 'e' || v.charAt(i) == 'i' || v.charAt(i) == 'o' || v.charAt(i) == 'u';
  }
  public static boolean digraph (String s){
    boolean x = false;
    String [] dList = new String[] {"bl", "br", "ch", "ck", "cl", "cr", "dr", "fl", "fr", "gh", "gl", "gr", "ng", "ph", "pl", "pr", "qu", "sc", "sh", "sk", "sl", "sm", "sn", "sp", "st", "sw", "th", "tr", "tw", "wh", "wr"};
    for (int i=0; i < dList.length; i++){
      if (s.substring(0,2).equals(dList[i])){
        x = true;
      }
    }
    return x;
  }

  public static String pigLatinSimple(String s){
    s = s.toLowerCase();
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
    return out.toLowerCase();
  }

  public static String pigLatin(String s){
    s = s.toLowerCase();
    String out = "";
    if (startVowel(s,0)) {
        out = s;
        out += "hay";
    }
    //else if (startVowel(s,1) == false || s.substring(0, 2).equals("qu")){
    else if (digraph(s)){
      for (int i = 2; i < s.length(); i++){
        out += s.charAt(i);
      }
      out += s.substring(0, 2) + "ay";
    }
    else if (startVowel(s,0) == false){
      for (int i = 1; i < s.length(); i++){
        out += s.charAt(i);
      }
      out += s.charAt(0) + "ay";
    }
    return out.toLowerCase();
  }

  public static String pigLatinBest(String s){
    s = s.toLowerCase();
    String out = "";
    String punctuation = "";
    if (Character.isLetter(s.charAt(s.length()-1)) == false && Character.isDigit(s.charAt(s.length()-1)) == false){
      punctuation += s.charAt(s.length() - 1);
      s = s.substring(0, s.length()-1);
    }
    if (Character.isLetter(s.charAt(0)) == false){
      out = s;
    }
    else {
      out = pigLatin(s);
    }
    out += punctuation;
    return out.toLowerCase();
  }

  public static void main(String[] args) {
    Scanner n = new Scanner(System.in);
    while(n.hasNextLine()){
      String out = "";
      Scanner line = new Scanner (n.nextLine());
        while (line.hasNext()){
          String word = line.next();
          out += pigLatinBest(word);
          out += " ";
        }
        out = out.substring(0, out.length() - 1);
        System.out.println(out);
    }
  }
}
