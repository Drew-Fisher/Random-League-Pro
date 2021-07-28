package io.randomfantasy.RandomFantasy.Services.Converters;

import io.randomfantasy.RandomFantasy.Models.DTO.PlayerDTO;
import io.randomfantasy.RandomFantasy.Models.DTO.TeamDTO;
import io.randomfantasy.RandomFantasy.Models.Panda.PandaPlayer;
import org.springframework.stereotype.Service;

@Service
public class PlayerPandaToDTO {
    private final TeamPandaToDTO teamConverter;

    public PlayerPandaToDTO(TeamPandaToDTO teamConverter) {
        this.teamConverter = teamConverter;
    }

    public PlayerDTO convertToDTO(PandaPlayer player){
        TeamDTO team = teamConverter.convertToDTO(player.getCurrent_team());
        return PlayerDTO.builder()
                .id(player.getId())
                .Name(player.getName())
                .Img(player.getImage_url())
                .Role(player.getRole())
                .current_team(team)
                .build();
    }
}
