const mongoose = require("mongoose")
const { Schema } = mongoose

const Pelicula = new Schema({
    id: String,
    nombre: String,
    anioEstreno: String,
    director: String,
    elenco: [String],
    comentarios: [String]
},)

Pelicula.statics.buscarPorId  = function(id){
    return this.findOne({_id: id})
}

Pelicula.statics.buscarPorNombre  = function(nombre){
    return this.find( { 'nombre': new RegExp(nombre) } )
}



module.exports = mongoose.model("Pelicula", Pelicula)