import { gql } from "@apollo/client";
export const GET_SELECTED_SERIES = gql`
query getSelectedSeries{
    selectedSeries @client
}`;