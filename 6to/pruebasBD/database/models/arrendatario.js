const { Model, DataTypes } = require("sequelize")
// const { DESCRIBE } = require("sequelize/types/query-types")
const sequelize = require("../db")

class Arrendatario extends Model {}

Arrendatario.init({
    nombre: DataTypes.STRING,
    apellido: DataTypes.STRING,
    descripcion: DataTypes.STRING
    }, {
    sequelize,
    modelName: "arrendatario",
    timestamps: false,
    freezeTableName: true
})


module.exports = Arrendatario