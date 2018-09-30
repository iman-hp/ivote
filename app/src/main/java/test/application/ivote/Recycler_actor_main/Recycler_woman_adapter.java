package test.application.ivote.Recycler_actor_main;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;
import test.application.ivote.R;

/**
 * Created by Iman on 9/25/2018.
 */

public class Recycler_woman_adapter extends RecyclerView.Adapter<Recycler_woman_adapter.Holder>{
    Context mContext;
    List<ActorPojoWoman> actorPojoWomen;

    public Recycler_woman_adapter(Context mContext, List<ActorPojoWoman> actorPojoWomen) {
        this.mContext = mContext;
        this.actorPojoWomen = actorPojoWomen;
    }

    @Override
    public Recycler_woman_adapter.Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(mContext).inflate(R.layout.recycler_woman_item, parent, false);
       Holder holder=new Holder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(Recycler_woman_adapter.Holder holder, int position) {
        holder.txt_name_woman.setText(actorPojoWomen.get(position).getName());
        holder.txt_name_film_woman.setText(actorPojoWomen.get(position).getFilm());
        Glide.with(mContext).load(actorPojoWomen.get(position).getActorimg()).into(holder.profile_image_woman);
    }

    @Override
    public int getItemCount() {
        return actorPojoWomen.size();
    }

    public class Holder extends RecyclerView.ViewHolder{
        TextView txt_name_woman;
        TextView txt_name_film_woman;
        CircleImageView profile_image_woman;
        public Holder(View itemView) {
            super(itemView);
            txt_name_woman=itemView.findViewById(R.id.txt_actorname_woman);
            txt_name_film_woman=itemView.findViewById(R.id.txt_film_name_woman);
            profile_image_woman=itemView.findViewById(R.id.profile_image_woman);
        }
    }
}
