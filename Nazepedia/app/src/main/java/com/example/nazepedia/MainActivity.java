package com.example.nazepedia;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.nazepedia.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    // バインディング　レイアウトの変数をレイアウト内のビューに関連付ける
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // インスタンスを受け取る
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        // bindingのRootの画面を表示する
        setContentView(binding.getRoot());

        // ナビゲーションの下画面を登録
        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.

        //　ナビゲーションバーによって変更された時に、対応したフラグメントで表示が変更される。
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications)
                .build();

        // ナビゲーションバーの項目をコントローラーに紐づける
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_main);

        // アクションバーとしてナビゲーションのコントローラーと表示を紐づける
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(binding.navView, navController);
    }

}