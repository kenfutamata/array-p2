public class cap{

private int limit; 
private int arr[]=new int[100]; 
private int max; 


public cap(int limit, int arr[]){
this.limit=limit; 
this.arr=arr; 
}

public int getLimit(){
return limit;
}

public void display(){
System.out.print("The elements of a array: ");
for(int i = 0; i <  getLimit(); i++){
System.out.print(" "+arr[i]); 
}

}

public void ascending(){
int temp; 
for(int i = 0; i <  getLimit(); i++){
for(int j = i+1; j <getLimit(); j++){
if(arr[i]>arr[j]){
temp=arr[i]; 
arr[i]=arr[j]; 
arr[j]=temp; 
}
}
}
System.out.printf("\nAscending order: "); 
for(int i = 0; i <  getLimit()-1; i++){
System.out.print(arr[i]+" ");
}
System.out.print(arr[getLimit()-1]); 
}

public void decending(){
int temp=0; 
for(int i = 0; i <= getLimit(); i++){
for(int j = i+1; j <=getLimit(); j++){
if(arr[i]<arr[j]){
temp=arr[i]; 
arr[i]=arr[j]; 
arr[j]=temp; 
}
}
}
System.out.printf("\nDecending order: "); 
for(int i = 0; i <=  getLimit()-1; i++){
System.out.print(arr[i]+" ");
}
 
}

public int sum(){
int sum=0; 
System.out.print("\nSum of all elements: ");
for(int i =0; i <getLimit(); i++){
sum=sum+arr[i]; 
} 
System.out.print(sum); 
return sum;
}

public double avg(){
double avg; 
avg=sum()/getLimit(); 
System.out.print("\nAverage of all elements: "+avg); 
return avg; 
}


public void even(){

int count=0; 
System.out.print("\nNumber of all even elements: "); 
for(int i = 0; i < getLimit(); i++){
if(arr[i]%2==0){
count++;

}
 
}
System.out.print(count); 
}

public void sumeven(){
int sum=0; 
for(int i = 0; i < getLimit(); i++){
if(arr[i]%2==0){
sum=sum+arr[i]; 
}
}
System.out.print("\nSum of all even elements: "+sum);
}

public void odd(){
int count=0; 
System.out.print("\nNumber of all odd elements: "); 
for(int i = 0; i < getLimit(); i++){
if(arr[i]%2!=0){
count++;

}
 
}
System.out.print(count); 
}


public int sumodd(){
int sum=0; 
for(int i = 0; i < getLimit(); i++){
if(arr[i]%2!=0){
sum=sum+arr[i]; 
}
}
System.out.print("\nSum of all odd elements: "+sum);
return sum; 
}


public void max(){

for(int i = 0; i < limit; i++){
if(arr[i]>=max){
max=arr[i];
} 
}
System.out.print("\nMaximum is: "+max); 

}

public void min(){
int min=arr[0];
for(int i = 0; i < limit; i++){
if(arr[i]<=min){
min=arr[i];
} 
}
System.out.print("\nMinimum is: "+min); 

}
public void secondmax(){
int temp; 
for(int i = 0; i <  getLimit(); i++){
for(int j = i+1; j <getLimit(); j++){
if(arr[i]>arr[j]){
temp=arr[i]; 
arr[i]=arr[j]; 
arr[j]=temp; 
}
}
}
System.out.printf("\n2nd Maximum element: "); 

System.out.print(arr[getLimit()-2]); 
}

public void secondmin(){
int temp; 
for(int i = 0; i <  getLimit(); i++){
for(int j = i+1; j <getLimit(); j++){
if(arr[i]>arr[j]){
temp=arr[i]; 
arr[i]=arr[j]; 
arr[j]=temp; 
}
}
}
System.out.printf("\n2nd Minimum element: "); 

System.out.print(arr[getLimit()-4]); 


}


}


