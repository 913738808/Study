# Action Bar

## 获取Action Bar
```java
    ActionBar actionBar = getSupportActionBar();
```

## 设置title
```java
    actionBar.setTitle("选项菜单");
```
或者在AndroidManifest.xml中设置label
```xml
    <activity
        android:label="选项菜单"
        android:name=".OptionMenuActivity"
        android:exported="false" />
```

## 显示ActionBar中的返回按钮

```java
    actionBar.setDisplayHomeAsUpEnabled(true);
```

- 实现点击返回上一页
    - (方法1)监听返回按钮的点击事件
        ```java
            @Override
            public boolean onOptionsItemSelected(@NonNull MenuItem item) {
                Toast.makeText(this, "点击了" + item.getTitle(), Toast.LENGTH_SHORT).show();

                switch (item.getItemId()) {
                    // 点击返回按钮
                    case android.R.id.home:
                        // 结束当前Activity
                        this.finish();
                        break;
                }

                return super.onOptionsItemSelected(item);
            }
        ```

    - (方法2)在Manifest.xml中设置上一级
        ```xml
            <activity
                android:label="选项菜单"
                android:parentActivityName=".MainActivity"
                android:name=".OptionMenuActivity"
                android:exported="false" />

            <!-- 兼容低版本android -->
            <activity
                android:label="选项菜单"
                android:parentActivityName=".MainActivity"
                android:name=".OptionMenuActivity"
                android:exported="false" />
                <meta-data 
                    android:name="android.support.PARENT_ACTIVITY" 
                    android:value=".MainActivity"></meta-data>
            <activity
        ```

## 在Action Bar 中显示Logo
```java
    actionBar.setDisplayShowHomeEnabled(true);
    actionBar.setLogo(R.drawable.baseline_home_24);
    actionBar.setDisplayUseLogoEnabled(true);
```