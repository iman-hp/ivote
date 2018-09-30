package test.application.ivote.Recycler_fims_main;

import android.graphics.drawable.Drawable;

/**
 * Created by Iman on 9/24/2018.
 */

public class Film_pojo {
    String name;
    String cinema_names;
    Drawable film_image;
    String director;
    String film_time;

    public Film_pojo(String name, String cinema_names, Drawable film_image, String director, String film_time) {
        this.name = name;
        this.cinema_names = cinema_names;
        this.film_image = film_image;
        this.director = director;
        this.film_time = film_time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCinema_names() {
        return cinema_names;
    }

    public void setCinema_names(String cinema_names) {
        this.cinema_names = cinema_names;
    }

    public Drawable getFilm_image() {
        return film_image;
    }

    public void setFilm_image(Drawable film_image) {
        this.film_image = film_image;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getFilm_time() {
        return film_time;
    }

    public void setFilm_time(String film_time) {
        this.film_time = film_time;
    }


}
