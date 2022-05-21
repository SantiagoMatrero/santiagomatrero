const fs = require("fs")
const { crearToken, verificarToken } = require("../utils/tokenUtils")
// const { responseUnauthorizedError, responseServerError,  } = require("../utils/responseUtils")


module.exports.crearTokenDeSesion = (req, res) => {

    crearToken(dataUsuario)
    .then(token => {
        res.status(200).json({
            message: token
        })
    })
    .catch(error => {

        responseServerError(res, error)

        })
    }

module.exports.verificarTokenDeSesion = (req, res, next) => {

    var tokenAVerificar = req.headers.authorization

     
    verificarToken(tokenAVerificar)
    .then(next())


    .catch(error => {
        responseUnauthorizedError(res, error)
    })
}
            



module.exports.validarLoginUsuario = (req, res, next) => {

    const usuario = req.body.usuario
    const contraseña = req.body.contraseña

    if(usuario == "admin" && contraseña == "12345") next()
//    else responseUnauthorizedError(res, "no estas autorizado")

}
