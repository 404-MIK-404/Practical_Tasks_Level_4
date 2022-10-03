import java.util.*;


public class Task39 {
    /**
     *
     *
     *
     * Для этой задачи забудьте, как сложить два числа вместе.
     * Лучшее объяснение того, что нужно сделать для этой функции это примеры:
     *
     *
     * Пример:
     * memeSum(26, 39) ➞ 515
     * // 2+3 = 5, 6+9 = 15
     * // 26 + 39 = 515
     *
     * memeSum(122, 81) ➞ 1103
     * // 1+0 = 1, 2+8 = 10, 2+1 = 3
     * // 122 + 81 = 1103
     *
     * memeSum(1222, 30277) ➞ 31499
     *
     *
     *
     *
     * @param args
     */
    public static void main(String[] args)
    {
        String valueone,valuetwo;
        Scanner ui = new Scanner(System.in);
        System.out.print("Введите первое число для сложения: ");
        valueone = ui.nextLine();
        System.out.print("Введите второе число для сложения: ");
        valuetwo = ui.nextLine();
        memeSum(valueone,valuetwo);

    }

    public static void memeSum(String value,String value1)
    {
        String result = "";
        if (value.length() > value1.length()){
            for (int i = 0; i < (value.length() - value1.length()); i++){
                value1 = "0" + value1;
            }
        }
        else {
            for (int i = 0; i < (value1.length() - value.length()); i++){
                value = "0" + value;
            }
        }
        for (int i = 0; i < value.length();i++){
            String aaa = Integer.toString(Integer.parseInt(value1.charAt(i) + "") + Integer.parseInt(value.charAt(i) + ""));
            result += aaa;
        }
        System.out.println(result);
    }


}
