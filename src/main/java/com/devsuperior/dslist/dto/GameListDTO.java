package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entities.GameList;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class GameListDTO {
    private Long id;
    private String name;

    public GameListDTO(GameList entity){
        this.id = entity.getId();
        this.name = entity.getName();
    }
}
