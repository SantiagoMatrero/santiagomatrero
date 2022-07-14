const { Model, DataTypes } = require("sequelize")
// const { DESCRIBE } = require("sequelize/types/query-types")
const sequelize = require("../db")

class ClaseAndarivel extends Model {}

ClaseAndarivel.init({
    horario: DataTypes.DATE
    }, {
    sequelize,
    modelName: "claseAndarivel",
    timestamps: false,
    freezeTableName: true
})


module.exports = ClaseAndarivel