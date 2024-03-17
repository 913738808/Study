package com.feisi.milkmaker.bean;

import java.io.Serializable;

public class CountryBean implements Serializable {

    String shortName;
    String name;
    String en;
    String tel;
    String pinyin;

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEn() {
        return en;
    }

    public void setEn(String en) {
        this.en = en;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getPinyin() {
        return pinyin;
    }

    public void setPinyin(String pinyin) {
        this.pinyin = pinyin;
    }

    @Override
    public String toString() {
        return "CountryBean{" +
                "shortName='" + shortName + '\'' +
                ", name='" + name + '\'' +
                ", en='" + en + '\'' +
                ", tel='" + tel + '\'' +
                ", pinyin='" + pinyin + '\'' +
                '}';
    }
}
