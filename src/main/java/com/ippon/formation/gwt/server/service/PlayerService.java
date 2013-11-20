package com.ippon.formation.gwt.server.service;

import java.util.List;

import com.ippon.formation.gwt.shared.domain.entities.Player;

public interface PlayerService {

    List<Player> findClassement();

    Player findPlayer(String name);
}
