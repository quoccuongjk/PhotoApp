package com.example.myapplication;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class FruitAdapter extends RecyclerView.Adapter<FruitAdapter.FruitHolder> {
    private Context context;
    private List<Fruit> array;
    public FruitAdapter(Context context, List<Fruit> array) {
        this.context = context;
        this.array = array;
        notifyDataSetChanged();
    }
    @NonNull
    @Override
    public FruitHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_fruit,parent,false);
        return new FruitHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FruitHolder holder, int position) {
        Fruit fruit = array.get(position);
        holder.textViewten.setText(fruit.getTen());
        Picasso.with(context).load(fruit.getLink()).into(holder.img);

        holder.linear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context,MainActivity2.class);
                intent.putExtra("fruit",fruit);
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return array.size();
    }

    public class FruitHolder extends RecyclerView.ViewHolder {
        private TextView textViewten;
        ImageView img;
        LinearLayout linear;
        public FruitHolder(@NonNull View itemView) {
            super(itemView);
            textViewten = itemView.findViewById(R.id.tv_name);
            img = itemView.findViewById(R.id.img);
            linear = itemView.findViewById(R.id.mylinear);
        }
    }
}

