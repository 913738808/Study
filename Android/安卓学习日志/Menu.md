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


## Popup Menu 弹出式菜单