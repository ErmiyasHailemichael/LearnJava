package com.pluralsight.week6.wilmerWonderShop;

public class MainApps {
    public static void main(String[] args) {
        Item itemOne = new Item("Keyboard",89.00);
        Item itemTwo = new Item("Drum", 120);

        Wand myWand = new Wand("Elder Wand",500);
        Potion myPotion = new Potion("Invisibility Potion",75);
        Guitar myGuitar = new Guitar("Fender Stratocaster", 1200);
        DrumKit myDrums = new DrumKit("Roland V-Drums", 3000);
        Magician m = new Magician();
        m.magicItemList.add(myWand);

        Musician music = new Musician();
        music.musicItemList.add(myGuitar);
        MusicItem myMusicItems = new MusicItem("Drums",340);
        MagicItem myMagicItem = new MagicItem("Magic 8 ball",20);

        System.out.println(myMagicItem.use());
        System.out.println(myMusicItems.use());
        System.out.println(myPotion.use());
        System.out.println(myWand.use());

        System.out.println("🎩 MAGIC SHOW:");
        System.out.println(m.performanceShow());

        System.out.println("🎵 CONCERT:");
        System.out.println(music.playConcert());

    }
}
