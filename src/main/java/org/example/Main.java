package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        MusicPlayer musicPlayer = context.getBean(MusicPlayer.class);
        musicPlayer.singClassicalMusic();
        musicPlayer.singRockMusic();
    }
}
