import { Banner,
    ElementBox,
    LeagueImg,
    LeagueName,
    RegionSelector,
    RegionSelectBanner} from "./styled-components";
export function FilledSeriesBar(props){
    return(
        <Banner>
            <ElementBox>
                <RegionSelectBanner>Select Region: </RegionSelectBanner>
                <RegionSelector onChange={props.changeSeries} id="series_selector">
                    {props.getRunningSeries.map(series => (
                        <option value={series}>{series.LeagueName}</option>
                        ))}
                </RegionSelector>
            </ElementBox>
            <ElementBox>
                <LeagueImg src={props.selectedSeries.LeagueImg} alt="null" />
            </ElementBox>
            <ElementBox>
                <LeagueName>{props.selectedSeries.LeagueName}</LeagueName>
            </ElementBox>
        </Banner>
    );
}