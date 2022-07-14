const express = require('express')
const app = express()
const sequelize = require('./database/db')
const Andariveles = require("./database/models/andarivel.js")
const Arrendatarios = require("./database/models/arrendatario.js")
const ClaseAndariveles = require("./database/models/claseAndarivel")
const Club = require("./database/models/club.js")
const Disciplina = require("./database/models/disciplina.js")
const Gasto = require("./database/models/gasto.js")
const Item = require("./database/models/item")
const Pagos = require("./database/models/pago")
const Personal = require("./database/models/personal.js")
const Sectores = require("./database/models/sector.js")
const Socios = require("./database/models/socio.js")
const Sucursal = require("./database/models/sucursal.js")
const Usuario = require("./database/models/usuario.js")
require('./database/relaciones')


const port = 3333

app.get('/', async (req, res) => {

})

app.listen(port, () => {
  console.log(`Example app listening on port ${port}`)
})


sequelize.sync({force: false}).then(() => {
console.log("Nos hemos conectado correcamente a la base")
}).catch(error => {
console.log("Se ha producido un error", error)
})
