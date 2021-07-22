package com.sngular.devTrining2021.exercises;

public class Algorithm {
    public static String startOz(String str) {
        String rstr = "";

        if(str != null){
            str = str.toLowerCase();

            int i = (str.indexOf("o") > -1)? str.indexOf("o"):((str.indexOf("z") > -1)?str.indexOf("z"):-1);

            if(i > -1 && str.length() > i+1 && str.charAt(i+1) == 'z'){
                rstr = str.substring(i,i+2);
            } else if(i > -1)
                rstr = str.substring(i,i+1);
        }

        return rstr;
    }
}