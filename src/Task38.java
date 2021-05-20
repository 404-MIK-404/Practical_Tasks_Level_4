import java.util.*;


public class Task38 {


    public static void main(String[] args)
    {
        String value;
        Scanner ui = new Scanner(System.in);
        System.out.print("Введите текст: ");
        value = ui.nextLine();
        commonLastVowel(value);

    }

    public static void commonLastVowel(String value)
    {
        String[] array = value.split("[ ]");
        char temp = ' ';
        for (int i = 0 ; i < array.length; i++)
        {
            for (int j = 0; j < array[i].length();j++)
            {
                if (checkVowes(array[i].charAt(j)))
                {
                    temp = array[i].charAt(j);
                }
            }
        }
        System.out.print("Наиболее распрастранённая последняя гласная это: " + temp);


    }

    public static boolean checkVowes(char symbol)
    {
        char[] vowes = {'a','e','i','o','u','y'};
        for (int k = 0; k < vowes.length; k++)
        {
            if (vowes[k] == Character.toLowerCase(symbol))
            {
                return true;
            }
        }
        return false;
    }


}
