
const { verificarValidacion } = require("../utils/validationUtils")
const { param, query, body, header } = require("express-validator")



module.exports.validatorId = [
    param("id").trim().isAlphanumeric().withMessage("El ID son solo numeros"),
    
    verificarValidacion
]


module.exports.validatorBuscarPeliculaPorNombre = [
    query("name").optional().trim().isAlphanumeric().optional().withMessage("Las peliculas solo deben tener letras y numeros"),

    verificarValidacion
]

module.exports.validatorModificarPelicula = [


    body("nombre")
    .trim().optional()
    .notEmpty().withMessage("El nombre es obligatorio").bail()
    .isString().withMessage("El nombre debe ser un string"),

    body("anioEstreno")
    .trim().optional()
    .isNumeric().withMessage("El año de estreno deben ser solo numeros").bail()
    .isLength({min:4,max:4}).withMessage("El año solo debe tener 4 digitos"),


    body("director")
    .trim().optional()
    .isString().withMessage("El nombre del director debe ser un string"),

    body("elenco")
    .isArray().optional()
    .isAlpha()
    .trim().withMessage("El elenco es un array"),

    body("comentarios")
    .isArray().optional()
    .isAlphanumeric()
    .trim().withMessage("los comentarios son un array alfanumerico"),
    
    verificarValidacion

]


module.exports.validatorAgregarPeliculas = [
    body("nombre")
    .trim()
    .notEmpty().withMessage("El nombre es obligatorio").bail()
    .isString().withMessage("El nombre debe ser un string"),

    body("anioEstreno")
    .trim()
    .isNumeric().withMessage("El año de estreno deben ser solo numeros").bail()
    .isLength({min:4,max:4}).withMessage("El año solo debe tener 4 digitos"),


    body("director")
    .trim()
    .isString().withMessage("El nombre del director debe ser un string"),

    body("elenco")
    .isArray()
    .isAlpha()
    .trim().withMessage("El elenco es un array"),

    body("comentarios")
    .isArray()
    .isAlphanumeric()
    .trim().withMessage("Los comentarios son un array alfanumerico"),

    verificarValidacion

]



module.exports.validatorAgregarComentario = [
    
    body("comentarios")
    .trim()
    .isAlphanumeric().withMessage("Los comentarios pueden tener numeros y letras"),

    verificarValidacion
]


module.exports.authorizationHeaderValidator = [
    header("Authorization")
    
    .isString().withMessage("El bearer de autorizacion debe ser un string").bail()
    .customSanitizer(value => value.split(" ")[1])
    .isJWT().withMessage("Debe ser JWT"),

    verificarValidacion
]