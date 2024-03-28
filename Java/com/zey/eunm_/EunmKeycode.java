package com.zey.eunm_;

// 关键字创建枚举
public class EunmKeycode {
    public static void main(String[] args) {
        
    }
}

enum Season {

    SPRING("春天", "温暖"),
    SUMMER("夏天", "炎热"),
    WINTER("冬天", "寒冷"),
    AUTUMN("秋天", "凉爽");

    // 名称
    private String name;
    // 描述
    private String desc;

    // public static final Season SPRING = new Season("春天", "温暖");

    // public static final Season SUMMER = new Season("夏天", "炎热");

    // public static final Season WINTER = new Season("冬天", "寒冷");

    // public static final Season AUTUMN = new Season("秋天", "凉爽");



    // 1. 将构造器 私有化 防止被new
    // 2. 去除set方法 防止属性被修改
    // 3. 在Season内部直接创建固定的对象
    // 4. 加入final修饰 禁止修改
    private Season(String name,String desc){
        this.name = name;
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

    public String getName() {
        return name;
    }

    // 去除set方法
    // public void setName(String name) {
    //     this.name = name;
    // }

    // public void setDesc(String desc) {
    //     this.desc = desc;
    // }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        String s = "Season { name = " + getName() + " }, { desc = " + getDesc() + " }";
        System.out.println(s);
        return s;
    }
}
