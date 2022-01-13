package com.techreturners.cats;

public abstract class AbstractCat implements Cat {
    protected boolean isAsleep;
    protected int averageHeight;
    protected Setting setting;

    public String eat() {
        return "";
    }

    public void run() {
    }

    public void goToSleep() {
        this.isAsleep = true;
    }

    public void wakeUp() {
        this.isAsleep = false;
    }

    public boolean getIsAsleep() {
        return isAsleep;
    }

    public int getAverageHeight() {
        return averageHeight;
    }

    public Setting getSetting() {
        return setting;
    }
}

