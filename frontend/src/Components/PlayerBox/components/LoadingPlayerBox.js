import { ElementBox,
    PlayerImg,
    RoleIcon,
    Wrapper} from "./styled-components";
import loading from "../../../imgs/loading.gif";

export function LoadingPlayerBox(props){

    return(
        <Wrapper>
            <ElementBox height="10%">
                <RoleIcon src={props.roleImg} alt="null"/>
            </ElementBox>
            <ElementBox height="45%">
                <PlayerImg src={loading} alt="null"/>
            </ElementBox>
        </Wrapper>
    );
}