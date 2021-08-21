package com.company;

//Переменные и их типы

public class Variables {
    public static void main(String[] args) {

        // Целые типы данных

     byte b = 10 ; // (-128, 127)
     short s  = 2000;
     long l  = -393939399;
     int i = 29999999;

      char c = 'S'; // беззнаковое целое число, представляющее собой символ UTF-16 (буквы и цифры)


      // Вещественные типы (double, float)
        //Вещественные типы (или типы с плавающей точкой) представляют значения, имеющие дробную часть.

     float f = 35.6f;
     double  d = 45.47;

     // Логический тип

      boolean bool = true; // Значение - true (истина) или false (ложь)

    // Ссылочные типы - это все остальные типы: классы, перечисления и интерфейсы, например, объявленные в стандартной библиотеке Java, а также массивы.
    // Строки это объекты класса String, они очень распространены, поэтому в некоторых случаях обрабатываются отлично от всех остальных объектов. Строковые литералы записываются в двойных кавычках.

    String str = "myFirstString";

    String result = "";
        result += "Byte b = " + b + "\n";
        result += "Short s = " + s + "\n";
        result += "int i = " + i + "\n";
        result += "long l = " + l + "\n";
        result += "float f = " + f + "\n";
        result += "Double d = " + d + "\n";
        result += "Boolean bool = " + bool + "\n";
        result += "char c = " + c + "\n";
        result += "String str = " + str + "\n";
        System.out.println(result);

        String str_n = "53";
        int summa = Integer.parseInt(str_n) + 20 ;
        System.out.println(summa);


    }
}
