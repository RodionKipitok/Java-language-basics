package com.company;

public class Logic {
    public static void main (String[] args){
       boolean b1  = true;
       boolean b2 = false;
       boolean b3 = true;

       boolean a1 = true ;
       boolean a2 = false;

       // Логическая операция  и "&&"

        System.out.println( b1 +"  &&  " + b2 + " = " + (b1 && b2));
        System.out.println( b1 +"  &&  " + b3 + " = " + (b1 && b3));

       // Логическая операция  или  " || "

        System.out.println( a1 +" || " + a2 + " = " + (b1 && b2));

        // Логический оператор исключения " ^ "

        System.out.println( a1 +" ^ " + a2 + " = " + (b1 && b2));

       // Логический оператор отрицание  " ! "

        System.out.println(" ! " + b1 + " = " + !b1);
    }
}
