import java.util.*;

public class Task31 {

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
        Collections.sort(array);
        System.out.println("Массив: " + array.toString());
        System.out.println("Результат: "+ sevenBoom(array) );
    }

    public static String sevenBoom(ArrayList<Integer> array)
    {
        for (int i = 0; i < array.size(); i ++)
        {
            for (int j = 0; j < array.get(i).toString().length(); j++) {

                char temp = array.get(i).toString().charAt(j);
                if (temp == '7')
                {
                    return "Boom !";
                }
            }
        }
        return "There is no 7 in the array";
    }


}
