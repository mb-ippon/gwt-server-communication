package com.ippon.formation.gwt.client.ui.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.Widget;

public class Wrapper extends Composite {

    private static BasicUIBinderUiBinder uiBinder = GWT.create(BasicUIBinderUiBinder.class);

    @UiField
    SimplePanel content;

    interface BasicUIBinderUiBinder extends UiBinder<Widget, Wrapper> {
    }

    public Wrapper() {
        initWidget(uiBinder.createAndBindUi(this));
        CssResources.INSTANCE.myCss().ensureInjected();
    }

    public SimplePanel getContent() {
        return content;
    }
}
