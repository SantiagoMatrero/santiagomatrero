const express = require('express');
const authRouter = express.Router();
const {validarLoginUsuario, crearTokenDeSesion} = require('./authController.js');


authRouter.route("/login").post(validarLoginUsuario, crearTokenDeSesion)



module.exports = authRouter