package io.randomfantasy.RandomFantasy.Services.Fetching;

import io.randomfantasy.RandomFantasy.Models.Panda.PandaPlayer;
import io.randomfantasy.RandomFantasy.Models.Panda.PandaSeries;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Arrays;
import java.util.List;

@Service
public class PlayerFetchingService {

    @Value("${spring.values.PandaScore.info.BaseURL}")
    private String BaseURL;

    @Value("${spring.values.PandaScore.info.Players}")
    private String players_extension;

    @Value("${spring.values.PandaScore.Secrets.Token}")
    private String Token;

    @Autowired
    WebClient.Builder webClient;

    public List<PandaPlayer> getPlayersByTeamAndRole(int teamid, String role){
        PandaPlayer[] query = webClient.baseUrl(BaseURL)
                .build()
                .get()
                .uri(uriBuilder -> uriBuilder
                .path(players_extension)
                .queryParam("filter[team_id]", teamid)
                .queryParam("filter[role]", role)
                .build())
                .headers(Headers-> Headers.setBearerAuth(Token))
                .retrieve()
                .bodyToMono(PandaPlayer[].class)
                .block();
        return Arrays.asList(query);
    }
}
