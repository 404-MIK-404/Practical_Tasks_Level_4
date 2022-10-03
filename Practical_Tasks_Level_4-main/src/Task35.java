import java.util.*;
import java.util.stream.Collectors;


public class Task35 {

    /**
     * Замените все x на "cks", ЕСЛИ ТОЛЬКО:
     * Слово начинается с "x", поэтому замените его на "z".
     * Слово-это просто буква "х", поэтому замените ее на " cks ".
     *
     * Пример:
     * xPronounce("Inside the box was a xylophone") ➞ "Inside the bocks was a zylophone"
     *
     * xPronounce("The x ray is excellent") ➞ "The ecks ray is eckscellent"
     *
     * xPronounce("OMG x box unboxing video x D") ➞ "OMG ecks bocks unbocksing video ecks D"
     *
     * Примечание:
     * - Все X являются строчными.
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
        xPronounce(value);
    }

    public static void xPronounce(String text)
    {
        String[] arrayText = text.split("[!]|[ ]|[?]|[.]|[,]");
        for (int i = 0; i < arrayText.length;i++){
            if (arrayText[i].contains("x")){
                StringBuilder stringBuilder = new StringBuilder(arrayText[i]);
                while (stringBuilder.indexOf("x") != -1){
                    int indexX = stringBuilder.indexOf("x");
                    if (stringBuilder.charAt(indexX) == stringBuilder.charAt(0) && stringBuilder.length() != 1){
                            stringBuilder = stringBuilder.replace(indexX,indexX+1,"z");
                    } else {
                            stringBuilder = stringBuilder.replace(indexX,indexX+1,"cks");
                    }
                }
                arrayText[i] = stringBuilder.toString();
            }
        }
        String result = Arrays.stream(arrayText).collect(Collectors.joining(" "));
        System.out.println("Результат: " + result);

    }

}
