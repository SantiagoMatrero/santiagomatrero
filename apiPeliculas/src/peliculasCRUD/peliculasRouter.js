const express = require('express');
const peliculasRouter = express.Router();

const { getPeliculaPorId, filtrarPeliculaPorNombre, eliminarPeliculaPorId, postPelicula, agregarComentario, modificarPeliculaPorId } = require("./peliculasController.js");
const {validatorId, validatorModificarPelicula, validatorBuscarPeliculaPorNombre, validatorAgregarPeliculas, validatorAgregarComentario} = require("../authCRUD/authValidator")


peliculasRouter.post('/:id/comentarios', validatorId, validatorAgregarComentario, agregarComentario)

peliculasRouter.route('/:id')
    .get(validatorId, getPeliculaPorId)
    .delete(validatorId, eliminarPeliculaPorId)
    .patch(validatorId, validatorModificarPelicula, modificarPeliculaPorId)

peliculasRouter.route('/')
    .get(validatorBuscarPeliculaPorNombre, filtrarPeliculaPorNombre)
    .post(validatorAgregarPeliculas, postPelicula)


module.exports = peliculasRouter