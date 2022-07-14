const sequelize = require("./db")


const Andarivel = require("./models/andarivel")
const Arrendatario = require("./models/arrendatario")
const ClaseAndarivel = require("./models/claseAndarivel")
const Club = require("./models/club.js")
const Disciplina = require("./models/disciplina.js")
const Gasto = require("./models/gasto.js")
const Item = require("./models/item")
const Pago = require("./models/Pago.js")
const Personal = require("./models/personal.js")
const Sector = require("./models/Sector.js")
const Socio = require("./models/Socio.js")
const Sucursal = require("./models/sucursal.js")
const Usuario = require("./models/usuario.js")
require('./relaciones')


const clubs = [
    { nombre: "Boca" },
    { nombre: "Riber" },
]


sequelize.sync({force: true}).then(() => {
  console.log("Nos hemos conectado correcamente a la base")
}).catch(error => {
  console.log("Se ha producido un error", error)
}).then(() => {
    clubs.forEach(club => Club.create(club))
}).then( async () => {
    let sucursal1 = await Sucursal.create({
        direccion: "Bolivia 123",
        clubId: 1,
    })

    let sucursal2 = await Sucursal.create({
        direccion: "Nazca 123",
        clubId: 1,
    })

    let sucursal3 = await Sucursal.create({
        direccion: "Albarellos 123",
        clubId: 2,
    })

    let disciplina1 = await Disciplina.create({
        nombre : "futbol",
        precio : 200, 
        sectors : [
            {nombre : "pileta fondo",
            numero : 1,
            descripcion :  "",
            idSucursal : 1}
        ]
    }, {
        include : "sectors"
    })

    let disciplina2 = await Disciplina.create({
        nombre : "tenis",
        precio : 150, 
        sectors : [
            {nombre : "cancha",
            numero : 1,
            descripcion :  "",
            idSucursal : 3}
        ]
    }, {
        include : "sectors"
    })

    let disciplina3 = await Disciplina.create({
        nombre : "basquet",
        precio : 100, 
        sectors : [
            {nombre : "patio",
            numero : 2,
            descripcion :  "",
            idSucursal : 2}
        ]
    }, {
        include : "sectors"
    })


})
