import { InMemoryCache, makeVar } from "@apollo/client";

export const selectedSeriesVar = makeVar([]);

export const cache = new InMemoryCache({
    typePolicies: {
        Query: {
          fields: {
            selectedSeries: {
              read() {
                return selectedSeriesVar();
              }
            },
          }
        }
      }
})