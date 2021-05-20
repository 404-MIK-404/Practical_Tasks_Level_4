import java.util.*;

public class Task34 {

    public static void main(String[] args)
    {
        String value;
        String result = "";
        ArrayList<String> arrayresult = new ArrayList<String>();
        Scanner ui = new Scanner(System.in);
        System.out.print("Введите текст: ");
        value = ui.nextLine();
        arrayresult = noYelling(value);
        for (int i = 0; i < arrayresult.size();i++)
        {
            result += " " + arrayresult.get(i).toString();
        }
        System.out.println("Результат: " + result);
    }

    public static ArrayList<String> noYelling(String text)
    {
        ArrayList<String> array = new ArrayList<String>();
        String temp = "";
        String tempone = "";
        for (String s : text.split("[ ]"))
        {
            array.add(s);
        }
        for (int i = array.size()-1; i < array.size(); i++)
        {
            for (int j = 0; j < array.get(i).length()-1;j++)
            {
                temp += Character.toString(array.get(i).charAt(j));
                tempone = Character.toString(array.get(i).charAt(j));
                if (tempone.equals("?") || tempone.equals("!"))
                {
                    array.set(i,temp);
                }
            }
        }
        return array;
    }

}
