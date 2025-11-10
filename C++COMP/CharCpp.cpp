#include<iostream>
using namespace std;

int main() {

	 char i = char('a');
         int j = 97;

         while((i <= char('z')) && (j <= 122)) { // if this is true next line will run

             cout << i << '\t' << j << '\n'; 
               i++; // end loop for the char part
               j++; // end loop for the int part 
         
   }

}
