const mongoose = require("mongoose")

const peliculasSchema = new mongoose.Schema({
    nombre: {type : String},
    anioEstreno:{type : Number},
    director:{type : String},
    elenco: {type : [String]},
    comentarios:{type :[String]}
})

peliculasSchema.statics.buscarPorId  = function(_id){
    return this.findById({_id: _id})
}

peliculasSchema.statics.eliminarPorId  = function(id){
    return this.delete({_id: id})
}

peliculasSchema.statics.postPelicula = function(){
    return this.create({"nombre": req.body.nombre, "anioEstreno": req.body.anioEstreno, "Director": req.body.director, "Elenco": req.body.elenco, "Comentarios": req.body.comentarios })
} 


module.exports = mongoose.model("Pelicula", peliculasSchema)