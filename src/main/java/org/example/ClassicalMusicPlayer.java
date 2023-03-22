package org.example;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
public class ClassicalMusicPlayer implements Sing {

    private ArrayList<Song> songs;

    public ClassicalMusicPlayer(ArrayList<Song> songs) {
        this.songs = songs;
    }

    @Override
    public void sing() {
        System.out.println("You are listening: ");
        songs.forEach(song -> System.out.println(song.getName() + "composer is " + song.getComposer()));
    }
}
