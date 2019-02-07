package it.muroran.en_pit_project;

import java.util.ArrayList;
import java.util.List;

public class AppManager{

    private static AppManager singleton;

    public List<Fish> fishes = new ArrayList<Fish>();

    /**************************************************/

    public AppManager(){
        fishes.add(new Fish("SALMON", "Salmon", "Salmonidae", 70, "So Tasty, Babe."));
    }

    /**************************************************/

    public static AppManager getInstance(){
        if(singleton == null){
            singleton = new AppManager();
        }

        return singleton;
    }

}
