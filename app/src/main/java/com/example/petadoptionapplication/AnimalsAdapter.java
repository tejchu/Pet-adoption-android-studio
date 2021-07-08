package com.example.petadoptionapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.MenuView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import static com.example.petadoptionapplication.MockCredentials.animals;

public class AnimalsAdapter extends RecyclerView.Adapter<AnimalsAdapter.ViewHolder> {

    private final List<String> animals;

    AnimalsAdapter(List<String> animals){
        this.animals = animals;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.animal_item_view, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        String animal = animals.get(position);
        holder.tvName.setText(animal);
    }

    @Override
    public int getItemCount() {
        return animals.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        final TextView tvName;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.name);
        }

    }


}
