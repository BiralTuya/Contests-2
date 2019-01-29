import java.util.Scanner;
import java.io.*;
class cgpa{
	public static double ans=0;
	double count(double grade){
		this.ans+=(grade*3);
		return ans;
	}
	double countlab(double grade){
		this.ans+=grade;
		return ans;
	}

	public static void main(String[] args){
		int a=0,credit=0;
		double b=0,p=0;
		Scanner s=new Scanner(System.in);
		cgpa ob=new cgpa();
		int i;
		for(i=0;;i++){
			System.out.println("What do you want to add?");
			System.out.println("1: Theory 2: Lab 0: None");
			a=s.nextInt();
			if(a==0) break;
			if(a==1){
				System.out.println("Enter your grade in point: ");
				b=s.nextDouble();
				ob.count(b);
				credit+=3;
			}
			if(a==2){
				System.out.println("Enter your grade in point: ");
				b=s.nextDouble();
				ob.countlab(b);
				credit+=1;
			}
		}
		p=ans/credit;
		System.out.print("Your CGPA is: ");
		System.out.printf("%.2f",p);
	}

}