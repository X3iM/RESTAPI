package com.android.greena.testapp.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.android.greena.testapp.utils.InternetConnection;
import com.android.greena.testapp.R;
import com.android.greena.testapp.model.User;
import com.android.greena.testapp.adapter.UserAdapter;
import com.android.greena.testapp.model.UserList;
import com.android.greena.testapp.api.ApiService;
import com.android.greena.testapp.api.RetroClient;
import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class HomeActivity extends AppCompatActivity {

    private View                        parentView;

    private List<User>                  users;
    private RecyclerView                userRecyclerView;
    private UserAdapter                 userAdapter;
    private RecyclerView.LayoutManager  layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        parentView = findViewById(R.id.parentLayout);

        users = new ArrayList<>();
        //buildRecyclerView();

        if (InternetConnection.checkConnection(getApplicationContext())) {
            final ProgressDialog dialog;
            dialog = new ProgressDialog(HomeActivity.this);
            dialog.setMessage(getString(R.string.string_getting_json_message));
            dialog.show();

            ApiService api = RetroClient.getApiService();

            Call<UserList> call = api.getJSON();
            call.enqueue(new Callback<UserList>() {
                @Override
                public void onResponse(Call<UserList> call, Response<UserList> response) {
                    dialog.dismiss();

                    if (response.isSuccessful()) {
                        users = response.body().getUsers();

                        userRecyclerView = findViewById(R.id.userListRecyclerView);
                        userRecyclerView.setHasFixedSize(true);
                        userRecyclerView.addItemDecoration(new DividerItemDecoration(userRecyclerView.getContext(), DividerItemDecoration.VERTICAL));
                        layoutManager = new LinearLayoutManager(HomeActivity.this);
                        userAdapter = new UserAdapter(users);

                        userRecyclerView.setLayoutManager(layoutManager);
                        userRecyclerView.setAdapter(userAdapter);

                        userAdapter.setOnUserClickListener(new UserAdapter.OnUserClickListener() {
                            @Override
                            public void onUserClickListener(int pos) {
                                goToProfile(pos);
                            }
                        });

//                                adapter = new ContactAdapter(MainActivity.this, userList);
//                                listView.setAdapter(adapter);

                    } else {
                        Snackbar.make(parentView, R.string.string_some_thing_wrong, Snackbar.LENGTH_LONG).show();
                    }
                }

                @Override
                public void onFailure(Call<UserList> call, Throwable t) {
                    dialog.dismiss();
                }
            });

        } else {
            Snackbar.make(parentView, R.string.string_internet_connection_not_available, Snackbar.LENGTH_LONG).show();
        }
    }

    private void buildRecyclerView() {
        userRecyclerView = findViewById(R.id.userListRecyclerView);
        userRecyclerView.setHasFixedSize(true);
        userRecyclerView.addItemDecoration(new DividerItemDecoration(userRecyclerView.getContext(), DividerItemDecoration.VERTICAL));
        layoutManager = new LinearLayoutManager(this);
        userAdapter = new UserAdapter(users);

        userRecyclerView.setLayoutManager(layoutManager);
        userRecyclerView.setAdapter(userAdapter);

        userAdapter.setOnUserClickListener(new UserAdapter.OnUserClickListener() {
            @Override
            public void onUserClickListener(int pos) {
                goToProfile(pos);
            }
        });
    }

    private void goToProfile(int position) {
        Intent intent = new Intent(HomeActivity.this, ProfileActivity.class);
        intent.putExtra("name", users.get(position).getName().getFirst() + users.get(position).getName().getLast());
        intent.putExtra("picture", users.get(position).getPicture().getMedium());
        intent.putExtra("age", users.get(position).getDob().getAge());
        intent.putExtra("phone", users.get(position).getPhone());
        intent.putExtra("email", users.get(position).getEmail());

        startActivity(intent);
    }
}