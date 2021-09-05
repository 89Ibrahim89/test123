package com.company;

public class Hero {
    private String Hero;
    private String Health;
    private String Damage;
    private String SuperPower;

    private Hero(String Health, String Damage, String SuperPower){
        this.Health = Health;
        this.Damage = Damage;
        this.SuperPower = SuperPower;
    }
    private Hero(String Health, String Damage){
        this.Health = Health;
        this.Damage = Damage;
    }

    public String getHero() {
        return Hero;
    }

    public String getHealth() {
        return Health;
    }

    public String getDamage() {
        return Damage;
    }

    public String getSuperPower() {
        return SuperPower;
    }
}
