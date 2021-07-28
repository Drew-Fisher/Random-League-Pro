import { Banner, ElementBox, LeagueImg} from "./styled-components";
import loading from "../../../imgs/loading.gif";

export function LoadingSeriesBar(){
    return(
        <Banner>
            <ElementBox>
                <p>Select Region: </p>
                <select id="series_selector">
                <option value="loading">loading</option>
                </select>
            </ElementBox>
            <ElementBox>
                <LeagueImg src={loading} alt="null" />
            </ElementBox>
            <ElementBox>
                <p>Waiting</p>
            </ElementBox>
        </Banner>
    );
}