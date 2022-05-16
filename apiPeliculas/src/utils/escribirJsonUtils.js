const express = require('express')
const app = express()
const fs = require('fs')

module.exports.escribirJson = async(res, jsonString) => {
    try {
        await fs.promises.writeFile("./peliculas.json", jsonString)
        res.status(202).send();
    }
    catch (err) {
        res.status(500).send();
    }
}