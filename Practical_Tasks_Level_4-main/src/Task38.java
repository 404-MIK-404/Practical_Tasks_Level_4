import java.util.*;


public class Task38 {

    /**
     *
     * Создайте функцию, которая принимает предложение в качестве входных данных и возвращает наиболее распространенную последнюю гласную в предложении в виде одной символьной строки.
     *
     * Пример:
     * commonLastVowel("Hello World!") ➞ "o"
     *
     * commonLastVowel("Watch the characters dance!") ➞ "e"
     *
     * commonLastVowel("OOI UUI EEI AAI") ➞ "i"
     *
     *
     *
     * @param args
     */

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
