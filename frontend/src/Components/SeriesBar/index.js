import { ErrorSeriesBar, FilledSeriesBar, LoadingSeriesBar} from "./components";
import { selectedSeriesVar } from "../../cache";
import { useQueryMultiple } from "../Hooks/usequeryMultiple";

function SeriesBar(){
    const[{loading: loadingSeries, error: errorSeries, data: dataSeries},
        {loading: loadingSelected, error: errorSelected, data: dataSelected}]
        = useQueryMultiple();

        function changeSeries(){
            selectedSeriesVar(dataSeries.getRunningSeries[document.getElementById("series_selector").selectedIndex]);
        }

        if(loadingSeries) return<LoadingSeriesBar />
        if(errorSeries) return<ErrorSeriesBar />
        return(
            <FilledSeriesBar getRunningSeries={dataSeries.getRunningSeries} selectedSeries={dataSelected.selectedSeries} changeSeries={changeSeries}/>
        );
}

export default SeriesBar;