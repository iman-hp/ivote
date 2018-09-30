package test.application.ivote.Recycler_fims_main;

import android.content.Context;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import com.bumptech.glide.Glide;
import com.ramotion.foldingcell.FoldingCell;

import java.util.List;

import test.application.ivote.R;

/**
 * Created by Iman on 9/24/2018.
 */

public class RecyclerFilmsAdapter extends RecyclerView.Adapter<RecyclerFilmsAdapter.Holder> {
    Context mContext;
    List<Film_pojo> film_pojo;

    public RecyclerFilmsAdapter(Context mContext, List<Film_pojo> film_pojo) {
        this.mContext = mContext;
        this.film_pojo = film_pojo;
    }

    @Override
    public RecyclerFilmsAdapter.Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(mContext).inflate(R.layout.recycler_films_item, parent, false);
        Holder holder = new Holder(v);

        return holder;
    }

    @Override
    public void onBindViewHolder(final RecyclerFilmsAdapter.Holder holder, int position) {
        holder.txt_name.setText(film_pojo.get(position).getName());
        holder.txt_director.setText(film_pojo.get(position).getDirector());
        holder.txt_cinema.setText(film_pojo.get(position).getCinema_names());
        holder.txt_time.setText(film_pojo.get(position).getFilm_time());
        Glide.with(mContext).load(film_pojo.get(position).getFilm_image()).into(holder.img);
        Glide.with(mContext).load(film_pojo.get(position).getFilm_image()).into(holder.imgtitlee);
       holder.fc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                holder.fc.toggle(false);
            }
        });
    }

    @Override
    public int getItemCount() {
        return film_pojo.size();
    }

    public class Holder extends RecyclerView.ViewHolder {
        TextView txt_name;
        TextView txt_director;
        TextView txt_cinema;
        ImageView img;
        ImageView imgtitlee;
        TextView txt_time;
        FoldingCell fc;

        public Holder(View itemView) {
            super(itemView);
            txt_name = itemView.findViewById(R.id.txt_name);
            txt_cinema = itemView.findViewById(R.id.txt_cinema);
            txt_director = itemView.findViewById(R.id.txt_director);
            img = itemView.findViewById(R.id.imagetitle);
            imgtitlee = itemView.findViewById(R.id.imagetitlee);
            txt_time = itemView.findViewById(R.id.txt_time);
             fc =itemView.findViewById(R.id.folding_cell);
        }
    }
}
