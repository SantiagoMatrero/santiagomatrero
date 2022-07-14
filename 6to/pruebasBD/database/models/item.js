const { Model, DataTypes } = require("sequelize")
// const { DESCRIBE } = require("sequelize/types/query-types")
const sequelize = require("../db")

class Item extends Model {}

Item.init({
    membresia: DataTypes.BOOLEAN,
    }, {
    sequelize,
    modelName: "item",
    timestamps: false,
    freezeTableName: true
})


module.exports = Item