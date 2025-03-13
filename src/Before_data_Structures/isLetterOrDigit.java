package Before_data_Structures;

import java.util.Scanner;
public class isLetterOrDigit {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String x = in.next();
        String y ="";
        for (int i=0;i<x.length();i++){
            if (Character.isLetterOrDigit(x.charAt(i))){
                y+= x.charAt(i);
            }
        }
        System.out.println(y);
    }
}