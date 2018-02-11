package com.songmenglong.myapplication;

import android.app.LocalActivityManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TabHost;
import android.widget.TabWidget;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    //用于添加每一个选项卡的id
    private String[] tags = {"A_tag", "B_tag", "C_tag", "D_tag"};
    //所添加选项卡的文本信息
    private String[] titles = {"新闻", "图片", "视频", "收藏"};
    //所添加选项卡的图片信息
    private int[] images = {R.drawable.tihu, R.drawable.tihu, R.drawable.tihu, R.drawable.tihu};
    //用于跳转至不同的Activity
    private Intent[] intents = new Intent[4];



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);






        TabHost tabHost = (TabHost) findViewById(R.id.tabhost);
        TabWidget tabWidget = (TabWidget) findViewById(android.R.id.tabs);

        //tabWidget.setDividerDrawable(null); //设置tabWeight没有竖线分割
        tabWidget.setBackgroundColor(Color.WHITE);
        //初始化activity管理者
        LocalActivityManager manager = new LocalActivityManager(MainActivity.this, false);
        //通过管理者保存当前页面状态
        manager.dispatchCreate(savedInstanceState);
        //将管理者类对象添加至TabHost
        tabHost.setup(manager);

        init_intent();

        for (int i = 0; i < intents.length; i++) {
            //加载底部导航栏布局
            LayoutInflater inflater = this.getLayoutInflater();
            View view = inflater.inflate(R.layout.tab, null);
            TextView textView = (TextView) view.findViewById(R.id.tv_item);
            ImageView imageView = (ImageView) view.findViewById(R.id.image);
            textView.setText(titles[i]);
            imageView.setImageResource(images[i]);
            //创建选项卡
            TabHost.TabSpec spec = tabHost.newTabSpec(tags[i]);
            spec.setIndicator(view);
            //设置每个页面的内容
            spec.setContent(intents[i]);
            //将创建的选项卡添加至tabHost上
            tabHost.addTab(spec);
        }

    }


    //每个页面放置的Activity
    public void init_intent() {
        intents[0] = new Intent(this, NewsActivity.class);
        intents[1] = new Intent(this, PhotoActivity.class);
        intents[2] = new Intent(this, VideoActivity.class);
        intents[3] = new Intent(this, CollectionActivity.class);
    }
}


/*
* Android的demo
*
* 百度地图
*
* 谷歌地图
*
* OpenCV：人脸识别等
*
* FFmpeg: 视频播放
*
*
* */

