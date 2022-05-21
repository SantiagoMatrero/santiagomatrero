const jwt = require("jsonwebtoken")
const config = require("config");




module.exports.crearToken = (body) => {
    return new Promise((resolve, reject) => {
        jwt.sign(body, config.get("Authentication.jwtSecret"), {expiresIn: config.get("Authentication.jwtExpiry")}, (error, token) => {

            if(error) return reject(error);

            resolve(token)
        });
    })
}



module.exports.verificarToken = (token) => {
    return new Promise((resolve, reject) => {
        jwt.verify(token, config.get("Authentication.jwtSecret"), (error, decoded) => {

            if(error) return reject(error);

            resolve(decoded = jwt.decode(token))
        });
    })
}