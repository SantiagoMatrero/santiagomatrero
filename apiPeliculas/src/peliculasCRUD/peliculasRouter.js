const express = require('express');
const peliculasRouter = express.Router();

const { getPeliculaPorId, filtrarPeliculaPorNombre, eliminarPeliculaPorId, postPelicula, agregarComentario, modificarPeliculaPorId } = require("./peliculasController.js");



peliculasRouter.post('/:id/comentarios', agregarComentario)

peliculasRouter.route('/:id')
    .get(getPeliculaPorId)
    .delete(eliminarPeliculaPorId)
    .patch(modificarPeliculaPorId)

peliculasRouter.route('/')
    .get(filtrarPeliculaPorNombre)
    .post(postPelicula)


module.exports = peliculasRouter