
public class Fabinocci {
int a=0;
int b=1;
//Print Fabi numbers upto n
public void printFabinocci(int n) {
	if(n<0)
		System.out.println("Not valid");
	else if(n==0)
		System.out.print(a);
	else if(n==1)
		{System.out.print(a);
	    System.out.print(b);}
    else {   
	System.out.print(a);
	System.out.print(b);
	int c=a+b;
	while(c<=n) {
	System.out.print(c);
	a=b;
	b=c;
	c=a+b;}
	}
}
//print fabi numbers in between the range given
public void printFabinocci(int l,int r) {
	if(l<0||r<0||l>r)
		{System.out.print("Not Valid");}
    if(l==0) {
	System.out.print(a);
	System.out.print(b);}
	int c=a+b;
	while(c<=r) {
		if(c>=l) {
	System.out.print(c);}
	a=b;
	b=c;
	c=a+b;}
	}
}


