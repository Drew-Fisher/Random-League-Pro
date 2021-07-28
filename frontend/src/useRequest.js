import { useQuery, gql } from "@apollo/client";

export function useGetRandomPlayer(seriesId,roleType){
    // return useQuery(["get-Player", seriesId, roleType], async () => {
    //     const { data } = await graphqlClient.request(gql`
    //     mutation{
    //         getRandom(id: 3660, role: adc){
    //             name
    //             role
    //             img
    //             current_team{
    //                 name
    //                 img
    //             }
    //         }
    //     }`,
    //     { seriesId, roleType });
    //     return data;
    // });
}

export function useGetSeries(){
    // return useQuery("get-series", async () => {
        
    // });
}