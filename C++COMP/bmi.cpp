#include <iostream>
using namespace std;

int main() {


	double height, weight, bmi;
      

      cout << "Type your height in meters: " << endl;
      cin >> height;


     cout << "Type your wieght: " << endl;
     cin >> weight;
     
     bmi = weight/(height * height); 
 
      cout << "Your BMI is " << bmi << "\n";
     
   

       
     return 0;

}
