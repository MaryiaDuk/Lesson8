package by.it_academy.inputText;

import java.util.Scanner;

public class ConsoleInputText implements InputText {
    private StringBuilder stringBuilder = new StringBuilder();

    @Override
    public String readText() {
        Scanner in = new Scanner(System.in);
        String text;
        System.out.println("Введите текст. Он должен оканчиваться 'StopOfInput'.");
        while (in.hasNextLine()) {
            stringBuilder.append(in.nextLine());
            stringBuilder.append(" ");
            text = stringBuilder.toString();
            if (text.indexOf("StopOfInput") > 0) {
                int i = stringBuilder.indexOf("StopOfInput");
                stringBuilder.delete(i, i + 11);
                break;
            }
        }
        return stringBuilder.toString();
    }

    @Override
    public void showInputText(){
        System.out.println("Вы ввели:\n"+stringBuilder.toString());
    }
}