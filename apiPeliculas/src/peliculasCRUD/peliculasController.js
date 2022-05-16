const { jsonPeliculas } = require("../utils/lectorJsonUtils")
const { escribirJson } = require("../utils/escribirJsonUtils.js")
const { findDocuments } = require("../utils/dbUtils.js")
var fs = require('fs')
const { strictEqual } = require("assert")
const { stringify } = require("querystring")
const Pelicula = require("../models/Pelicula")


module.exports.postPelicula = async (req, res) => {
    const peliculas = await jsonPeliculas(res)
    const pelicula = { "id": req.body.id, "nombre": req.body.nombre, "anioEstreno": req.body.anioEstreno, "Director": req.body.director, "Elenco": req.body.elenco, "Comentarios": req.body.comentarios }
    console.log(pelicula);
    peliculas.push(pelicula)
    const jsonString = JSON.stringify(peliculas)
    try {
        await fs.promises.writeFile("./peliculas.json", jsonString)
        res.status(202).send();
    }
    catch (err) {
        res.status(500).send();
    }
}

module.exports.filtrarPeliculaPorNombre = async (req, res) => {
    const peliculas = await jsonPeliculas(res)
    const peliculasFiltradas = peliculas.filter(pelicula => pelicula.nombre.includes(req.query.nombre))
    res.status(200).send(peliculasFiltradas)
}

module.exports.eliminarPeliculaPorId = async (req, res) => {
    const peliculas = await jsonPeliculas(res)
    const indexPelicula = peliculas.findIndex(pelicula => pelicula.id == req.params.id)
    peliculas.splice(indexPelicula, 1)
    const jsonString = JSON.stringify(peliculas)
    try {
        await fs.promises.writeFile("./peliculas.json", jsonString)
        res.status(202).send();
    }
    catch (err) {
        res.status(500).send();
    }
}

module.exports.getPeliculaPorId = async (req, res) => {
    Pelicula.find()
    .then(peliculas => {
        res.json(peliculas)
    })
    .catch(error => {
        console.log(error)
        res.status(500).json({error: "Ocurrio un error"})
    })
}

module.exports.agregarComentario = async (req, res) => {
    const peliculas = await jsonPeliculas(res)
    const peliculasModificadas = peliculas.map(pelicula => pelicula.id == req.params.id ? { ...pelicula, comentarios: pelicula.comentarios.concat(req.body.comentario) } : pelicula)
    const jsonString = JSON.stringify(peliculasModificadas)
    try {
        await fs.promises.writeFile("./peliculas.json", jsonString)
        res.status(202).send();
    }
    catch (err) {
        res.status(500).send();
    }
}

module.exports.modificarPeliculaPorId = async (req, res) => {
    const peliculas = await jsonPeliculas(res)
    const peliculasModificadas = peliculas.map(pelicula => pelicula.id == req.params.id ? { ...pelicula, [req.body.campo] : req.body.datos } : pelicula)
    const jsonString = JSON.stringify(peliculasModificadas)
    escribirJson(jsonString)
}
