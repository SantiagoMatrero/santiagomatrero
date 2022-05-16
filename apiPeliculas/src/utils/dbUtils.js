const mongoose = require("mongoose");
const config = require("config")

// Connection URI
const uri = config.get("mongodbUri")

module.exports.connectToDB = function (suffix = "", params = {}) {
    return mongoose.connect(`${uri}-${suffix}`, params);
}

module.exports.disconnectDB = function () {
    mongoose.disconnect()
}


