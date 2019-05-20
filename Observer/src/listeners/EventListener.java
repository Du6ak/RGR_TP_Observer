package listeners;

import java.io.File;

public interface EventListener {// интерфейс подписчиков
    void update(String eventType, File file);// не возвращает
}