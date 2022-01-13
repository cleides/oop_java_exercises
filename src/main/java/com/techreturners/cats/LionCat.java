package com.techreturners.cats;

public class LionCat extends AbstractCat {
    public LionCat() {
        this.averageHeight = 110;
        this.isAsleep = false;
        this.setting = Setting.WILD;
    }
    public String eat() {
        return "Roar!!!!";
    }
}
