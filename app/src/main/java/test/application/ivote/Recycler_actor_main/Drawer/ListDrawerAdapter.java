package test.application.ivote.Recycler_actor_main.Drawer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

import test.application.ivote.R;

/**
 * Created by Iman on 9/27/2018.
 */

public class ListDrawerAdapter extends BaseAdapter {
    Context mContext;
    List<PojoListDrawer> pojolistdrawer;

    public ListDrawerAdapter(Context mContext, List<PojoListDrawer> pojolistdrawer) {
        this.mContext = mContext;
        this.pojolistdrawer = pojolistdrawer;
    }

    @Override
    public int getCount() {
        return pojolistdrawer.size();
    }

    @Override
    public Object getItem(int position) {
        return pojolistdrawer.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v= LayoutInflater.from(mContext).inflate(R.layout.list_drawer_item,parent,false);
        TextView txt_name_drawer=v.findViewById(R.id.txt_name_drawer);
        ImageView img=v.findViewById(R.id.txt_list_img);
        txt_name_drawer.setText(pojolistdrawer.get(position).getName());
        Glide.with(mContext).load(pojolistdrawer.get(position).getImg()).into(img);
        return v;
    }
}
