const { Sequelize } = require('sequelize')
const { database } = require('../config')

const sequelize = new Sequelize(
    database.database,
    database.username,
    database.password, {
        host: "localhost",
        dialect: "mysql"
    }
) 

module.exports = sequelize