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

    private String size;
    public String getSize(){
        return size;
    }

    private String description;
    public String getDescription(){
        return description;
    }

    private int image_id;
    public int getImageId(){
        return image_id;
    }

    private int textview_id;
    public int getTextViewId(){
        return textview_id;
    }

    private int imageview_id;
    public int getImageViewId(){
        return imageview_id;
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
    public Fish(String name, String family, String size, String description, int image_id, int textview_id, int imageview_id){
        this.name = name;
        this.family = family;
        this.size = size;
        this.description = description;
        this.image_id = image_id;
        this.textview_id = textview_id;
        this.imageview_id = imageview_id;

        captured = false;
    }

}
