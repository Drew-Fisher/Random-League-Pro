package io.randomfantasy.RandomFantasy.DataFetchers;

import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsMutation;
import graphql.schema.DataFetchingEnvironment;
import io.randomfantasy.RandomFantasy.Models.DTO.PlayerDTO;
import io.randomfantasy.RandomFantasy.Services.TransferService.PlayerTransferService;

@DgsComponent
public class PlayerDataFetcher {

    private final PlayerTransferService playerTransferService;

    public PlayerDataFetcher(PlayerTransferService playerTransferService) {
        this.playerTransferService = playerTransferService;
    }

    @DgsMutation(field = "getRandom")
    public PlayerDTO getRandom(DataFetchingEnvironment dataFetchingEnvironment){
        int series = dataFetchingEnvironment.getArgument("id");
        String role = dataFetchingEnvironment.getArgument("role");
        PlayerDTO player = playerTransferService.getRandomPlayer(series,role);
        return player;
    }
}
