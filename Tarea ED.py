'''Alumna: Rojas Estrada Ingrid Amayranee
   EDD 1310'''

#Importamos nuestros modulos
import numpy as np  
import pandas as pd

#Leer el archivo csv
df = pd.read_csv('C:\\Users\\IngridAmayranee\\Documents\\ICO\\Ingrid ICO FES ARAGON\\presenciaredes.csv')

#Imprimir el archivo 
print(df)

#Lo convertimos en un arrayBidimensional
l = np.asarray(df) 

#Diferencia de seguidores de twitter entre enero y junio
def diferenciaSeguidores():
    enero = int(l[7][3])
    junio = int(l[7][8])
    resul = enero-junio
    diferencia = np.abs(resul)
    print(f"\nDiferencia entre enero y junio de seguidores es: {diferencia} seguidores")

diferenciaSeguidores()

#Diferencia de vistas en Youtube
#El deberá elegir 2 meses para conocer  la diferencia entre ambos
def diferenciaVistasYoutube():
    e = int(l[15][3])
    f = int(l[15][4])
    c = int(l[15][5])
    a = int(l[15][6])
    b = int(l[15][7])
    d = int(l[15][8])
    
    opcion1 = input("\nOprima la tecla del primer mes por letra como se indica: e-Enero, f-Febrero, c-Marzo, a-Abril, b-Mayo, d-Junio: ")
    opcion2 = input("Oprima la tecla del segundo mes por numero como se indica: e-Enero, f-Febrero, c-Marzo, a-Abril, b-Mayo, d-Junio: ")
    import math
    
    if opcionUno == "e":
        opcionUno = e
        mesUno = "Enero"
    elif opcionUno == "f":
        opcionUno = f
        mesUno = "Febrero"
    elif opcionUno == "c":
        opcionUno = c
        mesUno = "Marzo"
    elif opcionUno == "a":
        opcionUno = a
        mesUno = "Abril"
    elif opcionUno == "b":
        opcionUno = b
        mesUno = "Mayo"
    elif opcionUno == "d":
        opcionUno = d
        mesUno = "Junio"
        
    if opcionDos == "e":
        opcionDos = e
        mes2 = "Enero"
    elif opcionDos == "f":
        opcionDos = f
        mesDos = "Febrero"
    elif opcionDos == "c":
        opcionDos = c
        mesDos = "Marzo"
    elif opcionDos == "a":
        opcionDos = a
        mesDos = "Abril"
    elif opcionDos == "b":
        opcionDos = b
        mesDos = "Mayo"
    elif opcionDos == "d":
        opcionDos = d 
        mesDos = "Junio" 
 
    resultado = opcionUno-opcionDos
    difVistas = np.abs(resultado)
    print(f"\nLa diferencia de vistas entre {mesUno} y {mesDos} es de: {difVistas}")
    
diferenciaVistasYoutube()
    
#Media de crecimiento de facebook y twitter 
def mediaCrecimientoFyT():
    mesesTw = int(l[8][3])+int(l[8][4])+int(l[8][5])+int(l[8][6])+int(l[8][7])+int(l[8][8])
    mediaTw = mesesTw/6
    print(f"\nLa media de crecimiento de Twitter es de: {mediaTw}")
    
    mesesFb = int(l[1][3])+int(l[1][4])+int(l[1][5])+int(l[1][6])+int(l[1][7])+int(l[1][8])
    mediaFb = mesesFb/6
    print(f"La media de crecimiento de Facebook es de: {mediaFb}")
    
mediaCrecimientoFyT()    