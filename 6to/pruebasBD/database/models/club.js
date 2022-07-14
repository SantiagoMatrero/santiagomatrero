const { Model, DataTypes } = require("sequelize")
const sequelize = require('../db')

class Club extends Model {}
Club.init({
	id: {
		allowNull: false,
		autoIncrement: true,
		primaryKey: true,
		type: DataTypes.INTEGER
	},
	nombre: {
		allowNull: false,
		type: DataTypes.STRING
	}
},{
	sequelize,
	modelName : "club",
    freezeTableName: true
}
)

module.exports = Club
