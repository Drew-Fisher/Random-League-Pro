import { ElementBox,
    PlayerImg,
    ReRollButton,
    RoleIcon,
    Wrapper} from "./styled-components";
import question from "../../../imgs/random.png";

export function EmptyPlayerBox(props){

    return(
        <Wrapper>
            <ElementBox height="10%">
                <RoleIcon src={props.roleImg} alt="null"/>
            </ElementBox>
            <ElementBox height="45%">
                <PlayerImg src={question} alt="null"/>
            </ElementBox>
            <ElementBox height="10%">
                <ReRollButton onClick={props.fetch}>Get Player</ReRollButton>
            </ElementBox>
        </Wrapper>
    );
}