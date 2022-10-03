import java.util.*;

public class Task31 {

    /**
     *
     * Создайте функцию, которая принимает массив чисел и возвращает "Бум!", если в массиве появляется цифра 7. В противном случае верните "в массиве нет 7".
     *
     * Пример:
     * sevenBoom([1, 2, 3, 4, 5, 6, 7]) ➞ "Boom!"
     * // 7 contains the number seven.
     *
     * sevenBoom([8, 6, 33, 100]) ➞ "there is no 7 in the array"
     * // None of the items contain 7 within them.
     *
     * sevenBoom([2, 55, 60, 97, 86]) ➞ "Boom!"
     * // 97 contains the number seven.
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
            array.add(rand.nextInt((100 - 1) + 1) + 1);
        }
        System.out.println("Массив: " + array.toString());
        System.out.println("Результат: "+ sevenBoom(array) );
    }

    public static String sevenBoom(ArrayList<Integer> array)
    {
        for (int i = 0; i < array.size();i++){
            String value = String.valueOf(array.get(i));
            if (value.contains("7")){
                return  "Boom";
            }
        }
        return "There is no 7 in the array";
    }


}
