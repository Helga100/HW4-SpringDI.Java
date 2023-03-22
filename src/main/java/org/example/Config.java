package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;

@Configuration

public class Config {
    @Bean
    public ClassicalMusicPlayer classicalMusicPlayer() {
        ArrayList<Song> classicSongs = new ArrayList<>(Arrays.asList(new Song("The Walz Of the rain", "Shopen"),
                new Song("Le Vent", "Ennio Morricone")));
        return new ClassicalMusicPlayer(classicSongs);
    }

    @Bean
    public RockMusicPlayer rockMusicPlayer() {
        ArrayList<Song> rockSongs = new ArrayList<>(Arrays.asList(new Song("The Ceiling", "Jaws"),
                new Song("Adore life", "Savages")));
        return new RockMusicPlayer(rockSongs);
    }

    @Bean
    public MusicPlayer musicPlayer(ClassicalMusicPlayer classicalMusicPlayer, RockMusicPlayer rockMusicPlayer) {
        return new MusicPlayer(classicalMusicPlayer, rockMusicPlayer);
    }
}
