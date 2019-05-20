package editor;

import java.io.File;

import publisher.EventManager;

public class Editor {// открытый класс
    public EventManager events;// создаем переменную типа EventManager
    private File file;// создаем переменную типа File

    public Editor() {
        this.events = new EventManager("open", "save");// переменной events
                                                       // присваеваем экземпляр
                                                       // класса EventManager и
                                                       // получаем класс open и
                                                       // save
    }

    public void openFile(String filePath) {// public=открытый; void=не
                                           // возвращает.
        this.file = new File(filePath);// переменной file присваеваем экземпляр
                                       // класса File и получаем путь к файлу
        events.notify("open", file);// events пробуждает один поток (open)
    }

    public void saveFile() throws Exception {//
        if (this.file != null) {// если переменная file не пустая
            events.notify("save", file);// events пробуждает один поток (save)
        } else {// в противном случае
            throw new Exception("Please open a file first.");// throw = ручное
                                                             // исключение
        }
    }
}