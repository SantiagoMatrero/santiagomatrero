const { Model, DataTypes } = require("sequelize")
// const { DESCRIBE } = require("sequelize/types/query-types")
const sequelize = require("../db")

class Gasto extends Model {}

Gasto.init({
    nombre: DataTypes.STRING,
    precio: DataTypes.FLOAT
    }, {
    sequelize,
    modelName: "gasto",
    timestamps: false,
    freezeTableName: true
})


module.exports = Gasto