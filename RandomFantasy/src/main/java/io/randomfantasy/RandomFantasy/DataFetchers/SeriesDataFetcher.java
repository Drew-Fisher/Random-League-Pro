package io.randomfantasy.RandomFantasy.DataFetchers;

import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsQuery;
import io.randomfantasy.RandomFantasy.Models.DTO.SeriesDTO;
import io.randomfantasy.RandomFantasy.Services.TransferService.SeriesTransferService;


import java.util.List;


@DgsComponent
public class SeriesDataFetcher {

    private final SeriesTransferService transferService;

    public SeriesDataFetcher(SeriesTransferService transferService) {
        this.transferService = transferService;
    }

    @DgsQuery(field = "getRunningSeries")
    public List<SeriesDTO> getRunningSeries(){
        return transferService.getRunningSeries();
    }
}
