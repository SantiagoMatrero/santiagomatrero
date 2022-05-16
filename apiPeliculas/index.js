const app  = require("./app.js")
const PORT = 3001

async function main(){
    await app.listen(PORT)
    console.log(`Server running on port ${PORT}`)
}

main()