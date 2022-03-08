package com.example.myapplication.Main;

import androidx.appcompat.app.AppCompatActivity;

// 初期起動。
public class MainActivity extends AppCompatActivity {
    public static void main(String[] args) {
        // ApplicationのRUNを呼び出す。
        Application.Run();
    }
}

// コーディングルール
// 変数などはアッパーキャメル単語ごとに大文字に
// 変数等の前には文字をつける
// int->l
// float->f
// boolean->b
// String->s

// staticの変数には s_をつける
// 定数(final)はすべて大文字にする。
// インスタンスは全て小文字

// 関数で値をSet,Getを使うときは関数名の先頭をGetもしくはSetにする
// 関数名返り値がbooleanで成功失敗ではなく可否を示す場合には Is~,Can~,Has~の名前にする