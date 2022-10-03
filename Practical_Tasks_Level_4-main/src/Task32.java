import javax.annotation.processing.SupportedSourceVersion;
import java.util.*;

public class Task32 {

    /**
     *
     * Создайте функцию, которая определяет, могут ли элементы в массиве быть переупорядочены,
     * чтобы сформировать последовательный список чисел, где каждое число появляется ровно один раз.
     *
     * cons([5, 1, 4, 3, 2]) ➞ true
     * // Can be re-arranged to form [1, 2, 3, 4, 5]
     *
     * cons([5, 1, 4, 3, 2, 8]) ➞ false
     *
     * cons([5, 6, 7, 8, 9, 9]) ➞ false
     * // 9 appears twice
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
            array.add(rand.nextInt((10 - 1) + 1) + 1);
        }
        System.out.println("Массив: " + array.toString());
        System.out.println("Результат: "+  cons(array) );
    }

    public static boolean cons(ArrayList<Integer> array)
    {
        HashSet<Integer> value = new HashSet<>(array);
        if (array.size() != value.size()){
            return false;
        }
        Collections.sort(array);
        if (array.get(array.size()-1) - array.get(0) - array.size() + 1 != 0){
            return false;
        }
        return true;
    }


}
