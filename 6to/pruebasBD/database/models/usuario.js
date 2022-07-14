const { Model, DataTypes } = require("sequelize")
// const { DESCRIBE } = require("sequelize/types/query-types")
const sequelize = require("../db")

class Usuario extends Model {}

Usuario.init({
    password: DataTypes.STRING,
    mail: DataTypes.STRING
    }, {
    sequelize,
    modelName: "usuario",
    timestamps: false,
    freezeTableName: true
})


module.exports = Usuario