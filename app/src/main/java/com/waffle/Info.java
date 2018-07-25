package com.waffle;

/**
 * Created by Carlos Kowalevicz on 7/16/2018.
 */
public class Info {
    int image;
    String title;
    String desc;


    public int getImage()
    {
        return image;
    }

    public void setImage(int image) {

        this.image = image;
    }

    public String getTitle() {

        return title;
    }

    public void setTitle(String title) {

        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {

        this.desc = desc;
    }

    public Info( int image,String title,String desc){
        this.image = image;
        this.title = title;
        this.desc = desc;
    }


}

