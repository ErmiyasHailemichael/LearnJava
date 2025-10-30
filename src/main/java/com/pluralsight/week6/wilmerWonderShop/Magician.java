package com.pluralsight.week6.wilmerWonderShop;

import java.util.ArrayList;
import java.util.List;

public class Magician {
    List<MagicItem> magicItemList = new ArrayList<>();

    public String performanceShow() {
        String result = "";
        for (MagicItem magic : magicItemList) {
            result +=magic.use() + "\n";
        }
        return result;
    }
}
