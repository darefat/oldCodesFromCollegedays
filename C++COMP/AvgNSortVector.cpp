#include<iostream>
#include<algorithm>
#include<vector>
using namespace std;

int main(){
  
   vector<double>temps; //declare vector 
     cout<< "enter variables and exit with any key other than double: "<< '\n';
   for(double value;cin>>value;)// read values into temp value
   	temps.push_back(value);  // put item into vector


         // compute mean temp
     double sum =0;
     for(int x : temps) sum+=x;
                     // sum+=x;  // for every x in temps add sum to x;
       		 cout<<"Average temperature: "<< sum/temps.size()<<'\n';

// note the .size() is equivalent to length in array 
// to get the last element in vector we use v[v.size()-1]
// if v.size==0 the vector is empty 
       
        //compute median temperature 
        
// sort(temps); // sort temperatures
         cout<<"Median temperature: "<<temps[temps.size()/2]<<'\n'; 





           // the logic behind this is 
           // temps.size()-1 gives us last element therefore temps.size()/2 will give us the average. 



}
