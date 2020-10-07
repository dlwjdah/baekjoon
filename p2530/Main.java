package p2530;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int h =sc.nextInt();
        int m = sc.nextInt();
        int s = sc.nextInt();
        int value = sc.nextInt();

        s= value;
        if(m>=60){
            while(s>=60){
                s-=60;
                m++;
                if(m>=60){
                    m-=60;
                    h++;
                }
                if (h>=24){
                    h=0;
                }
            }
            System.out.println(h + " "+ m + " " + s);

        }
    }
}
