import java.util.*;

class Anagram{

    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);

        String S= sc.nextLine();
        String N= sc.nextLine();

        char[] a= S.toCharArray();
        char[] b= N.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        if (Arrays.equals(a,b)){
            System.out.println("Same");
        }
        else{
            System.out.println("Not Same");
        }
    }
}