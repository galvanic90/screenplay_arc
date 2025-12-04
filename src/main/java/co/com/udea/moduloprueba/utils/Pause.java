package co.com.udea.moduloprueba.utils;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

public class Pause {
    public static Performable forSeconds(int seconds) {
        return Task.where("{0} waits for " + seconds + " seconds",
                actor -> {
                    try {
                        Thread.sleep(seconds * 1000L);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
        );
    }
}
