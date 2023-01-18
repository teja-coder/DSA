import java.util.Scanner;

public class stringRotationOfEachOther {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two strings");
        String s1 = in.next();
        String s2 = in.next();
        int p1,p2;
        for(p1=0,p2=0;p1<s1.length();p1++){
            if(s1.charAt(p1)!=s2.charAt(p2))
                p2++;
            else{
                if(p2==s2.length()-1){
                    p2=0;
                }
                p1++;
                p2++;
            }
        }
    }
}
