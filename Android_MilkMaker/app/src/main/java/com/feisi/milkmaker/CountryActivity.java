package com.feisi.milkmaker;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

import com.feisi.milkmaker.adapter.CountryAdapter;
import com.feisi.milkmaker.bean.CountryBean;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class CountryActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<CountryBean> countryData;
    CountryAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country);


        Window window = getWindow();
        window.setStatusBarColor(getColor(R.color.colorPrimaryDark));

        View decor = window.getDecorView();
        decor.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE |
                View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION);


        this.initView();

        this.initData();

        this.initEvent();
    }

    private void initEvent() {
        adapter = new CountryAdapter(this,countryData);
        recyclerView.setAdapter(adapter);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);
    }

    private void initData() {
        // 读取json文件
        String json = getJsonData(this, "area.json");
        // 讲json字符串转化为java对象
        countryData = new Gson().fromJson(json, new TypeToken<List<CountryBean>>(){}.getType());

    }

    private void initView() {
        recyclerView = findViewById(R.id.rec);
    }

    public static String getJsonData(Context context, String fileName) {
        StringBuilder stringBuilder = new StringBuilder();
        try {
            BufferedReader bf = new BufferedReader(new InputStreamReader(
                    context.getResources().getAssets().open(fileName)));
            String line;
            while ((line = bf.readLine()) != null) {
                stringBuilder.append(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringBuilder.toString();
    }
}