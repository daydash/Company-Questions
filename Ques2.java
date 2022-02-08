package com.daydash;

import java.util.*;

public class Ques2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        String temp = "";
        StringBuilder outString = new StringBuilder();
        Set<Character> vowelSet = new HashSet<>();
        vowelSet.add('a');
        vowelSet.add('e');
        vowelSet.add('i');
        vowelSet.add('o');
        vowelSet.add('u');
        ArrayList<Character> vowels = new ArrayList<>();
        ArrayList<Character> consonants = new ArrayList<>();

        for (int i = 0; i < inputString.length(); i++) {
            if (vowelSet.contains(inputString.charAt(i)))
                vowels.add(inputString.charAt(i));
            else
                consonants.add(inputString.charAt(i));
        }
        Collections.sort(vowels);
        Collections.sort(consonants);

        for (int i = 0; i < inputString.length(); i++) {
            temp = inputString.charAt(i) + temp;
        }

        if (vowels.isEmpty()) {
            outString.append("NA").append(-1);
        } else {
            for (Character ch : vowels) {
                outString.append(ch);
            }
            outString.append(inputString.indexOf(vowels.get(0)));
        }

        if(consonants.isEmpty()){
            outString.append("NA").append(-1);

        }else {
            for (Character ch : consonants) {
                outString.append(ch);
            }
            outString.append(temp.length() - temp.indexOf(consonants.get(consonants.size() - 1)) - 1);
        }

        System.out.println(outString);
    }
}
