import { ElementBox, Wrapper} from "./styled-components";

export function ErrorPlayerBox(props){

    return(
        <Wrapper>
            <ElementBox height="60%">
                <p>an Error has occured please refresh the page then try again</p>
            </ElementBox>
        </Wrapper>
    );
}