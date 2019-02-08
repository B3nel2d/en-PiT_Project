package it.muroran.en_pit_project;

import java.util.ArrayList;
import java.util.List;

public class AppManager{

    private static AppManager singleton;

    public List<Fish> fishes = new ArrayList<Fish>();

    /**************************************************/

    public AppManager(){
        fishes.add(new Fish(
                "イシガレイ",
                "しゅるい：カレイか",
                "おおきさ：30～40cm",
                "せつめい：からだのいちぶにいしのようなほねがある",
                R.drawable.stoneflounder,
                R.id.textView1,
                R.id.imageView1
        ));
        fishes.add(new Fish(
                "ケムシカジカ",
                "しゅるい：ケムシカジカか",
                "おおきさ：40cm",
                "せつめい：せなかにほそいトゲがたくさんある",
                R.drawable.searaven,
                R.id.textView2,
                R.id.imageView2
        ));
        fishes.add(new Fish(
                "スケトウダラ",
                "しゅるい：タラか",
                "おおきさ：60cm",
                "せつめい：タラコ や めんたいこ のおかあさん",
                R.drawable.alaskapollock,
                R.id.textView3,
                R.id.imageView3
        ));
        fishes.add(new Fish(
                "タラバガニ",
                "しゅるい：タラバガニか",
                "おおきさ：10cm",
                "せつめい：カニだけどヤドカリのなかまでもある",
                R.drawable.redkingcrab,
                R.id.textView4,
                R.id.imageView4
        ));
        /*
        fishes.add(new Fish(
                "",
                "しゅるい:",
                "おおきさ:",
                "せつめい:",
                0,
                0,
                0
        ));
        */
    }

    /**************************************************/

    public static AppManager getInstance(){
        if(singleton == null){
            singleton = new AppManager();
        }

        return singleton;
    }

}
