package com.menglong.myinsight;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;


/*
*
* 准备写一个demo 仿照iOS demo的样子
*
* */

public class MainActivity extends AppCompatActivity {

    private MyTabBar myTabBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //
        setContentView(R.layout.activity_main);

        //myTabBar = (MyTabBar) findViewById(R.id.tabBar);


        // 点击事件
//        myTabBar.setOnItemMenuClick(new MyTabBar.OnItemMenuClickListener() {
//            @Override
//            public void onThisClick(int eachItem) {
//                Toast.makeText(getApplicationContext(),"点击："+eachItem,Toast.LENGTH_SHORT).show();
//            }
//        });
    }


}
