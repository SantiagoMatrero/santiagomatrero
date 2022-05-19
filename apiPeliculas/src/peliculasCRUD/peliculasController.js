const Pelicula = require("../models/Pelicula.js")


module.exports.postPelicula = async (req, res) => {

    const { id, nombre, anioEstreno, director, elenco, comentarios } = req.body
    
    const pelicula = new Pelicula({
        id, 
        nombre,
        anioEstreno,
        director,
        elenco,
        comentarios
    })

    pelicula.save()
        .then(() => {
            res.json(pelicula)
        })
        .catch(error => {
            console.log(error);
        })
}

module.exports.filtrarPeliculaPorNombre = async (req, res) => {
    const pelicula = await Pelicula.buscarPorNombre(req.query.nombre)
    res.status(200).send(pelicula)
}

module.exports.eliminarPeliculaPorId = async (req, res) => {
    await Pelicula.findByIdAndDelete(req.params.id)
    res.status(200).send("Eliminada correctamente")
}

module.exports.getPeliculaPorId = async (req, res) => {
    const pelicula = await Pelicula.buscarPorId(req.params.id)
    res.status(200).send(pelicula)
}

module.exports.agregarComentario = async (req, res) => {

    const nuevoComentario = req.body.comentario
    
    Pelicula.findById(req.params.id)
        .then(Pelicula => {
            Pelicula.comentarios.push(nuevoComentario)
            Pelicula.save()
                .then(modified => {
                    res.status(200).send(modified)
                })
        })
        .catch(err => next(err))
    
}

module.exports.modificarPeliculaPorId = async (req, res) => {
    
    Pelicula.findById(req.params.id)
        .then(Pelicula => {
            Pelicula[req.body.campo] = req.body.datos
            Pelicula.save()
                .then(modified => {
                    res.status(200).send(modified)
                })
        })
        .catch(err => next(err))
}