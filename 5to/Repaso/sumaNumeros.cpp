#include <iostream>
#include <vector>
using namespace std;

int sumaNumeros(int a, int b){
    int resultados=a+b;
    cout <<"El resultado es : ";
    return resultado;
}

int main(){
    int a,b;
    cout <<"Ingrese 2 Numeros: "<< "\n" << "\n";
    cin >> a;
    cin >> b;
    cout <<endl<<endl;
    cout <<sumaNumeros(a,b);
    cout << "\n" << "\n";
}