package listeners;

import java.io.File;

//Слушатель, рассылающий email-уведомления
public class EmailNotificationListener implements EventListener {// открытый не
                                                                 // возвращающий
                                                                 // класс для
                                                                 // реализации
                                                                 // интерфейса
    private String email;// закрытый

    public EmailNotificationListener(String email) {//
        this.email = email;// переменной email присваеваем email
    }

    @Override // перезапись)
    public void update(String eventType, File file) {// открытый не возвращающий
        System.out.println("Email to " + email + ": Someone has performed " + eventType// вывод
                                                                                       // в
                                                                                       // консоль
                                                                                       // eventType=save
                                                                                       // file.getName()=test.txt
                + " operation with the following file: " + file.getName());
    }
}