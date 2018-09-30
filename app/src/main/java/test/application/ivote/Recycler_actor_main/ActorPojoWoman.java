package test.application.ivote.Recycler_actor_main;

import android.graphics.drawable.Drawable;

/**
 * Created by Iman on 9/25/2018.
 */

public class ActorPojoWoman {
    Drawable actorimg;
    String name;
    String film;

    public ActorPojoWoman(Drawable actorimg, String name, String film) {
        this.actorimg = actorimg;
        this.name = name;
        this.film = film;
    }

    public Drawable getActorimg() {
        return actorimg;
    }

    public void setActorimg(Drawable actorimg) {
        this.actorimg = actorimg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFilm() {
        return film;
    }

    public void setFilm(String film) {
        this.film = film;
    }
}
