/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.*;

/**
 *
 * @author Matt
 */
public class Assignment1 {

    private static Map<String,List<String>> anagramsMap = new HashMap<>(100);
    public static void main(String[] args) {
        

        List<String> list = new ArrayList<String>();
        String temp = null;
        Scanner stdin = new Scanner(System.in);

       
            System.out.println("Enter : ");
            while ((temp = stdin.nextLine()).length() > 0) {
               
                list.add(temp);
           } 
        String[] arr = list.toArray(new String[0]);
       

        for (String s: list) {
            char[] word = s.toCharArray();
            Arrays.sort(word);
            String key = String.valueOf(word);
            if (!anagramsMap.containsKey(key)) {
                anagramsMap.put(key, new ArrayList < String > ());
            }

            anagramsMap.get(key).add(s);
        }

        System.out.println("anagramsMap = " + anagramsMap + anagramsMap.size());
    }
}

