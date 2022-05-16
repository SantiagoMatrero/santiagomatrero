const express = require('express')
const app = express()
const fs = require('fs')


module.exports.jsonPeliculas = async (res) => {
    try{
        return JSON.parse(await fs.promises.readFile("./peliculas.json"))
    }
    catch (err) {
        res.send(err);
    }
}