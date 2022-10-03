import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task34 {

    /**
     *
     * Создать функцию, которая преобразует предложения, заканчивающиеся несколькими вопросительными знаками ? или восклицательными знаками ! в предложение, заканчивающееся только одним, без изменения пунктуации в середине предложений.
     *
     * Пример:
     * noYelling("What went wrong?????????") ➞ "What went wrong?"
     *
     * noYelling("Oh my goodness!!!") ➞ "Oh my goodness!"
     *
     * noYelling("I just!!! can!!! not!!! believe!!! it!!!") ➞ "I just!!! can!!! not!!! believe!!! it!"
     * // Only change repeating punctuation at the end of the sentence.
     *
     * noYelling("Oh my goodness!") ➞ "Oh my goodness!"
     * // Do not change sentences where there exists only one or zero exclamation marks/question marks.
     *
     * noYelling("I just cannot believe it.") ➞ "I just cannot believe it."
     *
     * Примечание:
     * - Меняйте только окончательную пунктуацию - оставляйте восклицательные или вопросительные знаки в середине предложения неизменными (см. Третий пример).
     * - Не беспокойтесь о смешанной пунктуации (нет случаев, которые заканчиваются чем-то вроде ?!??!).
     * - Сохраняйте предложения, в которых нет вопросительных/восклицательных знаков, одинаковыми.
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
        noYelling(value);
    }

    public static void noYelling(String text)
    {
        try {
            Pattern pattern = Pattern.compile("[a-zA-Z?]+$|[a-zA-Z!]+$");
            Matcher matcher = pattern.matcher(text);
            String result = "";
            while (matcher.find()){
                result = matcher.group(0);
            }
            StringBuilder textFinal = new StringBuilder(result);
            int indexStart = result.indexOf(textFinal.charAt(result.length()-1));
            int indexEnd = result.lastIndexOf(textFinal.charAt(result.length()-1));
            textFinal.replace(indexStart,indexEnd,"");
            text = text.replace(result,textFinal.toString());
            System.out.print(text);
        } catch (Exception ex){
            System.out.print("Результат: " + text);
        }
    }

}
