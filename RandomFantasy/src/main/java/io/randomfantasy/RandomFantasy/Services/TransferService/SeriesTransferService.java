package io.randomfantasy.RandomFantasy.Services.TransferService;

import io.randomfantasy.RandomFantasy.Models.DTO.SeriesDTO;
import io.randomfantasy.RandomFantasy.Models.Panda.PandaSeries;
import io.randomfantasy.RandomFantasy.Services.Converters.SeriesPandaToDTO;
import io.randomfantasy.RandomFantasy.Services.Fetching.SeriesFetchingService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeriesTransferService {
    private final SeriesFetchingService fetchingService;
    private final SeriesPandaToDTO converter;

    public SeriesTransferService(SeriesFetchingService fetchingService, SeriesPandaToDTO converter) {
        this.fetchingService = fetchingService;
        this.converter = converter;
    }

    public List<SeriesDTO> getRunningSeries(){
        List<PandaSeries> fetched = fetchingService.GetRunningSeries();
        return converter.ConvertAllToDTO(fetched);
    }
}
