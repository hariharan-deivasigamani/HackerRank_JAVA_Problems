'https://www.hackerrank.com/challenges/java-output-formatting/problem'


import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                System.out.printf("%-15s%03d%n",s1,x);// %-15s "SPECIFY 15CHARACTER SPACE S= CHARACTER || %03D 3=only 3 digit d = decimal || %n = newline"
            }
            System.out.println("================================");

    }
}



