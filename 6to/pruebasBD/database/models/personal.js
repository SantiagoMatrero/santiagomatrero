const { Model, DataTypes } = require("sequelize")
// const { DESCRIBE } = require("sequelize/types/query-types")
const sequelize = require("../db")

class Personal extends Model {}

Personal.init({
    nombre: DataTypes.STRING,
    apellido: DataTypes.STRING,
    puesto: DataTypes.STRING,
    sueldo: DataTypes.FLOAT,
    dierccion: DataTypes.STRING,
    mail: DataTypes.STRING,
    telefono: DataTypes.INTEGER,
    }, {
    sequelize,
    modelName: "personal",
    timestamps: false,
    freezeTableName: true
})


module.exports = Personal