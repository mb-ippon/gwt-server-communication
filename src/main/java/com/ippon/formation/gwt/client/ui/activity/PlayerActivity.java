package com.ippon.formation.gwt.client.ui.activity;

import com.google.gwt.core.client.GWT;
import com.google.gwt.editor.client.SimpleBeanEditorDriver;
import com.ippon.formation.gwt.client.ui.event.DisplayPlayerEvent;
import com.ippon.formation.gwt.client.ui.event.DisplayPlayerHandler;
import com.ippon.formation.gwt.client.ui.resources.ApplicationResources;
import com.ippon.formation.gwt.client.ui.view.PlayerView;
import com.ippon.formation.gwt.client.ui.view.PlayerView.Presenter;
import com.ippon.formation.gwt.client.ui.view.PlayerViewImpl;
import com.ippon.formation.gwt.shared.domain.entities.Player;

public class PlayerActivity implements Presenter {

    private final PlayerView display;
    private final PlayerDriver playerDriver = PlayerDriver.Util.getInstance();

    public PlayerActivity(PlayerView display) {
        this.display = display;
        bind();
    }

    public interface PlayerDriver extends SimpleBeanEditorDriver<Player, PlayerViewImpl> {

        public class Util {

            private static PlayerDriver instance;

            public static PlayerDriver getInstance() {
                if (instance == null) {
                    instance = GWT.create(PlayerDriver.class);
                }
                return instance;
            }
        }
    }

    protected void displayPlayer(Player player) {
        playerDriver.edit(player);
    }

    private void bind() {
        playerDriver.initialize((PlayerViewImpl) display);

        ApplicationResources.getHandlerManager().addHandler(DisplayPlayerEvent.TYPE, new DisplayPlayerHandler() {

            @Override
            public void onDisplayPlayer(DisplayPlayerEvent event) {
                displayPlayer(event.getPlayer());
            }
        });
    }
}
