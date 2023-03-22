package org.example;

public class Song {
    private String name;
    private String composer;

    public Song(String name, String composer) {
        this.name = name;
        this.composer = composer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getComposer() {
        return composer;
    }

    public void setComposer(String composer) {
        this.composer = composer;
    }

    @Override
    public String toString() {
        return "Song{" +
                "name='" + name + '\'' +
                ", composer='" + composer + '\'' +
                '}';
    }
}
