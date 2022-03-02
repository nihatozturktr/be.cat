package com.intec;

public class TurkishVanCat extends Felis{
public String nickname;

    public TurkishVanCat(String name) {
        super(name);
        this.nickname = nickname;
    }

    public TurkishVanCat(String name, int age, int shelterNo, int badgeNo, String nickname) {
        super(name, age, shelterNo, badgeNo);

    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public void miauw() {
        super.miauw();
    }

    @Override
    public String toString() {
        return super.toString() + " Turskish cat";
    }
}
