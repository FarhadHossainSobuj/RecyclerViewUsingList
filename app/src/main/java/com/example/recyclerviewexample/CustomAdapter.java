package com.example.recyclerviewexample;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolders> {
    private List<String> listName;
    private List<String> listContact;
    private List<Integer> listImaage;
    private Context context;

    public CustomAdapter(List<String> listName, List<String> listContact, List<Integer> listImaage) {
        this.listName = listName;
        this.listContact = listContact;
        this.listImaage = listImaage;
    }

    @NonNull
    @Override
    public ViewHolders onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_view, parent, false);
        return new ViewHolders(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolders holder, int position) {
        holder.tvName.setText(listName.get(position));
        holder.tvNumber.setText(listContact.get(position));
        holder.img.setImageResource(listImaage.get(position));
        if (position % 2 == 0){
            holder.cl.setBackgroundColor(Color.parseColor("#292929"));
        }
    }

    @Override
    public int getItemCount() {
        return listName.size();
    }

    class ViewHolders extends RecyclerView.ViewHolder{
        private TextView tvName, tvNumber;
        private ImageView img;
        private ConstraintLayout cl;

        public ViewHolders(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.imageView);
            tvName = itemView.findViewById(R.id.tvName);
            tvNumber = itemView.findViewById(R.id.tvNumber);
            cl = itemView.findViewById(R.id.cl);
        }
    }

}
