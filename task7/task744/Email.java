package com.epamjavaweb.task7.task744;
/*
Дан email в строке. Определить, является ли он корректным (наличие символа @ и точки,
наличие не менее двух символов после последней точки и т.д.).
 */

public class Email {
    public static void main(String[] args) {
        String strE = "ij.ijjij@ijiknu.jj";
        boolean letDig = strE.matches("\\w+(\\.\\w+)*[@]\\w+(\\.\\w+)+");
        int lastPoint = strE.lastIndexOf('.');
        System.out.println("The email is set");
        System.out.println(strE);
        if (letDig & (strE.length() - lastPoint - 1 >= 2)) {
            System.out.println("The address is correct");
        } else {
            System.out.println("The address is not correct");
        }
    }
}
