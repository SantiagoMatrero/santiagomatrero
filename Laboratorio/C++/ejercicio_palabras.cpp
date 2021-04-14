using namespace std;
#include<iostream>
#include<vector>



int main(){

    vector<string> palabras;
    for (int 1 = 0; i < 6; ++i){
        string palabra;
        cin >> palabra;
        palabras.push_back(palabra);
    }

    for (int i = 0; i < palabras.size(); i++)
    {
        if(i%2==0){
            cout << palabras[i] << " ";
        }
    }

    cout << " - ";

    for (int  i = 0; i < palabras.size(); i++)
    {
        if (i%2=!0)
        {
            cout << palabras[i] << " ";
        }
        
    }
    
    
}