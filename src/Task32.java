import java.util.*;

public class Task32 {


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
        Collections.sort(array);
        System.out.println("Массив: " + array.toString());
        System.out.println("Результат: "+  cons(array) );
    }

    public static boolean cons(ArrayList<Integer> array)
    {
        for (int i = 0; i < array.size(); i++)
        {
            if (array.size() != 1)
            {
                if (((array.get(i+1) - array.get(i)) > 1) || ((array.get(i+1) - array.get(i)) == 0))
                {
                    return false;
                }
            }
            else
            {
                if (array.get(i) > 1)
                {
                    return false;
                }
            }
        }
        return true;
    }


}
