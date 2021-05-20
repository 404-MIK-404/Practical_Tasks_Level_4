import java.util.*;

public class Task36 {


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

    public static void largestGap(ArrayList<Integer> array)
    {
        Collections.sort(array);
        int value = 0;
        String outfirstvalue = "Цифры нет";
        String outtwovalue = "Цифры нет";
        for (int i = 0; i < array.size() - 1; i++)
        {
            if ( value < array.get(i+1) - array.get(i))
            {
                value = array.get(i+1) - array.get(i);
                outfirstvalue = array.get(i).toString();
                outtwovalue = array.get(i+1).toString();
            }
        }
        System.out.println("Массив: " + array.toString());
        System.out.println("Результат: " + value + " самый большой разрыв в массиве находиться между " + outfirstvalue + " и " + outtwovalue);
    }


}
