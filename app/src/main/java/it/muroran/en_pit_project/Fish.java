package it.muroran.en_pit_project;

public class Fish{

    private String id;
    public String getId(){
        return id;
    }

    private String name;
    public String getName(){
        return name;
    }

    private String family;
    public String getFamily(){
        return family;
    }

    private String size;
    public String getSize(){
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
    public Fish(String id, String name, String family, String size, String description){
        this.id = id;
        this.name = name;
        this.family = family;
        this.size = size;
        this.description = description;

        captured = false;
    }

}
