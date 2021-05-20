import java.util.*;


public class Task37 {




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
