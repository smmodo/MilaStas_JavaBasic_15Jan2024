package com.gmail.squizikbro.music;

public class MusicStylesPlayer {
    public static void main(String[] args) {
        MusicStyles[] styles = {
                new ClassicMusic(),
                new RockMusic(),
                new PopMusic(),
                new RockMusic(),
                new ClassicMusic(),
        };

        for (MusicStyles style : styles) {
            style.playMusic();
        }
    }
}
