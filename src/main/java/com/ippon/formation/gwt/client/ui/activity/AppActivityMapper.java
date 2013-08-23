package com.ippon.formation.gwt.client.ui.activity;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;
import com.ippon.formation.gwt.client.ui.place.PlayersPlace;

public class AppActivityMapper implements ActivityMapper {

    public AppActivityMapper() {
        super();
    }

    @Override
    public Activity getActivity(Place place) {
        if (place instanceof PlayersPlace) {
            return new PlayersActivity();
        }
        return null;
    }
}
