const { Model, DataTypes } = require("sequelize")
// const { DESCRIBE } = require("sequelize/types/query-types")
const sequelize = require("../db")

class Sector extends Model {}

Sector.init({
    nombre: DataTypes.STRING,
    numero: DataTypes.INTEGER,
    descripcion: DataTypes.STRING
    }, {
    sequelize,
    modelName: "sector",
    timestamps: false,
    freezeTableName: true
})


module.exports = Sector