package io.randomfantasy.RandomFantasy.Services.Fetching;

import io.randomfantasy.RandomFantasy.Models.Panda.PandaTeam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Arrays;
import java.util.List;

@Service
public class TeamFetchingService {

    @Value("${spring.values.PandaScore.info.BaseURL}")
    private String baseURL;

    @Value("${spring.values.PandaScore.info.Teams-suf}")
    private String TeamsExtension;

    @Value("${spring.values.PandaScore.info.Series}")
    private String SeriesExtension;

    @Value("${spring.values.PandaScore.Secrets.Token}")
    private String Token;

    @Autowired
    WebClient.Builder webClient;

    public List<PandaTeam> getTeamsOfSeries(int id){
       PandaTeam[] query = webClient.baseUrl(baseURL + SeriesExtension+ id + TeamsExtension)
                .build()
                .get()
                .headers(Headers -> Headers.setBearerAuth(Token))
                .retrieve()
                .bodyToMono(PandaTeam[].class)
                .block();
       return Arrays.asList(query);
    }
}
