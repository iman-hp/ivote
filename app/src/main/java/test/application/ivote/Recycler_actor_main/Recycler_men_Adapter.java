package test.application.ivote.Recycler_actor_main;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;
import test.application.ivote.R;
import test.application.ivote.Recycler_fims_main.Film_pojo;
import test.application.ivote.Recycler_fims_main.RecyclerFilmsAdapter;

/**
 * Created by Iman on 9/25/2018.
 */

public class Recycler_men_Adapter extends RecyclerView.Adapter<Recycler_men_Adapter.Holder> {
    Context mContext;
    List<ActorPojoMen> actor_pojo_men;

    public Recycler_men_Adapter(Context mContext, List<ActorPojoMen> actor_pojo_men) {
        this.mContext = mContext;
        this.actor_pojo_men = actor_pojo_men;
    }

    @Override
    public Recycler_men_Adapter.Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(mContext).inflate(R.layout.recycler_men_item, parent, false);
       Holder holder=new Holder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(Recycler_men_Adapter.Holder holder, int position) {
        holder.txt_actor_name.setText(actor_pojo_men.get(position).getName());
        holder.txt_film_name.setText(actor_pojo_men.get(position).getFilm());
        Glide.with(mContext).load(actor_pojo_men.get(position).getActorimg()).into(holder.profile_image);
    }

    @Override
    public int getItemCount() {
        return actor_pojo_men.size();
    }

    public class Holder extends RecyclerView.ViewHolder {
        TextView txt_actor_name;
        TextView txt_film_name;
        CircleImageView profile_image;

        {
        }

        public Holder(View itemView) {
            super(itemView);
            txt_actor_name = itemView.findViewById(R.id.txt_actorname);
            txt_film_name = itemView.findViewById(R.id.txt_film_name);
            profile_image=itemView.findViewById(R.id.profile_image);
        }
    }
}