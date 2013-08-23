package com.ippon.formation.gwt.server.service;

import java.util.Set;

import com.ippon.formation.gwt.shared.domain.entities.Player;

public interface PlayerService {

    Set<Player> findAllPlayers();
}
