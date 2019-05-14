package com.example.androidweibopage;
/*
 * 参照ContectWay进行与服务器端交互操作
<<<<<<< HEAD
=======
 * 请注意，请在下载的第一时间重命名它，名称为功能_姓名
>>>>>>> Initial commit
 * author:yzw
 * time:2019/5/12
 */
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements ContectWay{

    public static void getData(){}
    public static void setData(){}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
