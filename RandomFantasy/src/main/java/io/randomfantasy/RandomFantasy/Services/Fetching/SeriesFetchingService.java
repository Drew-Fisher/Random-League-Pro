package io.randomfantasy.RandomFantasy.Services.Fetching;

import io.randomfantasy.RandomFantasy.Models.Panda.PandaSeries;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Arrays;
import java.util.List;

@Service
public class SeriesFetchingService {

    @Value("${spring.values.PandaScore.info.BaseURL}")
    private String BaseURL;

    @Value("${spring.values.PandaScore.info.RunningSeries}")
    private String RunningSeries;


    @Value("${spring.values.PandaScore.Secrets.Token}")
    private String Token;

    @Autowired
    WebClient.Builder webClient;

    public List<PandaSeries> GetRunningSeries(){
        PandaSeries[] query = webClient.baseUrl(BaseURL + RunningSeries)
                .build()
                .get()
                .headers(Headers-> Headers.setBearerAuth(Token))
                .retrieve()
                .bodyToMono(PandaSeries[].class)
                .block();
        return Arrays.asList(query);
    }
}
