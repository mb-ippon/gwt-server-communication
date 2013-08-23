package com.ippon.formation.gwt.client.ui.activity;

import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.ippon.formation.gwt.client.ui.view.PlayersView;
import com.ippon.formation.gwt.client.ui.view.PlayersViewImpl;

public class PlayersActivity extends AbstractActivity implements PlayersView.Presenter {

    @Override
    public void start(AcceptsOneWidget panel, EventBus eventBus) {
        panel.setWidget(new PlayersViewImpl());
    }

}
