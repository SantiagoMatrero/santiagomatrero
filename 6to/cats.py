import requests


if __name__ == '__main__':

    archivo = open("hola.csv", "w")
    nombres_columnas = "fact , length \n"
    archivo.write(nombres_columnas)
    archivo.close()
    
    for i in range(10):
        respuesta = requests.get('https://catfact.ninja/fact')
        respuesta.status_code
        informacion = respuesta.json()
        fact = informacion["fact"]
        length = str(informacion["length"])

        linea = fact + "," + length + "\n"

        archivo = open("hola.csv", "a")
        archivo.write(linea)
        archivo.close()