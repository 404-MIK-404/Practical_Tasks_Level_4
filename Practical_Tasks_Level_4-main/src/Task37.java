import java.util.*;


public class Task37 {


    /**
     *
     * Это вызов обратного кодирования. Обычно вам дают явные указания о том, как создать функцию. Здесь вы должны сгенерировать свою собственную функцию, чтобы удовлетворить соотношение между входами и выходами.
     *
     * Ваша задача состоит в том, чтобы создать функцию, которая при подаче входных данных ниже производит показанные примеры выходных данных.
     *
     * Пример:
     * 832 ➞ 594
     *
     * 51 ➞ 36
     *
     * 7977 ➞ 198
     *
     * 1 ➞ 0
     *
     * 665 ➞ 99
     *
     * 149 ➞ 0
     *
     *
     * @param args
     */

    public static void main(String[] args)
    {
        int value;
        Scanner ui = new Scanner(System.in);
        System.out.print("Количество элементов в массиве: ");
        value = ui.nextInt();
        convert(value);
    }



    public static void convert(int x){
        int temp=x;
        String str=Integer.toString(x);
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            result = str.charAt(i) + result;
        }
        char[] c = result.toCharArray();
        Arrays.sort(c);
        String stringC = String.valueOf(c);
        int newC=Integer.parseInt (stringC);
        int res=temp-newC;

        System.out.println(res);
    }


}
