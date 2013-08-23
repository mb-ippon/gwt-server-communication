package com.ippon.formation.gwt.client.ui.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class NavBar extends Composite {

    private static NavBarUiBinder uiBinder = GWT.create(NavBarUiBinder.class);

    interface NavBarUiBinder extends UiBinder<Widget, NavBar> {
    }

    public NavBar() {
        initWidget(uiBinder.createAndBindUi(this));
    }

}
