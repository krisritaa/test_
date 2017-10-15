package com.ericsson.java8.regix;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpr {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("e.+?d");
        Matcher matcher = pattern.matcher("end e111d ed");
        while(matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
