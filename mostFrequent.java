import java.util.*;

class mostFrequent{

    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);
        String S= sc.next();

        int[] freq= new int[26];
       
        for(char ch :S.toCharArray()){
                freq[ch-'a']++;
        }
        int maxfreq=0;
        char max='a';
        
        for(int i=0;i<26;i++){
            if(freq[i]>maxfreq){
                maxfreq=freq[i];
                max=(char)(i + 'a');
                }
        }

        System.out.println("frequent caharector is  "+ max);


    }
}