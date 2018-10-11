package com.menglong.myinsight;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


/*
*
* 准备写一个demo 仿照iOS demo的样子
*
* */

public class MainActivity extends AppCompatActivity {

    //private MyTabBar myTabBar;

    private Button bleButton;

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

        // 点击连接蓝牙button
        bleButton = findViewById(R.id.blebutton);

        bleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // 点击进入下一页面
                Toast.makeText(MainActivity.this, "点击蓝牙按钮", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(MainActivity.this, BluetoothActivity.class);
                startActivity(intent);
            }
        });

    }


}
