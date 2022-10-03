import java.util.*;

public class Task33 {

    /**
     *
     * lPaeesh le pemu mnxit ehess rtnisg! О, извините, это должно было быть: Пожалуйста, помогите мне распутать эти строки!
     *
     * Каким-то образом все строки перепутались, каждая пара символов поменялась местами. Помоги отменить это, чтобы снова понять строки.
     *
     * Пример:
     * unmix("123456") ➞ "214365"
     *
     * unmix("hTsii  s aimex dpus rtni.g") ➞ "This is a mixed up string."
     *
     * unmix("badce") ➞ "abcde"
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
        System.out.print(unmix(value));
    }

    public static String unmix(String text)
    {
        String temp = "";
        for (int i = 0; i < text.length()-1; i+=2)
        {
            temp += Character.toString(text.charAt(i+1)) + Character.toString(text.charAt(i));
        }
        if (text.length() % 2 != 0){
            temp += Character.toString(text.charAt(text.length()-1));
        }
        return temp;
    }



}
