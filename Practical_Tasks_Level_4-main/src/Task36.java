import java.util.*;
import java.util.stream.Collectors;

public class Task36 {

    /**
     *
     *
     * Учитывая массив целых чисел, верните наибольший разрыв между отсортированными элементами массива.
     * Например, рассмотрим массив:
     *
     * [9, 4, 26, 26, 0, 0, 5, 20, 6, 25, 5]
     *
     * ... в котором после сортировки массив становится:
     *
     * [0, 0, 4, 5, 5, 6, 9, 20, 25, 26, 26]
     *
     * .. так что теперь мы видим, что самый большой разрыв в массиве находится между 9 и 20, что равно 11.
     *
     * Пример:
     * largestGap([9, 4, 26, 26, 0, 0, 5, 20, 6, 25, 5]) ➞ 11
     * // After sorting: [0, 0, 4, 5, 5, 6, 9, 20, 25, 26, 26]
     * // Largest gap between 9 and 20 is 11
     *
     * largestGap([14, 13, 7, 1, 4, 12, 3, 7, 7, 12, 11, 5, 7]) ➞ 4
     * // After sorting: [1, 3, 4, 5, 7, 7, 7, 7, 11, 12, 12, 13, 14]
     * // Largest gap between 7 and 11 is 4
     *
     * largestGap([13, 3, 8, 5, 5, 2, 13, 6, 14, 2, 11, 4, 10, 8, 1, 9]) ➞ 2
     * // After sorting: [1, 2, 2, 3, 4, 5, 5, 6, 8, 8, 9, 10, 11, 13, 13, 14]
     * // Largest gap between 6 and 8 is 2
     *
     *
     *
     * @param args
     */

    public static void main(String[] args)
    {
        int value;
        Scanner ui = new Scanner(System.in);
        System.out.print("Количество элементов в массиве: ");
        value = ui.nextInt();
        ArrayList<Integer> array = new ArrayList<Integer>();
        Random rand = new Random();
        for (int i = 0; i < value; i++)
        {
            array.add(rand.nextInt((50 - 1) + 1) + 1);
        }
        largestGap(array);
    }

    public static void largestGap(List<Integer> array)
    {
        Collections.sort(array);
        int maxValue = 0;
        for (int i = 1; i < array.size() - 1;i++){
            if (array.get(i) - array.get(i-1) > maxValue){
                maxValue = array.get(i) - array.get(i-1);
            }
        }
        System.out.println("Массив: " + array);
        System.out.println("Результат: " + maxValue);


    }


}
