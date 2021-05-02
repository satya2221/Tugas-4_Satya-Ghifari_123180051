package com.example.tugas_5;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class NFLAdapter extends RecyclerView.Adapter<NFLAdapter.ViewHolder> {
    private ArrayList<NFLStore> nFl;
    private Context context;

    public NFLAdapter(ArrayList<NFLStore> nFl, Context context) {
        this.nFl = nFl;
        this.context = context;
    }

    @NonNull
    @Override
    public NFLAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.taruh_team, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NFLAdapter.ViewHolder holder, int position) {
        final NFLStore nflStore = nFl.get(position);

        Glide.with(holder.itemView.getContext())
                .load(nflStore.getsPhoto())
                .apply(new RequestOptions().override(55,55))
                .into(holder.logo);
        holder.team_Name.setText(nflStore.getsName());
        holder.team_Detail.setText(nflStore.getsDetail());
        holder.tombol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, TeamDetail.class);
                intent.putExtra("name", nflStore.getsName());
                intent.putExtra("detail", nflStore.getsDetail());
                intent.putExtra("photo", nflStore.getsPhoto());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return nFl.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView team_Name, team_Detail;
        ImageView logo;
        CardView kartu;
        LinearLayout jeroan;
        Button tombol;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            team_Name = itemView.findViewById(R.id.team_name);
            team_Detail = itemView.findViewById(R.id.team_detail);
            logo = itemView.findViewById(R.id.logo);
            kartu = itemView.findViewById(R.id.bungkus);
            jeroan = itemView.findViewById(R.id.jeroan);
            tombol = itemView.findViewById(R.id.tombol);
        }
    }
}
