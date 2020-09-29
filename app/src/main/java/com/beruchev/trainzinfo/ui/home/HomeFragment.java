package com.beruchev.trainzinfo.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.RecyclerView;

import com.beruchev.trainzinfo.R;
import framework.Post;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    private RecyclerView newsList;
    private TextView textView;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);

        textView = root.findViewById(R.id.text_home);
        homeViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        newsList = root.findViewById(R.id.newsList);

        onLoadNews();
        return root;
    }

    private void onLoadNews() {
        Post.Send("NewsInfoes", "IndexAction", Post.nullData);
    }

    public void OnLoadRequest(String string){
        textView.setText(string);
    }
}