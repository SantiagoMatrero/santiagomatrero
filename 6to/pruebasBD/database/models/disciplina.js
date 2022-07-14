const { Model, DataTypes } = require("sequelize")
// const { DESCRIBE } = require("sequelize/types/query-types")
const sequelize = require("../db")

class Disciplina extends Model {}

Disciplina.init({
    nombre: DataTypes.STRING,
    precio: DataTypes.FLOAT
    }, {
    sequelize,
    modelName: "disciplina",
    timestamps: false,
    freezeTableName: true
})


module.exports = Disciplina