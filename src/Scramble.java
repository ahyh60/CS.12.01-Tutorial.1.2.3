
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Scramble {

    static String scrambleWord(String x){
        String scramble = "";
        for (int i = 0; i < x.length()-1; i++){
            if(x.charAt(i)=='A' && x.charAt(i+1)!='A'){
                scramble+=""+x.charAt(i+1)+x.charAt(i);
                i++;
            }else{
                scramble+=(char)x.charAt(i);
            }
        }
        if(scramble.length()<x.length()){
            scramble+=x.charAt(x.length()-1);
        }
        return scramble;
    }

    static List<String> scrambleOrRemove(List<String> wordlist){
        for (int i = wordlist.size()-1; i >= 0; i--){
            String w = scrambleWord(wordlist.get(i));
            System.out.println(w);
            if(w.equals(wordlist.get(i))){
                wordlist.remove(i);
            }else{
                wordlist.set(i, w);
            }
        }
        return wordlist;
    }
}