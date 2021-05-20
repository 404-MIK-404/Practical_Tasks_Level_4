import java.util.*;


public class Task39 {

    public static void main(String[] args)
    {
        int valueone,valuetwo;
        Scanner ui = new Scanner(System.in);
        System.out.print("Введите первое число для сложения: ");
        valueone = ui.nextInt();
        System.out.print("Введите второе число для сложения: ");
        valuetwo = ui.nextInt();
        System.out.print("Результат: " + memeSum(valueone,valuetwo));

    }

    public static String memeSum(int value,int value1)
    {
        String tempone = Integer.toString(value);
        String temptwo = Integer.toString(value1);
        int count = 0;
        String result = "";
        if (tempone.length() == temptwo.length())
        {
            for (int i = 0; i < temptwo.length(); i++)
            {
                count =  Character.getNumericValue(tempone.charAt(i)) + Character.getNumericValue(temptwo.charAt(i));
                result += Integer.toString(count);
            }
        }
        else if (tempone.length() > temptwo.length())
        {
            for (int i = 0; i < tempone.length() - temptwo.length(); i++)
            {
                temptwo = "0" + temptwo;
            }
            for (int i = 0; i < temptwo.length(); i++)
            {
                count =  Character.getNumericValue(tempone.charAt(i)) + Character.getNumericValue(temptwo.charAt(i));
                result += Integer.toString(count);
            }
        }
        else
        {
            for (int i = 0; i < temptwo.length() - tempone.length(); i++)
            {
                tempone = "0" + tempone;
            }
            for (int i = 0; i < temptwo.length(); i++)
            {
                count =  Character.getNumericValue(tempone.charAt(i)) + Character.getNumericValue(temptwo.charAt(i));
                result += Integer.toString(count);
            }
        }
        return result;
    }


}
