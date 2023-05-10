package com.devsuperior.dslist.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
@Entity
@Table(name = "tb_belonging")
public class Belonging {

    @EmbeddedId
    private BelongingPK id = new BelongingPK();

    private Integer position;

    public Belonging(GameList gameList, Game game, Integer position) {
        id.setGameList(gameList);
        id.setGame(game);
        this.position = position;
    }

}
