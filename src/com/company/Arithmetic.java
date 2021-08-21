package com.company;

//Арифметические операции


public class Arithmetic {
    public  static  void  main(String[]args){
        int a = 10;
        int b = 20;
        int result = a + b;
        System.out.println("Сумма: " + result);
         result = a- b;
        System.out.println("Разность: " + result);
         result = a * b ;
        System.out.println("Произведения: " + result);
         result = b / a ;
        System.out.println("Деление: " + result);
        double d = (double) a / b ;     // преобразование переменой в другой тип даннах
        System.out.println("Деление " + d );
         result = 7 % 3;
        System.out.println("Остаток от деление " + result);
         a++; // a = a + 1;
        System.out.println("Инкремент " + a);
         b--; d = d - 1 ;
        System.out.println("Декремент " + b);



              /*Декремент - это уменьшение переменой. Чаще всего тоже на единицу.

            Декремент обозначается "--" и  уменьшает значение переменой на 1.
           */
               /* Инкремент - это операция во многих языках программирования,
        которая выполняет увелечения переменой.Чаще всего под
           инкрементом подразумевается увеличение переменой на 1 единицу.

           Инкремент обозначается "++" и  увеличивает значение переменой на 1.
         */

          // Пример
          int x = 10, z = 10;
          x++;
          z--;
         System.out.println( "x : " + x + ", z : " + z);
    }
}