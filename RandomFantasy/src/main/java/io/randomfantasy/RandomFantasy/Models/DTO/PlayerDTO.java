package io.randomfantasy.RandomFantasy.Models.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PlayerDTO {
    private int id;
    private String Name;
    private String Role;
    private TeamDTO current_team;
    private String Img;
}
