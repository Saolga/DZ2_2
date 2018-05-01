package main.java;
import java.util.Scanner;//Для работы с консолью

public class MyClass {
    public static void main(String[] args){
        /*Массив размерностью 20, заполняется случайными целыми числами от -10 до 10.
         Находим максимальный отрицательный и минимальный положительный элементы массива.
         Меняем их местами.
         Ноль не считается ни положительным, ни отрицательным.
         */
        int arr[]=new int[20];
        for(int i=0;i<arr.length;++i)
            arr[i]=-10+(int)(Math.random()*21);
        for(int a:arr)      //выводим полученную последовательность
            System.out.println(a);
        int maxuz=-11;//максимальное среди отрицательных
        int i_maxuz =0,i_minaz=0;
        int minaz=11;//минимальное среди положительных
        for (int i=0;i<arr.length;++i){     //находим их
            if(arr[i]<0 && arr[i]>maxuz){
                i_maxuz=i;
                maxuz=arr[i];
            }
            else if(arr[i]>0 && arr[i]<minaz){
               i_minaz=i;
               minaz=arr[i];
            }
        }
        System.out.println("Наибольшее отрицательное число: "+maxuz+" ,индекс: "+i_maxuz);
        System.out.println("Наименьшее положительное число: "+minaz+" ,индекс: "+i_minaz);

        int t=arr[i_maxuz];     //меняем местами
        arr[i_maxuz]=arr[i_minaz];
        arr[i_minaz]=t;

        for(int a:arr)      //выводим новую последовательность
            System.out.println(a);
    }
}
