package com.putrinursofiyanti1605910.upcoming;

import android.content.Context;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class CardViewFilmsAdapter extends RecyclerView.Adapter<CardViewFilmsAdapter.CardViewViewHolder>{
    private ArrayList<Films> listFilms;
    private Context context;
    CardViewFilmsAdapter(Context context) {
        this.context = context;
    }
    private ArrayList<Films> getListFilms() {
        return listFilms;
    }
    void setListFilms(ArrayList<Films> listFilms) {
        this.listFilms = listFilms;
    }
    @Override
    public CardViewViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cardview_films, parent, false);
        return new CardViewViewHolder(view);
    }
    @Override
    public void onBindViewHolder(CardViewViewHolder holder, int position) {
        Films p = getListFilms().get(position);
        Glide.with(context).load(p.getPhoto()).override(350, 550).into(holder.imgPhoto);
        holder.tvName.setText(p.getName());
        holder.tvRemarks.setText(p.getDesc());
        holder.btnFavorite.setOnClickListener(new CustomOnItemClickListener(position, new CustomOnItemClickListener.OnItemClickCallback() {
            @Override
            public void onItemClicked(View view, int position) {
                Toast.makeText(context, "Detail "+getListFilms().get(position).getName(), Toast.LENGTH_SHORT).show();

            }
        }));

    }
    @Override
    public int getItemCount() {
        return getListFilms().size();
    }
    class CardViewViewHolder extends RecyclerView.ViewHolder{
        ImageView imgPhoto;
        TextView tvName, tvRemarks;
        Button btnFavorite;
        CardViewViewHolder(View itemView) {
            super(itemView);
            imgPhoto = (ImageView)itemView.findViewById(R.id.img_item_photo);
            tvName = (TextView)itemView.findViewById(R.id.tv_item_name);
            tvRemarks = (TextView)itemView.findViewById(R.id.tv_item_remarks);
            btnFavorite = (Button)itemView.findViewById(R.id.btn_set_favorite);

        }
    }
}
