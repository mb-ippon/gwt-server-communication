package com.ippon.formation.gwt.server.service;

import java.util.List;

import org.joda.time.DateTime;

import com.google.common.base.Function;
import com.google.common.collect.Lists;
import com.ippon.formation.gwt.shared.domain.entities.Player;
import com.ippon.formation.gwt.shared.domain.entities.Plays;

public class PlayerServiceImpl implements PlayerService {

    private final List<Player> players;

    public PlayerServiceImpl() {
        players = Lists.newArrayList();
        players.add(new Player("Djokovic N.", 188, 88, new DateTime(1987, 5, 22, 0, 0).toDate(), Plays.RightHanded,
                2003, 12260));
        players.add(new Player("Nadal R.", 185, 85, new DateTime(1986, 6, 3, 0, 0).toDate(), Plays.LeftHanded, 2001,
                13030));
        players.add(new Player("Federer R.", 185, 85, new DateTime(1981, 8, 8, 0, 0).toDate(), Plays.RightHanded, 1998,
                4205));
        players.add(new Player("Tsonga J.W.", 188, 91, new DateTime(1985, 4, 17, 0, 0).toDate(), Plays.RightHanded,
                2004, 3065));
        players.add(new Player("Ferrer D.", 175, 73, new DateTime(1982, 4, 2, 0, 0).toDate(), Plays.RightHanded, 2000,
                5800));
        players.add(new Player("Murray A.", 190, 84, new DateTime(1987, 5, 15, 0, 0).toDate(), Plays.RightHanded, 2005,
                5790));
        players.add(new Player("Del Potro J.M.", 198, 97, new DateTime(1988, 9, 23, 0, 0).toDate(), Plays.RightHanded,
                2005, 5255));
        players.add(new Player("Berdych T.", 196, 91, new DateTime(1985, 9, 17, 0, 0).toDate(), Plays.RightHanded,
                2002, 4180));
        players.add(new Player("Wawrinka S.", 183, 81, new DateTime(1985, 3, 28, 0, 0).toDate(), Plays.RightHanded,
                2002, 3730));
        players.add(new Player("Gasquet R.", 185, 75, new DateTime(1986, 6, 18, 0, 0).toDate(), Plays.RightHanded,
                2002, 3300));
    }

    @Override
    public List<Player> findClassement() {
        return Lists.transform(players, new Function<Player, Player>() {

            @Override
            public Player apply(Player input) {
                Player player = new Player();
                player.setName(input.getName());
                player.setAtpPoint(input.getAtpPoint());
                return player;
            }
        });
    }

    @Override
    public Player findPlayer(String name) {
        Player playerToReturn = null;
        for (Player player : players) {
            if (player.getName().equals(name)) {
                playerToReturn = player;
                break;
            }
        }
        return playerToReturn;
    }
}
