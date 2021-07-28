package io.randomfantasy.RandomFantasy.Services.Converters;

import io.randomfantasy.RandomFantasy.Models.DTO.SeriesDTO;
import io.randomfantasy.RandomFantasy.Models.Panda.PandaSeries;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.List;
import java.util.Properties;
import java.util.stream.Collectors;

@Service
public class SeriesPandaToDTO {

    public List<SeriesDTO> ConvertAllToDTO(List<PandaSeries> objects){
        return objects.stream().map(object -> ConvertToDTO(object)).collect(Collectors.toList());
    }

    public SeriesDTO ConvertToDTO(PandaSeries series){
        return SeriesDTO.builder()
                .SeriesID(series.getId())
                .SeriesName(series.getSlug())
                .LeagueName(series.getLeague().getName())
                .LeagueImg(series.getLeague().getImage_url())
                .build();
    }
}
