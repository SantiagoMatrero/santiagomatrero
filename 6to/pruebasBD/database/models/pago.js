const { Model, DataTypes } = require("sequelize")
// const { DESCRIBE } = require("sequelize/types/query-types")
const sequelize = require("../db")

class Pago extends Model {}

Pago.init({
    montoTotal: DataTypes.INTEGER,
    fechaDePago: DataTypes.DATEONLY,
    }, {
    sequelize,
    modelName: "pago",
    timestamps: false,
    freezeTableName: true
})


module.exports = Pago