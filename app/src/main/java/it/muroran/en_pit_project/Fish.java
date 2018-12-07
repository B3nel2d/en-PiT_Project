package it.muroran.en_pit_project;

public class Fish{

    private String name;
    public String getName(){
        return name;
    }

    private String family;
    public String getFamily(){
        return family;
    }

    private int size;
    public  int getSize(){
        return size;
    }

    private String description;
    public String getDescription(){
        return description;
    }

    private boolean captured;
    public void setCaptured(boolean value){
        captured = value;
    }
    public boolean isCaptured(){
        return captured;
    }

    /**************************************************/

    public Fish(){
        captured = false;
    }
    public Fish(String name, String family, int size, String description){
        this.name = name;
        this.family = family;
        this.size = size;
        this.description = description;

        captured = false;
    }

}
