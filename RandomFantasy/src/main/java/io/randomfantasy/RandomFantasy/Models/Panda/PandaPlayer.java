package io.randomfantasy.RandomFantasy.Models.Panda;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class PandaPlayer {
    private int id;
    private String name;
    private String image_url;
    private String role;
    private PandaTeam current_team;
}
