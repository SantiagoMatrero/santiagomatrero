const mongoose = require("mongoose");
const config = require("config")

// Connection URI
const uri = config.get("mongodbUri")

module.exports.connectToDB = function () {
    return mongoose.connect(uri);
}



