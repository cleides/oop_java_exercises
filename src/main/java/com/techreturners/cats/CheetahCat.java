package com.techreturners.cats;

public class CheetahCat extends AbstractCat{
    public CheetahCat() {
        this.averageHeight = 70;
        this.isAsleep = false;
        this.setting = Setting.WILD;
    }
    public String eat() {
        return "Zzzzzzz";
    }
}
