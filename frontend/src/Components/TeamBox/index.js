import PlayerBox from "../PlayerBox";

import Top_icon from "../../imgs/Top_icon.png";
import Jun_icon from "../../imgs/Jungle_icon.png";
import Mid_icon from "../../imgs/Middle_icon.png";
import Bot_icon from "../../imgs/Bottom_icon.png";
import Sup_icon from "../../imgs/Support_icon.png";

import { GET_SELECTED_SERIES } from "../../Querys";
import { useQuery } from "@apollo/client";

import {Wrapper} from "./styled-components";



function TeamBox(){
    const {data, loading, error } = useQuery(GET_SELECTED_SERIES);
     if(loading) return <div />;
     if(error ) return <div />;
     if(!data ) return <div />;
    return(
        <Wrapper>
            <div>
            <PlayerBox seriesId={data.selectedSeries.SeriesID} roleType="top" roleImg={Top_icon}/>
            </div>
            <div>
            <PlayerBox seriesId={data.selectedSeries.SeriesID} roleType="jun" roleImg={Jun_icon}/>
            </div>
            <div>
            <PlayerBox seriesId={data.selectedSeries.SeriesID} roleType="mid" roleImg={Mid_icon}/>
            </div>
            <div>
            <PlayerBox seriesId={data.selectedSeries.SeriesID} roleType="adc" roleImg={Bot_icon}/>
            </div>
            <div>
            <PlayerBox seriesId={data.selectedSeries.SeriesID} roleType="sup" roleImg={Sup_icon}/>
            </div>
        </Wrapper>
    );
}

export default TeamBox;