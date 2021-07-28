import React from 'react';
import ReactDOM from 'react-dom';
import App from './App';
import { ApolloClient,ApolloProvider, InMemoryCache } from '@apollo/client';
import { cache } from './cache';

const client = new ApolloClient({
  uri:'http://localhost:8080/graphql',
  cache: cache
});

ReactDOM.render(
  <React.StrictMode>
    <ApolloProvider client={client}>
      <App />
    </ApolloProvider>
  </React.StrictMode>,
  document.getElementById('root')
);


