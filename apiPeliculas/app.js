const express = require('express');
const logger = require('morgan');


const peliculasRouter = require('./src/peliculasCRUD/peliculasRouter.js');
const { allowedNodeEnvironmentFlags } = require('process');
const authRouter = require('./src/authCRUD/authRouter.js');

const app = express();

app.use(logger('dev'));
app.use(express.json());
app.use(express.urlencoded({ extended: false}));

app.use('/peliculas', peliculasRouter);
app.use('/auth', authRouter);

module.exports = app;