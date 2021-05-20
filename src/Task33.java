import java.util.*;

public class Task33 {

    public static void main(String[] args)
    {
        String value;
        Scanner ui = new Scanner(System.in);
        System.out.print("Введите текст: ");
        value = ui.nextLine();
        System.out.print(unmix(value));
    }

    public static String unmix(String text)
    {
        String temp = "";
        if (text.length() % 2 == 0)
        {
            for (int i = 0; i < text.length()-1; i+=2)
            {
                temp += Character.toString(text.charAt(i+1)) + Character.toString(text.charAt(i));
            }
        }
        else
        {
            for (int i = 0; i < text.length()-1; i+=2)
            {
                temp += Character.toString(text.charAt(i+1)) + Character.toString(text.charAt(i));
            }
            temp += Character.toString(text.charAt(text.length()-1));
        }
        return temp;
    }



}
