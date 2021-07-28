package io.randomfantasy.RandomFantasy.Models.Panda;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PandaSeries {
    private int id;
    private PandaLeague league;
    private String slug;
}
