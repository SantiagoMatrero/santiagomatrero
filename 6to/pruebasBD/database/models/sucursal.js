const { Model, DataTypes } = require("sequelize")
// const { DESCRIBE } = require("sequelize/types/query-types")
const sequelize = require("../db")

class Sucursal extends Model {}

Sucursal.init({
    direccion: DataTypes.STRING,
    }, {
    sequelize,
    modelName: "sucursal",
    timestamps: false,
    freezeTableName: true
})


module.exports = Sucursal