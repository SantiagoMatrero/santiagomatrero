const { Model, DataTypes } = require("sequelize")
// const { DESCRIBE } = require("sequelize/types/query-types")
const sequelize = require("../db")

class Socio extends Model {}

Socio.init({
    dni : DataTypes.INTEGER,
    nombre: DataTypes.STRING,
    apellido: DataTypes.STRING,
    edad: DataTypes.INTEGER,
    mail: DataTypes.STRING,
    membresia: DataTypes.BOOLEAN,
    telefono: DataTypes.INTEGER,
    certificadoMedico: DataTypes.DATEONLY
    }, {
    sequelize,
    modelName: "socio",
    timestamps: false,
    freezeTableName: true
})


module.exports = Socio