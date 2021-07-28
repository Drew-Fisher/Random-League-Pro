import { useQuery } from "@apollo/client"
import { GET_ALL_RUNNING_SERIES, GET_SELECTED_SERIES } from "../../Querys";
import { selectedSeriesVar } from "../../cache";

export const useQueryMultiple = () => {
    const series = useQuery(GET_ALL_RUNNING_SERIES,
        {onCompleted: dataSeries => {selectedSeriesVar(dataSeries.getRunningSeries[0])}});
    const selected = useQuery(GET_SELECTED_SERIES);
    return[series, selected];
}