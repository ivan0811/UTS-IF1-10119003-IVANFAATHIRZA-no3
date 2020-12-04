package com.ivanfaathirza;

public class Rnb extends MusicGenre implements Blues, Jazz{
    @Override
    public void genreJazz(String artisName) {
        System.out.println(artisName+"adalah genre Jazz");
    }
    @Override
    public void genreBlues(String artisName) {
        System.out.println(artisName+"adalah genre Blues");
    }
}
