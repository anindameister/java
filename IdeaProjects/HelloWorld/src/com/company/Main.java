package com.company;

public class Main {

    public static void main(String[] args) {
	// public:accessible from other parts of the program
        //system(class).out(method) PrintStream(class)<-println(method)
        int age=30, temp=20;
        age=40; //,temp=20; doesn't work here maybe because java dont understand the type of variable/identifier
        int viewsCount = 123_456_789;
        long views=2_123_456_789L; //L(no matter what java sees as int incase of _ in the value
        double prices=23.99;
        float price=34.9F; //F at the end because no matter the mentioned variable type, java sees it as double
        char letter='S'; //char single character and hence single quotes, string(multi char)hence double quotes"
        boolean isEligible=true;
        String greeting="hello";
        System.out.println(views);
        System.out.println(prices);
        System.out.println(greeting);
    }
}
