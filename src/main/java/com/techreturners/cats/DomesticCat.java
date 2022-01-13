package com.techreturners.cats;

public class DomesticCat extends AbstractCat {
    public DomesticCat() {
        this.averageHeight = 23;
        this.isAsleep = false;
        this.setting = Setting.DOMESTIC;
    }
    public String eat() {
        return "Purrrrrrr";
    }
}
