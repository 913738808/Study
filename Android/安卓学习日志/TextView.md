# TextView学习

## 设置颜色
```java
    TextView text_px = findViewById(R.id.text_px);
    // 兼容写法
    text_px.setTextColor(ContextCompat.getColor(this, R.color.teal_200));
```

## 设置容器大小

```java
    TextView text_size = findViewById(R.id.text_size);
    ViewGroup.LayoutParams params = text_size.getLayoutParams();
    params.height = util.dpToPx(this,100);
    params.width = util.dpToPx(this,100);
    text_size.setLayoutParams(params);
```

## 计算DP
```java
    public static int dpToPx(Context context, int size){
        float density = context.getResources().getDisplayMetrics().density;
        return (int)(density * size + 0.5f);
    }
```

## 占位符
- `&#32;` == 普通的英文半角空格
- `&#160;` == &nbsp; == &#xA0; == no-break space （普通的英文半角空格但不换行）
- `&#12288;` == 中文全角空格 （一个中文宽度） 已验证
- `&#8195;` == &emsp; == em空格 （一个中文宽度）
- `&#8194;` == &ensp; == en空格 （半个中文宽度）
- `&#8197;` == 四分之一em空格 （四分之一中文宽度）