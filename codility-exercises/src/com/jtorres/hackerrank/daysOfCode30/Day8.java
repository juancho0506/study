package com.jtorres.hackerrank.daysOfCode30;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Day8 {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        Map<String, Integer> phonebook = new HashMap<>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            phonebook.put(name, phone);
        }
        while(in.hasNext()){
            String name = in.next();
            // Write code here
            String message = "";
            message = phonebook.containsKey(name) ? name + "=" + phonebook.get(name) : "Not found";
            System.out.println(message);
        }
        in.close();
    }
}
