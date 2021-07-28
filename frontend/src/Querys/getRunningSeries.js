import { gql } from "@apollo/client";

export const GET_ALL_RUNNING_SERIES = gql`
query{
    getRunningSeries{
      LeagueName
      LeagueImg
      SeriesName
      SeriesID
    }
  }`;