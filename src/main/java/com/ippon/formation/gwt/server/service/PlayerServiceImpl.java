package com.ippon.formation.gwt.server.service;

import java.util.Set;

import org.joda.time.DateTime;

import com.google.common.collect.Sets;
import com.ippon.formation.gwt.shared.domain.entities.Player;

public class PlayerServiceImpl implements PlayerService {

    @Override
    public Set<Player> findAllPlayers() {
        Set<Player> players = Sets.newHashSet();
        players.add(new Player("Djokovic N.", 187, new DateTime(1987, 5, 22, 0, 0).toDate()/* , Plays.RightHanded */));
        players.add(new Player("Nadal R.", 185, new DateTime(1986, 6, 3, 0, 0).toDate()/* , Plays.LeftHanded */));
        players.add(new Player("Federer R.", 185, new DateTime(1981, 8, 8, 0, 0).toDate()/* , Plays.RightHanded */));
        players.add(new Player("Tsonga J.W.", 187, new DateTime(1985, 4, 17, 0, 0).toDate()/* , Plays.RightHanded */));
        players.add(new Player("Dimitrov G.", 187, new DateTime(1991, 5, 16, 0, 0).toDate()/* , Plays.RightHanded */));
        return players;
    }
}
