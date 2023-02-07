

//1. Вычислить n-ое треугольного число(сумма чисел от 1 до n),
//        n! (произведение чисел от 1 до n)


import java.util.Scanner;

public class Hw1_1toN
{

    public static void main(String[] args)
    {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введи число N: ");
        String nValue = iScanner.nextLine();
        int num = FindFact(Integer.parseInt(nValue));
        System.out.printf("Произведение чисел от 1 до n: " + num);

        iScanner.close();
    }

    public static int FindFact(int num){
        if (num == 1) return 1;
        return num * FindFact(num - 1);
    }



}