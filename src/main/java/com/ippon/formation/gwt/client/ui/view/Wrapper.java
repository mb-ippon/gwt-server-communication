package com.ippon.formation.gwt.client.ui.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class Wrapper extends Composite {

    private static BasicUIBinderUiBinder uiBinder = GWT.create(BasicUIBinderUiBinder.class);

    interface BasicUIBinderUiBinder extends UiBinder<Widget, Wrapper> {
    }

    public Wrapper() {
        initWidget(uiBinder.createAndBindUi(this));
        CssResources.INSTANCE.myCss().ensureInjected();
    }

    @UiField
    PlayersViewImpl classement;
    @UiField
    PlayerViewImpl player;

    public PlayersView getClassement() {
        return classement;
    }

    public PlayerView getPlayer() {
        return player;
    }
}
