import matplotlib.pyplot as plt1
import matplotlib.pyplot as plt2
import matplotlib.pyplot as plt3
import matplotlib.pyplot as plt4
import matplotlib.pyplot as plt5


import pandas as pd

df1 = pd.read_csv("./dnrpa-transferencias-autos-202204.csv",)
df1 = df1.loc[0:500]
x_values = df1['titular_domicilio_provincia'].unique()
y_values = df1['titular_domicilio_provincia'].value_counts().tolist()

# gráfico 1
# cual es la provincia donde se compran la mayor cantidad de autos?
plt1.bar(x_values, y_values)
plt1.title('Autos por provincia')
plt1.xlabel('Provincia')
plt1.ylabel('cantidad de autos')
plt1.show()

# grafico 2
# cuantos de esos autos son importados / locales

df2 = pd.read_csv("./dnrpa-transferencias-autos-202204.csv",)
df2 = df1.loc[0:500]
x_values = df2['automotor_origen'].unique()
y_values = df2['automotor_origen'].value_counts().tolist()

plt2.bar(x_values, y_values)
plt2.title('Autos por provincia')
plt2.xlabel('Origen')
plt2.ylabel('cantidad de autos')
plt2.show()


# grafico 3
# De que genero son los porpietarios?


df3 = pd.read_csv("./dnrpa-transferencias-autos-202204.csv",)
df3 = df1.loc[0:500]
x_values = df3['titular_genero'].unique()
y_values = df3['titular_genero'].value_counts().tolist()

plt3.bar(x_values, y_values)
plt3.title('Autos por genero')
plt3.xlabel('Genero')
plt3.ylabel('cantidad de autos')
plt3.show()


# grafico 4
# Cuanta cantidad hay de porcentajes?


df4 = pd.read_csv("./dnrpa-transferencias-autos-202204.csv",)
df4 = df1.loc[0:500]
x_values = df4['titular_porcentaje_titularidad'].unique()
y_values = df4['titular_porcentaje_titularidad'].value_counts().tolist()

plt4.bar(x_values, y_values)
plt4.title('Porcentaje de titularidad')
plt4.xlabel('Porcentaje')
plt4.ylabel('cantidad de autos')
plt4.show()


# grafico 5
# De que genero son los porpietarios?


df5 = pd.read_csv("./dnrpa-transferencias-autos-202204.csv",)
df5 = df1.loc[0:500]
x_values = df5['tramite_tipo'].unique()
y_values = df5['tramite_tipo'].value_counts().tolist()

plt5.bar(x_values, y_values)
plt5.title('Tipo de tramite')
plt5.xlabel('Tipo de tramite')
plt5.ylabel('cantidad de autos')
plt5.show()






