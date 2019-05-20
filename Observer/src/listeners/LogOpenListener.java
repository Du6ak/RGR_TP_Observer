package listeners;

import java.io.File;

//Слушатель, записывающий лог операций
public class LogOpenListener implements EventListener {// расширение интерфесом
    private File log;// закрытый класс

    public LogOpenListener(String fileName) {
        this.log = new File(fileName);// переменной log присваеваем расположение
                                      // файла
    }

    @Override
    public void update(String eventType, File file) {
        System.out.println("Save to log " + log + ": Someone has performed " + eventType
                + " operation with the following file: " + file.getName());
    }
}