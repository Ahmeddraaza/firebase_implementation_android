package com.example.firebase_implementation;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.ViewHolder> {

    private Context context;
    private ArrayList<User> userList;

    public UserAdapter(Context context, ArrayList<User> userList) {
        this.context = context;
        this.userList = userList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.user_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        User user = userList.get(position);
        holder.textViewName.setText(user.fullname);
        holder.textViewEmail.setText(user.email);
        holder.textViewCity.setText(user.City);
        holder.textViewCountry.setText(user.Country);
        holder.textViewMessage.setText(user.Message);
    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView textViewName, textViewEmail, textViewCity, textViewCountry, textViewMessage;

        public ViewHolder(View itemView) {
            super(itemView);
            textViewName = itemView.findViewById(R.id.textViewName);
            textViewEmail = itemView.findViewById(R.id.textViewEmail);
            textViewCity = itemView.findViewById(R.id.textViewCity);
            textViewCountry = itemView.findViewById(R.id.textViewCountry);
            textViewMessage = itemView.findViewById(R.id.textViewMessage);
        }
    }
}
