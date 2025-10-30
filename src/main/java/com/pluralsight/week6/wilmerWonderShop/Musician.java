package com.pluralsight.week6.wilmerWonderShop;

import java.util.ArrayList;
import java.util.List;

public class Musician {
    List<MusicItem> musicItemList = new ArrayList<>();

    public String playConcert(){
        String result2 = "";
        for(MusicItem music : musicItemList){
            result2 += music.use() + "\n";
        }
        return result2;
    }
}
