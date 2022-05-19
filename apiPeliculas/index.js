const app  = require("./app.js")
const mongoose = require("mongoose")

const mongoURI = process.env.MONGO_URI ||
    "mongodb://localhost:27017/peliculas"

const PORT = 3001


mongoose.connect(mongoURI, {useUnifiedTopology:true})
        .then(() => {app.listen(PORT, () => {
            console.log('Corriendo en port', {PORT})
            console.log(mongoose.connection.readyState);
        })
    })
    .catch(err=> {console.log(err);
    });