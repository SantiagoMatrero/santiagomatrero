const { Model, DataTypes } = require("sequelize")
// const { DESCRIBE } = require("sequelize/types/query-types")
const sequelize = require("../db")

class Andarivel extends Model {}

Andarivel.init({

    }, {
    sequelize,
    modelName: "andarivel",
    timestamps: false,
    freezeTableName: true
})


module.exports = Andarivel