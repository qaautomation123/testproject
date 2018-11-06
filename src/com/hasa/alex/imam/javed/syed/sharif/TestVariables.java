package com.hasa.alex.imam.javed.syed.sharif;

public class TestVariables {
    public static void main(String[] args){
        try {
            String color = "-2";

            if (color.equalsIgnoreCase("white")) {
                System.out.println("Test Case Passed");
            } else if (color == "blue") {
                System.out.println("Test Case Passed");
            } else if (color == "black") {
                System.out
                        .println("Test Case Passed");
            } else {
                System.out.println("Test Case Failed" +"" + color);
            }
        }catch (Exception ex){
            System.out.println("Error is "+ ex);
        }



    }
}
