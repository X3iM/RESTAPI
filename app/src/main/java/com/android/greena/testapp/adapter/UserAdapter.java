package com.android.greena.testapp.adapter;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.android.greena.testapp.R;
import com.android.greena.testapp.model.User;
import com.bumptech.glide.Glide;

import java.util.List;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserViewHolder> {

    private List<User> users;
    private OnUserClickListener listener;

    public UserAdapter(List<User> users) {
        this.users = users;
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_item, parent, false);
        return new UserViewHolder(view , listener);
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        User currentUser = users.get(0);

        System.out.println(currentUser.getPicture());

        Glide.with(holder.avatarImageView.getContext())
                .load(currentUser.getPicture().getMedium())
                .into(holder.avatarImageView);
        holder.userNameTextView.setText(currentUser.getName().getFirst().concat(" " + currentUser.getName().getLast()));
    }

    @Override
    public int getItemCount() {
        return users.size();
    }

    public void setOnUserClickListener(OnUserClickListener onUserClickListener) {
        this.listener = onUserClickListener;
    }

    public interface OnUserClickListener{
        void onUserClickListener(int pos);
    }

    public static class UserViewHolder extends RecyclerView.ViewHolder {

        public ImageView avatarImageView;
        public TextView  userNameTextView;

        public UserViewHolder(@NonNull View itemView, final OnUserClickListener listener) {
            super(itemView);

            avatarImageView = itemView.findViewById(R.id.image);
            userNameTextView = itemView.findViewById(R.id.name);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (v != null) {
                        int position = getAdapterPosition();
                        if (position != RecyclerView.NO_POSITION) {
                            listener.onUserClickListener(position);
                        }
                    }
                }
            });
        }
    }
}