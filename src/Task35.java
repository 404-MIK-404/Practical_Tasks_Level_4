import java.util.*;


public class Task35 {

    public static void main(String[] args)
    {
        String value;
        Scanner ui = new Scanner(System.in);
        System.out.print("Введите текст: ");
        value = ui.nextLine();
        System.out.print(xPronounce(value));
    }

    public static String xPronounce(String text)
    {
        String[] array = text.split(" ");
        String temp = "";
        for (int i = 0; i < array.length;i++)
        {
            if (array[i].contains("x"))
            {
                temp = "";
                if (array[i].indexOf("x") == 0 && array[i].length() > 1)
                {
                    for (int j = 0; j < array[i].length();j++)
                    {
                        if (array[i].charAt(j) == 'x')
                        {
                            char value = 'z';
                            temp += Character.toString(value);
                        }
                        else
                        {
                            temp += Character.toString(array[i].charAt(j));
                        }
                    }
                    array[i] = temp;
                }
                else if (array[i].indexOf("x") != 0 || (array[i].indexOf("x") == 0 && array[i].length() == 1))
                {
                    for (int j = 0; j < array[i].length();j++)
                    {
                        if (array[i].charAt(j) == 'x')
                        {
                            String value = "cks";
                            temp += value;
                        }
                        else
                        {
                            temp += Character.toString(array[i].charAt(j));
                        }
                    }
                    array[i] = temp;
                }
            }
        }
        return String.join(" ",array);
    }

}
