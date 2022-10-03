import java.util.*;
import java.util.stream.Collectors;

public class Task40 {

    /**
     *
     * Создайте функцию, которая удалит все повторяющиеся символы в слове, переданном этой функции. Не просто последовательные символы, а символы, повторяющиеся в любом месте строки.
     *
     * Пример:
     * unrepeated("teshahset") ➞ "tesha"
     *
     * unrepeated("hello") ➞ "helo"
     *
     * unrepeated("aaaaa") ➞ "a"
     *
     * unrepeated("WWE!!!") ➞ "WE!"
     *
     * unrepeated("call 911") ➞ "cal 91"
     *
     *
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
        unrepeated(value);

    }

    public static void unrepeated(String value)
    {
        LinkedHashSet<Character> result = value.chars().mapToObj(e->(char)e).collect(Collectors.toCollection( LinkedHashSet::new ));
        String resultFinal = "";
        for (char value1 : result){
            resultFinal += value1 + "";
        }
        System.out.print("Результат преобразования: " + resultFinal );
    }



}
