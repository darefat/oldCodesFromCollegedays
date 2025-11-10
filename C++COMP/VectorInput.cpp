#include<iostream>
#include<vector> 

using namespace std;

int main() {
         
       
      vector<double>temps; // declare a temp vector 
         cout<<"Please enter your variables and press anything other than double to terminate" << endl;
      for(double temp;cin>>temp;) //declare a variable temp and read into temp
      	 temps.push_back(temp);  // put temp in queue into vector temp
/**
   this code can also be written with a while loop like this 
   
   double temp;
     
       while(cin>>temp) // so far this is true do the next line 
          temps.push_back(temp); // note the difference between temps and temp
         

**/            
  

}
