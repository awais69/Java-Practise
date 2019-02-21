/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractise;

import java.util.Scanner;

/**
 *
 * @author M Awais
 */
public class ForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Line of code to findout vowels:");
        String inp = sc.nextLine();
        int vowelCount = 0;
        for(int i = 0; i<inp.length();i++){
            switch(inp.toLowerCase().charAt(i)){
                case 'a' : case 'e': case 'i': case 'o': case 'u':
                    vowelCount++;
                    break;
            }
        }
        
        System.out.println("The vowels in your given line are "+vowelCount);
        
    }
}
