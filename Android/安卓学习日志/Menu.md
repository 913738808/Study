# Menu

## Options Menu 选项菜单

右键点击res > new Android Res File > Type选择Menu

### 属性
- item
    - id
    - title
    - icon
    - showAction    是否显示在action bar中
        - never     从不
        - awalys    总是显示
        - ifRoom    如果有空间的话显示

```xml
    <?xml version="1.0" encoding="utf-8"?>
    <menu xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:app="http://schemas.android.com/apk/res-auto">
        <item
            android:id="@+id/menu_setting"
            android:title="设置"
            android:icon="@drawable/baseline_settings_24"
            app:showAsAction="ifRoom"/>
        <item
            android:id="@+id/menu_home"
            android:title="主页"
            android:icon="@drawable/baseline_home_24"
            app:showAsAction="ifRoom"/>
        <item
            android:id="@+id/menu_share"
            android:title="分享"
            android:icon="@drawable/baseline_share_24"
            app:showAsAction="ifRoom"/>
        <item
            android:id="@+id/menu_help"
            android:title="帮助"
            android:icon="@drawable/baseline_help_outline_24"
            app:showAsAction="ifRoom"/>
    </menu>
```

### 方法

```java
    // 绑定options menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_options,menu);
        return super.onCreateOptionsMenu(menu);
    }
```

```java
    // 监听菜单点击事件
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        Toast.makeText(this,"点击了"+item.getTitle(),Toast.LENGTH_SHORT).show();
        return super.onOptionsItemSelected(item);
    }
```

## Context Menu 上下文菜单

为view 注册上下文菜单
```java
    Button button = findViewById(R.id.btn_context_menu);
    registerForContextMenu(button);
```

```java
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        Log.d("上下文菜单","绑定上下文菜单");

        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_options,menu);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        Toast.makeText(this, "点击了" + item.getTitle(), Toast.LENGTH_SHORT).show();
        return super.onContextItemSelected(item);
    }
```
在列表中使用ContextView

创建
```java
    ListView myListview = findViewById(R.id.lv);
    String[] data = {
            "1", "2", "3", "4", "5"
    };
    myListview.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, data));
    registerForContextMenu(myListview);
```
绑定
```java
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        Log.d("上下文菜单", "绑定上下文菜单");
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_options, menu);
    }
```
监听时获取点击的index
```java
    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        AdapterView.AdapterContextMenuInfo menuInfo = (AdapterView.AdapterContextMenuInfo) item.getMenuInfo();
        Log.d("ContextMenu", "点击了:" + item.getTitle() + ";位于" + menuInfo.id + "," + menuInfo.position);
        return super.onContextItemSelected(item);
    }
```

## Popup Menu 弹出式菜单