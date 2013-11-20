package com.ippon.formation.gwt.client.ui.activity;

import java.util.List;

import com.google.common.collect.Lists;
import com.ippon.formation.gwt.client.ui.event.DisplayPlayerEvent;
import com.ippon.formation.gwt.client.ui.resources.ApplicationResources;
import com.ippon.formation.gwt.client.ui.view.PlayersView;
import com.ippon.formation.gwt.shared.domain.entities.Player;

public class PlayersActivity implements PlayersView.Presenter {

    private final PlayersView display;

    public PlayersActivity(PlayersView display) {
        this.display = display;
        this.display.setPresenter(this);
    }

    public void go() {
        Player player = new Player();
        player.setName("Mathieu");
        player.setAtpPoint(10);

        Player player2 = new Player();
        player2.setName("Julie");
        player2.setAtpPoint(15);

        Player player3 = new Player();
        player3.setName("Foufy");
        player3.setAtpPoint(12);
        List<Player> players = Lists.newArrayList(player, player2, player3);
        display.setData(players);
    }

    @Override
    public void onCellTableSelected(Player player) {
        ApplicationResources.getHandlerManager().fireEvent(new DisplayPlayerEvent(player));
    }
}
