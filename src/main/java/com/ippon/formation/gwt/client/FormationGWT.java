package com.ippon.formation.gwt.client;

import com.google.gwt.activity.shared.ActivityManager;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceHistoryHandler;
import com.google.gwt.user.client.ui.RootPanel;
import com.ippon.formation.gwt.client.ui.activity.AppActivityMapper;
import com.ippon.formation.gwt.client.ui.place.AppPlaceHistoryMapper;
import com.ippon.formation.gwt.client.ui.place.PlayersPlace;
import com.ippon.formation.gwt.client.ui.resources.ApplicationResources;
import com.ippon.formation.gwt.client.ui.view.Wrapper;

public class FormationGWT implements EntryPoint {

    private final Place defaultPlace = new PlayersPlace("players");

    @Override
    public void onModuleLoad() {
        Wrapper wrapper = new Wrapper();
        // Start ActivityManager for the main widget with our ActivityMapper
        ActivityMapper activityMapper = new AppActivityMapper();
        ActivityManager activityManager = new ActivityManager(activityMapper, ApplicationResources.getEventBus());
        activityManager.setDisplay(wrapper.getContent());

        // Start PlaceHistoryHandler with our PlaceHistoryMapper
        AppPlaceHistoryMapper historyMapper = GWT.create(AppPlaceHistoryMapper.class);
        PlaceHistoryHandler historyHandler = new PlaceHistoryHandler(historyMapper);
        historyHandler.register(ApplicationResources.getPlaceController(), ApplicationResources.getEventBus(),
                defaultPlace);
        RootPanel.get().add(wrapper);
        // Goes to the place represented on URL else default place
        historyHandler.handleCurrentHistory();
    }
}
