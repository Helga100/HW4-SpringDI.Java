package org.example;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;

public class RockMusicPlayer implements Sing {
    private ArrayList<Song> songs;

    public RockMusicPlayer(ArrayList<Song> songs) {
        this.songs = songs;
    }

    @Override
    public void sing() {
        System.out.println("You are listening: ");
        songs.forEach(songs -> System.out.println(songs.getName() + "composer is " + songs.getComposer()));
    }
}
