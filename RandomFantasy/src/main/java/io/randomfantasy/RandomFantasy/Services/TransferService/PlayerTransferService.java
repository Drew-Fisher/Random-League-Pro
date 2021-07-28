package io.randomfantasy.RandomFantasy.Services.TransferService;

import io.randomfantasy.RandomFantasy.Models.DTO.PlayerDTO;
import io.randomfantasy.RandomFantasy.Models.Panda.PandaPlayer;
import io.randomfantasy.RandomFantasy.Models.Panda.PandaTeam;
import io.randomfantasy.RandomFantasy.Services.Converters.PlayerPandaToDTO;
import io.randomfantasy.RandomFantasy.Services.Fetching.PlayerFetchingService;
import io.randomfantasy.RandomFantasy.Services.Fetching.TeamFetchingService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class PlayerTransferService {

    private final PlayerFetchingService playerFetchingService;
    private final TeamFetchingService teamFetchingService;
    private final PlayerPandaToDTO playerConverter;

    public PlayerTransferService(PlayerFetchingService playerFetchingService, TeamFetchingService teamFetchingService, PlayerPandaToDTO playerConverter) {
        this.playerFetchingService = playerFetchingService;
        this.teamFetchingService = teamFetchingService;
        this.playerConverter = playerConverter;
    }

    public PlayerDTO getRandomPlayer(int series, String role){
        List<PandaTeam> teams = teamFetchingService.getTeamsOfSeries(series);
        Random rand = new Random();
        List<PandaPlayer> players = playerFetchingService.getPlayersByTeamAndRole(teams.get(rand.nextInt(teams.size())).getId(),role);
        PandaPlayer player = players.get(rand.nextInt(players.size()));

        return playerConverter.convertToDTO(player);
    }

//    public List<PlayerDTO> getRandomTeam(int series){
//
//    }
}
