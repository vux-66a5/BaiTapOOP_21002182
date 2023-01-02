package lab12.designpatterns.observer.pseudocode;

import java.io.File;

public interface EventListener {
    void update(String eventType, File file);
}