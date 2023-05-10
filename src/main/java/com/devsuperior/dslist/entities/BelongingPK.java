package com.devsuperior.dslist.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "game, gameList")
@Embeddable
public class BelongingPK {

    @ManyToOne
    @JoinColumn(name = "list_id")
    private GameList gameList;
    @ManyToOne
    @JoinColumn(name = "game_id")
    private Game game;


}
