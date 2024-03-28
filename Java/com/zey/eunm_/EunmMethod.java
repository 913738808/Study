package com.zey.eunm_;

/**
 * eunm 的常用方法
 */
public class EunmMethod {

    public static void main(String[] args) {

        Season2 autumn = Season2.AUTUMN;
        System.out.println(autumn.name());
        System.out.println(autumn.ordinal());

        Season2[] seasonArray = autumn.values();
        for (Season2 s : autumn.values()) {
            s.toString();
        }

        System.out.println("====所有星期如下====");
        for (Week day : Week.values()) {
            System.out.println(day.getName());
        }
    }

}

enum Season2 {

    SPRING("春天", "温暖"),
    SUMMER("夏天", "炎热"),
    WINTER("冬天", "寒冷"),
    AUTUMN("秋天", "凉爽");

    // 名称
    private String name;
    // 描述
    private String desc;

    private Season2(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

    @Deprecated
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        String s = "Season { name = " + getName() + " }, { desc = " + getDesc() + " }";
        System.out.println(s);
        return s;
    }
}

enum Week {

    MONDAY("星期一"),
    TUSEDAY("星期二"),
    WEDNESDAY("星期三"),
    THURSDAY("星期四"),
    FRIDAY("星期五"),
    STAURDAY("星期六"),
    SUNDAY("星期天");

    private String name;

    private Week(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}