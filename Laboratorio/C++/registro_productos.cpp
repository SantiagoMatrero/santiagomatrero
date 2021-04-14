using namespace std;
#include<iostream>
#include<vector>


int main(){

    vector <int> precio;
    vector <string> producto;

    int a = 1;

    while (a==1)
    {
        cout << "Inicia el regostro del producto" << endl << endl << "Ingrese primero el nombre del producto y despues el precio del mismo";
        string nombredelproducto;
        cin >> nombredelproducto;
        int preciodelproducto = 0;
        cin >> preciodelproducto;
        int precioparcial = 0;
        producto.push_back(nombredelproducto);
        precio.push_back(preciodelproducto);
        cout << endl << "Estos son los productos registrados hasta el momento: " << endl << endl;
        for (int i = 0; i < producto.size(); i++)
        {
            cout << producto[i] << " ----------- " << precio[i] << endl << endl;
            precioparcial=precioparcial+precio[i];
        }
        cout << "El importe parcial a pagar es de " << precioparcial << endl << endl << "Quiere hacer otro regostro?" << endl << endl << "Presione 1 para si o 2 para no" << endl << endl;
        cin >> a;
    }

    int totalapagar = 0;

    for (int i = 0; i < precio.size(); i++)
    {
        totalapagar = totalapagar + precio[i];
    }
    
    cout << "El total a pagar es " << totalapagar << endl << endl;
    
}