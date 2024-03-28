package com.zey.designmodel;

public class SingelModel {
    public static void main(String[] args) {
        
    }
}

/**
 * 单例模式 饿汉式
 */
class HungerDesign {
    
    // 1. 构造器私有化
    private HungerDesign(){

    }

    // 2. 内部实例化
    private static HungerDesign hungerDesign = new HungerDesign();

    // 3. 向外暴露公共方法 获取实例

    public static HungerDesign getInstanse(){
        return hungerDesign;
    }

}

/**
 * 单例模式 懒汉式
 */

class LazyDesign {

    // 1. 构造器私有化
    private LazyDesign(){

    }

    // 2. 内部实例化
    private static LazyDesign lazyDesign;

    // 3. 向外暴露公共方法 获取实例

    public static LazyDesign getInstanse(){
        if (lazyDesign == null) {
            lazyDesign = new LazyDesign();
        }
        return lazyDesign;
    }
    
}