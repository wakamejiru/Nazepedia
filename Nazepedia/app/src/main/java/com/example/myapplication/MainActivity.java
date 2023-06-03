package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.view.Menu;

import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.navigation.NavigationView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {


    private AppBarConfiguration mAppBarConfiguration;

    private ActivityMainBinding binding; // バインディング　レイアウトの変数をレイアウト内のビューに関連付ける

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // インスタンスを受け取る
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        // bindingのRootの画面を表示する
        setContentView(binding.getRoot());
        // nimdingのappbarMainのtoolbarをアクションバーとしてSetする
        //setSupportActionBar(binding.appBarMain.toolbar);

        // appbarMinaのfabボタンのOnClickListenerを登録する
        /*
        binding.appBarMain.fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
*/
        // スライドメニューの大本のレイアウトを定義する
        DrawerLayout drawer = binding.drawerLayout;
        // 実際に表示されるコンテンツを定義する
        NavigationView navigationView = binding.navView;
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        //　ナビゲーションバーによって変更された時に、対応したフラグメントで表示が変更される。
        // Homeのとき  nav_home
        // スライドメニュー項目1選択時  nav_gallery
        // スライドメニュー項目2選択時  nav_slideshow
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home, R.id.nav_gallery, R.id.nav_slideshow)
                .setOpenableLayout(drawer)
                .build();
        // サイドメニューのコントローラを指定する
        // 使用するnavigationを指定したレイアウトを指定し、MainのActivityと関連付ける
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);

        // サイドメニューの指定したコントローラと使用するアクティビティとnavigationのフラグメントの設定を指定する
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);

        // setupWithNavControllerを宣言することで、サイドメニューがクリックされた時の画面遷移が自動的に行われえる
         NavigationUI.setupWithNavController(navigationView, navController);

         // どのアイテムが押されたか判断する
        navController.addOnDestinationChangedListener(new NavController.OnDestinationChangedListener() {
            @Override
            public void onDestinationChanged(@NonNull NavController navController, @NonNull NavDestination navDestination, @Nullable Bundle bundle) {
                if(navDestination.getId() == R.id.nav_gallery){

                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        // OnCreateの最後に呼ばれる
        //　アクションバーの追加を行う'(画面右上にある点点をおしたら出てくる項目のこと)
        getMenuInflater().inflate(R.menu.main, menu);   // MainのActivityにMenuを追加する
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(Menu menu){

    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }
}