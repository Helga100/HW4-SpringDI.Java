package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    private final ClassicalMusicPlayer classicalMusicPlayer;
    private final RockMusicPlayer rockMusicPlayerMusicPlayer;

    public MusicPlayer(ClassicalMusicPlayer classicalMusicPlayer, RockMusicPlayer rockMusicPlayerMusicPlayer) {
        this.classicalMusicPlayer = classicalMusicPlayer;
        this.rockMusicPlayerMusicPlayer = rockMusicPlayerMusicPlayer;
    }

    public void singClassicalMusic() {
        classicalMusicPlayer.sing();
    }

    public void singRockMusic() {
        rockMusicPlayerMusicPlayer.sing();
    }
}
