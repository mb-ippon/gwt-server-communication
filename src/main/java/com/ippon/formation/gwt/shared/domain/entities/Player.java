package com.ippon.formation.gwt.shared.domain.entities;

import java.util.Date;

public class Player {

    public Player(String name, int height, Date birthDay /* , Plays playHand */) {
        this.name = name;
        this.height = height;
        // this.playHand = playHand;
    }

    // name of the player
    private String name;
    // date he begin on the pro circuit
    private Date birthDay;

    private int height;

    // the way which he plays
    // private Plays playHand;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setTurnedPro(Date birthDay) {
        this.birthDay = birthDay;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    // public Plays getPlayHand() {
    // return playHand;
    // }
    //
    // public void setPlayHand(Plays playHand) {
    // this.playHand = playHand;
    // }

}
