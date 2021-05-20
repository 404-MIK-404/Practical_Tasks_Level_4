import java.util.*;

public class Task40 {

    public static void main(String[] args)
    {
        String value;
        Scanner ui = new Scanner(System.in);
        System.out.print("Введите текст: ");
        value = ui.nextLine();
        System.out.print("Результат преобразования: " + unrepeated(value));

    }

    public static String unrepeated(String value)
    {
        String result = "";
        for (int i = 0; i < value.length();i++)
        {
            if (!result.contains(String.valueOf(value.charAt(i))))
            {
                result += value.charAt(i);
            }
        }

        return result;
    }



}
