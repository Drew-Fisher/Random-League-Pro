import { useMutation } from "@apollo/client";
import { GET_RANDOM_PLAYER_FROM_SERIES} from "../../Querys/getRandomPlayer";
import { EmptyPlayerBox, ErrorPlayerBox, FilledPlayerBox, LoadingPlayerBox} from "./components";
    
function PlayerBox(props){
    const seriesId= props.seriesId;
    const roleType= props.roleType;
    const roleImg = props.roleImg;
    const[ playerData, { data,loading,error }] = useMutation(GET_RANDOM_PLAYER_FROM_SERIES);
    //const { loading, error,data } = useQuery(GET_ALL_RUNNING_SERIES);

    function fetch(){
        playerData({ variables: { seriesId: seriesId, roleType: roleType}});
    }
    
    if(error){return(<ErrorPlayerBox />);}
    if(loading||props.seriesId==null){return(<LoadingPlayerBox roleImg={props.roleImg}/>);}
    if(!data){return(<EmptyPlayerBox roleImg={props.roleImg} fetch={fetch}/>);}
    return(
        <FilledPlayerBox data={data} roleImg={props.roleImg} fetch={fetch}/>
    );
}

export default PlayerBox;