package org.redis;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by bapaydin on 10.11.2016.
 */
public class RedisCacheExample {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
        MusicService musicService = applicationContext.getBean("musicService",MusicService.class);
        System.out.println("message: " + musicService.play("trumpet"));
        System.out.println("message: " + musicService.play("trumpet"));
        System.out.println("message: " + musicService.play("guitar"));
        System.out.println("message: " + musicService.play("guitar"));

        System.out.println("Done.");
    }
}
