package com.ivanfaathirza;

public class Metal extends HardRock implements HeavyMetal{
    public void genreMetal(String artisName){
        System.out.println(artisName+"adalah genre Metal");
    }


    @Override
    public void genreHeavyMetal(String artisName) {
        System.out.println(artisName+"adalah genre Heavy Metal");
    }

    @Override
    public void genrePunk(String artisName) {
        System.out.println(artisName+"adalah genre Punk");
    }

    public void genreGrunge(String artisName){
        System.out.println(artisName+"adalah genre Grunge");
    }
}
