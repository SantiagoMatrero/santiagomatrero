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

// x.hasOne(y)
// ingresa una clave xId a la tabla y

// Relaciones de Socio
Usuario.hasOne(Socio)
Club.hasMany(Socio)
Socio.hasMany(Pago)
Disciplina.belongsToMany(Socio, { through: "Socio_has_Disciplina" })
Socio.belongsToMany(Disciplina, { through: "Socio_has_Disciplina" })
Andarivel.belongsToMany(Socio, { through: "Andarivel_has_Socio" })
Socio.belongsToMany(Andarivel, { through: "Andarivel_has_Socio" })

// relaciones de Pago
Arrendatario.hasMany(Pago)
Pago.hasMany(Item)

// relaciones de item
Disciplina.hasMany(Item)
Sector.hasMany(Item)
Sucursal.hasMany(Item)

// relaciones de sector
Sector.hasMany(Andarivel)
Sucursal.hasMany(Sector)
Arrendatario.belongsToMany(Sector, { through: "Arrendatario_has_Sector" })
Sector.belongsToMany(Arrendatario, { through: "Arrendatario_has_Sector" })
Disciplina.belongsToMany(Sector, { through: "Sector_has_Disciplina" })
Sector.belongsToMany(Disciplina, { through: "Sector_has_Disciplina" })

// relaciones de sucursal
Sucursal.hasMany(Gasto)
Disciplina.belongsToMany(Sucursal, { through: "Disciplina_has_Sucursal" })
Sucursal.belongsToMany(Disciplina, { through: "Disciplina_has_Sucursal" })
Club.hasMany(Sucursal)
Sucursal.hasMany(Personal)

// relaciones dee personal
Disciplina.belongsToMany(Personal, { through: "Disciplina_has_Personal" })
Personal.belongsToMany(Disciplina, { through: "Disciplina_has_Personal" })

