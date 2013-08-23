package com.ippon.formation.gwt.client.ui.resources;

import com.google.gwt.core.shared.GWT;
import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.place.shared.PlaceController;
import com.google.web.bindery.event.shared.EventBus;

public class ApplicationResources {

    private static Messages messages;
    private static EventBus eventBus = new SimpleEventBus();
    private static PlaceController placeController = new PlaceController(eventBus);

    public static Messages getMessages() {
        if (messages == null) {
            messages = GWT.create(Messages.class);
        }
        return messages;
    }

    public static EventBus getEventBus() {
        return eventBus;
    }

    public static PlaceController getPlaceController() {
        return placeController;
    }
}
