package it.muroran.en_pit_project;

import java.util.ArrayList;
import java.util.List;

public class AppManager{

    private static AppManager singleton;

    public List<Fish> fishes = new ArrayList<Fish>();

    /**************************************************/

    public AppManager(){
        fishes.add(new Fish("StoneFlounder", "イシガレイ", "しゅるい：カレイか", "おおきさ：30～40cm", "せつめい：からだのいちぶにいしのようなほねがある"));
        fishes.add(new Fish("SeaRaven", "ケムシカジカ", "しゅるい：ケムシカジカか", "おおきさ：40cm", "せつめい：せなかにほそいトゲがたくさんある"));
        fishes.add(new Fish("AlaskaPollock", "スケトウダラ", "しゅるい：タラか", "おおきさ：60cm", "せつめい：タラコ や めんたいこ のおかあさん"));
        fishes.add(new Fish("RedKingCrab", "タラバガニ", "しゅるい：タラバガニか", "おおきさ：10cm", "せつめい：カニだけどヤドカリのなかまでもある"));
        //fishes.add(new Fish("", "", "しゅるい：", "おおきさ：", "せつめい："));
    }

    /**************************************************/

    public static AppManager getInstance(){
        if(singleton == null){
            singleton = new AppManager();
        }

        return singleton;
    }

}
