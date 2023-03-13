import java.util.Scanner;

public abstract class First {
	
	int Accountno1,pinnumber1,accountnumber,pinnumber,withdraw,balance,choose,choice,deposit;
	Scanner scanner=new Scanner(System.in);
	First(int Accountno1,int pinnumber1)
	 {
		 this.Accountno1=Accountno1;
		 this.pinnumber1=pinnumber1;
	      
	 }
      
	 
	void Bankinformation()
		{   
		 
		    System.out.println("Enter the account number:");
			accountnumber=scanner.nextInt();
			System.out.println("Enter the  pinnumber:");
			pinnumber=scanner.nextInt();
		      if(accountnumber==Accountno1&&pinnumber==pinnumber1)
		      {
		    	  System.out.println("Your accountnumber and  pinnumber is correct ");
		      }
		      else
		      {
		    	  System.out.println("You entered number is incorrect");
		    	  }
}
}
public abstract class Second extends First{
	int deposit;
	Second(int Accountno1,int pinnumber1)
	{
		super(Accountno1,pinnumber1);
		
	}
	
	
	void Bankinformation(String str)
	{   System.out.println(str);
	    System.out.println("1.withdraw");
  	   System.out.println("2.Deposite");
  	   System.out.println("3.View Balance");
  	   System.out.println("4.Quit");
	}
	
	
}
public class AccountInformation extends Second{
	int i;
	AccountInformation(int Accountno1,int pinnumber1)
	{
		     super(Accountno1,pinnumber1 );
	}
    
    void Bankinformation(int balance)
	{  for(i=0;i<=3;i++) {
		System.out.println("Choose the operation you want to perform");
 	   choice=scanner.nextInt();
 	   switch(choice)
 	   {
 	   case 1:
 		   System.out.println("Enter money to be withdrawn: ");
 		   withdraw=scanner.nextInt();
 		   System.out.println("Please conform:");
 		   choose=scanner.nextInt();
 		   switch(choose)
 		   {
 		   case 1:
 			   System.out.println("Yes");
 			   break;
 		   case 2:
 			   System.out.println("No");
 			   break;
 		   }
 		  
 		   
 		   if(balance>=withdraw)
 		   {
 			   balance=balance-withdraw;
 			   System.out.println("please collect your money");
 			   System.out.println("Balance:"+balance);
 		   }
 		   else
 		   {
 			   System.out.println("Insufficient Balance"); 
 		   }
 		   System.out.println("");
            break;
 	   case 2:
 		   System.out.println("Enter amount you want to deposite");
 		   int deposit = scanner.nextInt();
 		   balance=balance+deposit;
 		   System.out.println("Your amount is successfully deposited");
 		   System.out.println("Balance:"+balance);
 		   System.out.println("");
 		   break;
 	   case 3:
 		   System.out.println("Balance:"+balance);
 		   System.out.println("");
 		   break;
 	   case 4:
 		   
 		  System.out.println("Thank you for banking with ramya bank");
 		   System.exit(0);
 		   break;
	
	}
	}
    
}
}
public  class AccountInformationmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccountInformation Account1=new AccountInformation(456782,2317);
	     Account1.Bankinformation();
         Account1.Bankinformation("Welcome to the bank");
         Account1.Bankinformation(100000);
         
	}

}


	
     
	






