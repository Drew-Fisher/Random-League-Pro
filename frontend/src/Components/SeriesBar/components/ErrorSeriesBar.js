import { Banner, ElementBox} from "./styled-components";

export function ErrorSeriesBar(){
    return(
        <Banner>
            <ElementBox>
                <p>Select Region: </p>
                <select id="series_selector">
                <option value="error">error</option>
                </select>
            </ElementBox>
            <ElementBox>
                <p>Something went wrong please refresh the page or try again later</p>
            </ElementBox>
            <ElementBox>
                <p>Error</p>
            </ElementBox>
        </Banner>
    );
}