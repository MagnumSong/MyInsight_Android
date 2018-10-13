package com.activitytest.songmenglong.activitytest;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // 加载活动布局
        setContentView(R.layout.first_layout);

        Button button1 = (Button)findViewById(R.id.button_1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 在活动中使用Toast
                Toast.makeText(FirstActivity.this, "你点击了Button1", Toast.LENGTH_SHORT).show();
            }
        });

        Button nextButton = findViewById(R.id.button_next);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 跳转到下一页面 显式Intent
                //Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
                //startActivity(intent);

                // 隐式Intent
                Intent intent = new Intent("com.activitytest.songmenglong.activitytest.ACTION_START");
                startActivity(intent);
            }
        });

        Button button2 = findViewById(R.id.button_delete);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 销毁一个活动
                /*
                 * 只要点击Back键就可以销毁当前的活动
                 *
                 * */

                // 代码销毁活动 退出APP
                finish();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.add_item:
                Toast.makeText(this, "你已经点击了添加", Toast.LENGTH_SHORT).show();
                break;
            case R.id.remove_item:
                Toast.makeText(this, "你已经点击了删除", Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
        return true;
    }


}
