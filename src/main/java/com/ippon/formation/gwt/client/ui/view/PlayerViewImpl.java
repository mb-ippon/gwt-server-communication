package com.ippon.formation.gwt.client.ui.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.editor.client.Editor;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.IntegerBox;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import com.ippon.formation.gwt.shared.domain.entities.Player;

public class PlayerViewImpl extends Composite implements PlayerView, Editor<Player> {

    private static PlayerViewImplUiBinder uiBinder = GWT.create(PlayerViewImplUiBinder.class);

    interface PlayerViewImplUiBinder extends UiBinder<Widget, PlayerViewImpl> {
    }

    @UiField
    @Path("name")
    TextBox name;

    @UiField
    @Path("atpPoint")
    IntegerBox atpPoint;

    public PlayerViewImpl() {
        initWidget(uiBinder.createAndBindUi(this));
    }
}
