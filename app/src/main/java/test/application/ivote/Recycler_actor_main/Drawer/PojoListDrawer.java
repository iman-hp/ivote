package test.application.ivote.Recycler_actor_main.Drawer;

import android.graphics.drawable.Drawable;

/**
 * Created by Iman on 9/27/2018.
 */

public class PojoListDrawer {
    String name;
    Drawable img;

    public PojoListDrawer(String name, Drawable img) {
        this.name = name;
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Drawable getImg() {
        return img;
    }

    public void setImg(Drawable img) {
        this.img = img;
    }
}
