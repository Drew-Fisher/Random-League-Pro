import { ElementBox,
    PlayerImg,
    PlayerName,
    ReRollButton,
    RoleIcon,
    TeamIcon,
    TeamName,
    Wrapper} from "./styled-components";
import noImage from "../../../imgs/noImg.png";

export function FilledPlayerBox(props){
    var img = props.data.getRandom.Img;
    if(!img){
        img = noImage;
    }
    return(
        <Wrapper>
            <ElementBox height="10%">
                <RoleIcon src={props.roleImg} alt="null"/>
            </ElementBox>
            <ElementBox height="45%">
                <PlayerImg src={img} alt="no image"/>
            </ElementBox>
            <ElementBox height="10%" color="black">
                <PlayerName>{props.data.getRandom.name}</PlayerName>
            </ElementBox>
            <ElementBox height="20%">
                <TeamIcon src={props.data.getRandom.current_team.img} alt="no image" />
            </ElementBox>
            <ElementBox height="5%">
                <TeamName>{props.data.getRandom.current_team.name}</TeamName>
            </ElementBox>
            <ElementBox height="10%">
                <ElementBox height="20%" />
                <ReRollButton onClick={props.fetch}>roll again?</ReRollButton>
            </ElementBox>
        </Wrapper>
    );
}