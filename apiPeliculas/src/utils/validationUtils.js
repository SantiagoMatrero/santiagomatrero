const { validationResult } = require("express-validator");


module.exports.verificarValidacion = (req, res, next) => {

    const errores = validationResult(req)

    if(errores.isEmpty()) 
        return next()

    
    res.status(400).json({
        message: errores.array()
    })

}

module.exports.verificarValidacionJWT = (req, res, next) => {
    const errores = validationResult(req)

    if(errores.isEmpty()) 
        return next()

    
    res.status(401).json({
        message: "el JWT debe estar en Header Authorization"
    })

}
