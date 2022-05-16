const express = require('express');
const logger = require('morgan');


const peliculasRouter = require('./src/peliculasCRUD/peliculasRouter.js');
const { allowedNodeEnvironmentFlags } = require('process');

const app = express();

app.use(logger('dev'));
app.use(express.json());
app.use(express.urlencoded({ extended: false}));

app.use('/peliculas', peliculasRouter);

module.exports = app;