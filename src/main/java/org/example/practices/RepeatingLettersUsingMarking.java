package org.example.practices;

public class RepeatingLettersUsingMarking {

    public String findRepeatingLettersUsingMarking(String str){

        int charCount = 0;

        StringBuilder strBuilder = new StringBuilder();

        for (int i = 0; i < str.length(); i++){
            charCount = 1;

            if (str.charAt(i) == '.')
                continue;

            if (i == str.length() - 1)
                break;

            for (int j = i + 1; j < str.length(); j++){

                if (str.charAt(i) == str.charAt(j)){
                    charCount++;
                    str = str.substring(0, j) + '.' + str.substring(j + 1);
                }
            }

            if (charCount > 1)
                strBuilder.append(str.charAt(i));

        }


        return strBuilder.toString();
    }
}
