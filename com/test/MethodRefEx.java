package com.test;

public class MethodRefEx {
    public static void main(String[] args) {
        MyPrinter myPrinter = new MyPrinter();
        StringParser stringParser = new StringParser();
        myPrinter.print("xyz", stringParser::convert);
    }
}

interface Parser {
    String parse(String s);
}

class StringParser {
    public String convert(String s) {
        if (s.length() <= 3) {
            s = s.toUpperCase();
        } else {
            s = s.toLowerCase();
        }
        return s;
    }
}

class MyPrinter {
    public void print(String str, Parser p) {
        str = p.parse(str);
        System.out.println(str);
    }
}
