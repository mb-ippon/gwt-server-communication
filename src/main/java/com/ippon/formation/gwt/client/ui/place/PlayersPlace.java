package com.ippon.formation.gwt.client.ui.place;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

public class PlayersPlace extends Place {

    private final String playersToken;

    public PlayersPlace(String playersToken) {
        this.playersToken = playersToken;
    }

    public String getPlayersToken() {
        return playersToken;
    }

    public static class Tokenizer implements PlaceTokenizer<PlayersPlace> {

        @Override
        public String getToken(PlayersPlace place) {
            return place.getPlayersToken();
        }

        @Override
        public PlayersPlace getPlace(String playersToken) {
            return new PlayersPlace(playersToken);
        }
    }
}
