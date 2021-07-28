package io.randomfantasy.RandomFantasy.Models.Panda;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PandaTeam {
    private String name;
    private String image_url;
    private int id;
}
