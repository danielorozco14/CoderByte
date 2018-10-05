package com.company.ChangeLetters;

public class LetterChanges {

    public LetterChanges() {
    }

    public String LetterChanges(String str) {
        StringBuilder result = new StringBuilder();
        char[] strChars = str.toLowerCase().toCharArray();
        char[] replacements = {'b', 'c', 'd', 'E', 'f', 'g', 'h', 'I', 'j', 'k', 'l', 'm', 'n', 'O', 'p', 'q', 'r', 's', 't', 'U', 'v', 'w', 'x', 'y', 'z', 'A'};
        for (int i = 0; i < str.length(); i++) {

            if(strChars[i] >= 'a' && strChars[i] <= 'z'){
               result.append(replacements[strChars[i] - 97]);
            }
            else {
                result.append(strChars[i]);
            }

            //result.append(strChars[i] >= 'a' && strChars[i] <= 'z' ? replacements[strChars[i] - 97] : strChars[i]);
        }

        return result.toString();
    }


}
