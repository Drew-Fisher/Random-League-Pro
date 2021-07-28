import { gql } from "@apollo/client";

export const GET_RANDOM_PLAYER_FROM_SERIES = gql`
mutation getRandom($seriesId: Int, $roleType: String){
    getRandom(id: $seriesId, role: $roleType){
      name
      role
      Img
      current_team{
        img
        name
      }
    }
  }
`  