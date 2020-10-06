package com.example.instagrammemeshare;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    List<Model> list;
    Context context;

    public RecyclerAdapter(List<Model> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_view_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.profilePic.setImageResource(list.get(position).getImage());
        holder.name.setText(list.get(position).getName());
        holder.userName.setText(list.get(position).getUserName());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView profilePic;
        TextView userName, name;
        Button send;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            profilePic = itemView.findViewById(R.id.image);
            name = itemView.findViewById(R.id.name);
            userName = itemView.findViewById(R.id.username);
            send = itemView.findViewById(R.id.send_button);

            send.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(context, "Sended to " + userName.getText().toString(), Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
}
