package io.randomfantasy.RandomFantasy.Models.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SeriesDTO {
    private int SeriesID;
    private String SeriesName;
    private String LeagueName;
    private String LeagueImg;
}
