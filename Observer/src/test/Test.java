package test;

import editor.Editor;
import listeners.EmailNotificationListener;
import listeners.LogOpenListener;

public class Test {
    public static void main(String[] args) {
        Editor editor = new Editor();// тип + переменная = экземпляр класса
        editor.events.subscribe("open", new LogOpenListener("/path/to/log/file.txt"));// переменная
        editor.events.subscribe("save", new EmailNotificationListener("admin@gmail.com"));

        try {
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}