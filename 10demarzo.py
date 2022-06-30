1-

lista=[]
for i in range(1001):
    lista.append(i)
print(lista)

2-

lista=[]
for i in range(1001):
    lista.append(i)
    if(i%2):
        lista.remove(i)
print(lista)}

3-

set={"Agustin"}
for i in range(3):
    nombre=str(input("Ingrese un nombre"))
    set.add(nombre)
    
print(set)

4-

set={"Agustin"}
for i in range(3):
    nombre=str(input("Ingrese un nombre"))
    set.add(nombre)
    if nombre[0]=="a":
        set.remove(nombre)
    
print(set)

5-

diccionario={"Mateo":18,"Agustin":19}
print(diccionario)

6- 

diccionario={"Mateo":18,"Agustin":19}

for clave in diccionario.keys():
    diccionario[clave]= diccionario[clave]*2
print(diccionario)