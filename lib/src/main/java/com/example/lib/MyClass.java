package com.example.lib;

public class MyClass {
    public static void main(String[] avg){
        java.util.Scanner scanner = new
                java.util.Scanner(System.in);
        System.out.println("請輸入性別年齡:");
        String gender = scanner.nextLine();
        int age = scanner.nextInt();
        if(gender.equals("male")){
            if(age>=18)
                System.out.println("可以結婚哦~");
            else
                System.out.println("不能結婚");
        }
        if(gender.equals("female")){
            if(age>=16)
                System.out.println("可以結婚哦~");
            else
                System.out.println("不能結婚");
        }
    }
}
