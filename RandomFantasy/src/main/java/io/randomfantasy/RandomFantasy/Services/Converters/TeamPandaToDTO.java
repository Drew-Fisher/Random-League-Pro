package io.randomfantasy.RandomFantasy.Services.Converters;

import io.randomfantasy.RandomFantasy.Models.DTO.TeamDTO;
import io.randomfantasy.RandomFantasy.Models.Panda.PandaTeam;
import org.springframework.stereotype.Service;

@Service
public class TeamPandaToDTO {
    public TeamDTO convertToDTO(PandaTeam panda){
        return TeamDTO.builder()
                .name(panda.getName())
                .img(panda.getImage_url())
                .id(panda.getId())
                .build();
    }
}
