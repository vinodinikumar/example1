#include<stdio.h>
#include<math.h>
int main()
{
char str1[100],str2[100],i,cost=0,cost1=0;
scanf("%[^\n]s",str1);
scanf('\n%[^\n]s",str2);
int a[30]={0};
int b[30]={0};
int c1=strlen(str1);
int c2=strlen(str2);
int co=0,min;
for(i=0;str1[i];i++){
hh1[str[i]-97]++;
}
for(i=0;str2[i];i++)
{
hh2[str2[i]-97]++;
}
for(i=0;i<30;i++)
{
j+=abs(a[i]-b[i]);
}
if(c1!=c2)
{
if(j==abs(c1-c2)){
cost=+j*3;
cost=++j*3;
}
}
else
{
cost=((j/2)*3)+(j/2)*4);
cost1+=(co/2*5);
}
min=(cost<cost1)?cost:cost1;
printf("%d",min);
return 0;
 }
