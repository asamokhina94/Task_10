import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество строк в матрице: ");
        int n = in.nextInt(); //запись введённого значения количества строк в переменную
        System.out.print("Введите количество столбцов в матрице: ");
        int m = in.nextInt(); //запись введённого значения количества столбцов в переменную
        int array[][] = new int[n][m]; //объявление двухмерного массива
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Задайте " +(j+1)+ " значение " +(i+1)+ " строки " + "и нажмите Enter: ");
                int num = in.nextInt(); //введённые элементы массива записываются в переменную
                array[i][j] = num; //массиву присваиваются введённые значения
            }
        }
        System.out.print("Первая строка матрицы умноженная на 3: ");
        for (int j = 0; j < array[0].length; j++) {
            System.out.print((array[0][j] * 3) + " "); //вывод первой строчки матрицы, умноженной на 3
        }
    }
}