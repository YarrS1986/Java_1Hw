
//Вывести все простые числа от 1 до 1000


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Hw2_simplNum
{
    public static void main(String[] args)
    {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введи крайнее число, для нахождения простых чисел в последовательности: ");
        String nValue = iScanner.nextLine();
        int num = Integer.parseInt(nValue);
        Integer[] arr = {1};
        boolean isPrime = true;
        for (int i = 2; i <= num; i++)
        {
            for (int j = 2; j < i; j++)
            {
                if (i % j == 0)
                {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                arr = append(arr, i);
            }
            else isPrime = true;


        }
        System.out.println(Arrays.asList(arr));
        iScanner.close();
    }


    private static Integer[] append(Integer[] arr, int element)
    {
        List<Integer> list = new ArrayList<>(Arrays.asList(arr));
        list.add(element);
        return list.toArray(new Integer[0]);
    }
}