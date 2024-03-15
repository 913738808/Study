package com.zey.androidstudy;

import android.os.Bundle;
import android.util.Log;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ConetxtMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_conetxt_menu);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        this.actionBarSetting();

        Button button = findViewById(R.id.btn_context_menu);

        registerForContextMenu(button);

        ListView myListview = findViewById(R.id.lv);
        String[] data = {
                "1", "2", "3", "4", "5"
        };
        myListview.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, data));
        registerForContextMenu(myListview);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        Log.d("上下文菜单", "绑定上下文菜单");
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_options, menu);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        AdapterView.AdapterContextMenuInfo menuInfo = (AdapterView.AdapterContextMenuInfo) item.getMenuInfo();
//        Log.d("ContextMenu", "点击了:" + item.getTitle() + ";位于" + menuInfo.id + "," + menuInfo.position);
        Log.d("ContextMenu", "点击了:" + item.getTitle());
        return super.onContextItemSelected(item);
    }

    private void actionBarSetting() {
        // 设置显示返回按钮
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        // 在action bar 中显示一个logo
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setLogo(R.drawable.baseline_home_24);
        actionBar.setDisplayUseLogoEnabled(true);
    }
}