import java.util.*;

class Open_new_acc{
    Scanner sc=new Scanner(System.in);
    static String full_name; // Holder name
    String Nominee;
    Long gov_id;
    String Add;
    String Email;
    long con; // contact number
    static int th=1; // transaction history counter
    static long Acc_num;
    int di;
    static String password; // Login password
    static long tra_password; // Transaction pin
    static long cur_bal;
    static long cash[]=new long[10000]; // To store all transactions for history
    static String dat[]=new String[10000];// All Transaction dates
    static String act[]=new String[10000]; // All transaction actions
    static long atm_pin;
    static long limit; // Atm withdraw limit
    static String ATM="NO";
    static String Online="NO";
    static long DN; // Atm last 4 digits
    static String S="XXXXXXXX";
    static int ca;
    void getter() {
        System.out.println("-----------------------------------------------------------------------------------------------");
        System.out.println("                                      ( Fill the Details )                                    \n");
        System.out.print("                              ENTER YOUR FULL NAME             :");
        this.full_name=sc.nextLine();
        System.out.print("                              ENTER YOUR Nominee's NAME        :");
        this.Nominee=sc.nextLine();
        System.out.print("                              ENTER YOUR Aadhar number  :");
        this.gov_id=sc.nextLong();
        System.out.print("                              ENTER YOUR ADDRESS               :");
        this.Add=sc.nextLine();
        sc.nextLine();
        System.out.print("                              ENTER YOUR EMAIL ID              :");
        this.Email=sc.nextLine();
        System.out.print("                              ENTER YOUR MOBILE NUMBER         :");
        this.con=sc.nextLong();
        System.out.println("\n                --> We've sent an OTP for Mobile Verification " + con + " <--");
        int max=8999;
        Random rand=new Random(); // Random OTP number
        int a=rand.nextInt(max)+1000;
        sleep(2000); // Pause Time for 2 sec..
        int tr = 1;
        System.out.println("                                                                                        -------------");
        System.out.println("                                                                                        |Message box|");
        System.out.println("                                                                                        |   "+a+"    |  ");
        System.out.println("                                                                                        -------------");

        System.out.print("                              ENTER OTP NUMBER YOU'VE RECEIVED  :");
        di=sc.nextInt();
        while(tr<3 && di!=a) {
            System.out.println("                            ....YOUR OTP IS WRONG,PLEASE TAKE ANOTHER TRY....");
            a=rand.nextInt(max)+1000;
            sleep(2000);
            tr++;
            System.out.println("                                                                                        -------------");
            System.out.println("                                                                                        |Message box|");
            System.out.println("                                                                                        |   "+a+"    |  ");
            System.out.println("                                                                                        -------------");

            System.out.print("                              ENTER OTP NUMBER WHAT YOU RECEIVE  :");
            di=sc.nextInt();
        }

        if(di==a){

            System.out.println("\n                     ...Mr."+full_name+" Your Mobile number has been verified...");
            System.out.println("                     ...Congratulations your account has been created successfully....");
            long ma=899999999;
            Random ra=new Random();
            long acc = ra.nextInt(max)+1000000000;
            Acc_num = acc;
            System.out.println("                     ...Your unique account number is created...");
            System.out.println("                     ...Your Account number : "+Acc_num);
            System.out.println("                     ...Thank you for banking with us...");
            System.out.print("\n                     ...Please Set Login Password for security purpose :");
            sc.nextLine();
            password=sc.nextLine();
            System.out.print("                     ...Please Set Transaction Pin for Future Transactions :");
            tra_password=sc.nextLong();
            System.out.println("                     ...Please don't share your Passwords with anyone...");
        }
        else{

            System.out.println("\n                    ....Please try some time later..... ");
        }
        System.out.println("\n                             -->   Back to login page   <--");

         
    }
   

    public static void sleep(int  time) {
        try {
            Thread.sleep(time);
        } catch (Exception e) {
        }

    }

} // To open new account
class Help extends Open_new_acc{
    Help(){
        System.out.println("-----------------------------------------------------------------------------------------------");
        System.out.println("Home / Help -->");
        System.out.println(" Mr."+full_name+"......");
        System.out.println("                    ......Please visit our Website WWW.BONWORLD.COM for help.......");
        System.out.println("                            .............. 24 x 7 ...............");
        System.out.println("                              Toll free number : 1800 258 4455");
        System.out.println("                              Toll free number : 1800 102 4455");
        System.out.println("                                ........ Thank You.........");
        System.out.println("-----------------------------------------------------------------------------------------------");
    }
}// To display all details of bank
class Login extends  Open_new_acc{
    Login(){
        super();
    }
    long phon;
    String pass;
    Scanner sc = new Scanner(System.in);
    void login() {
        System.out.println("-----------------------------------------------------------------------------------------------");
        System.out.println("Home / Login -->");
        System.out.print("                                  Enter your Mobile number       :");
        phon=sc.nextLong();
        System.out.print("                                  Enter Your Login Password      :");
        sc.nextLine();
        pass=sc.nextLine();
        System.out.println("-----------------------------------------------------------------------------------------------");
        if(pass.equals(password) && con==phon){
            int ch=0;
            while(ch!=5){

                System.out.println("-----------------------------------------------------------------------------------------------");
                System.out.println("| Home / Login -->                                                                            |");
                System.out.println("|                                                                                             |");
                System.out.println("|                            (1) Account Section                                              |");
                System.out.println("|                            (2) Save Section                                                 |");
                System.out.println("|                            (3) Loan Section                                               |");
                System.out.println("|                            (4) Card Section                                                 |");
                System.out.println("|                            (5) Logout                                                       |");
                System.out.println("|                                                                                             |");
                System.out.println("|                                                                                             |");
                System.out.println("-----------------------------------------------------------------------------------------------");
                System.out.print("ENTER YOUR DESIRE CHOICE ---->");
                ch = sc.nextInt();
               switch(ch){
                   case 1:
                     Account a=new Account();
                     break;
                   case 2:
                     save b=new save();
                     break;
                   case 3:
                     Loan c=new Loan();
                     c.Loan1();
                     break;
                   case 4:
                     int cho=0;
                     long DN;
                     String S="xxxxxxxx";
                     while(cho!=4){
                     System.out.println("-----------------------------------------------------------------------------------------------");
                     System.out.println("| Home / Login / Card Section --->                                                            |");
                     System.out.println("|                                                                                             |");
                     System.out.println("|                            (1) Debit Card Request                                           |");
                     System.out.println("|                            (2) Manage Debit Card                                            |");
                     System.out.println("|                            (3) View Debit Card                                              |");
                     System.out.println("|                                                                                             |");
                     System.out.println("|  <---(4) back                                                                               |");   
                     System.out.println("-----------------------------------------------------------------------------------------------");
                     System.out.print("Enter your Desire Choice --->");
                     cho=sc.nextInt();
                      switch (cho) {
                       case 1:
                           Debit_request o=new Debit_request();
                           o.Action();
                           break;
                       case 2:
                           Manage_debit ob =new Manage_debit() ; 
                           ob.Action(); 
                           break;
                       case 3:
                            View_Card obj=new View_Card();
                            obj.Action();
                           break;
                      }
                    }
                    break;
                }
                   
            }
              
              
        }

        
        else 
        {
            System.out.println("                               ** Press 1 for 'FORGOT PASSWORD' **");
            int num,b;
            int otp,ma=9999;
            System.out.print("Enter :");
            num=sc.nextInt();
            if(num==1){
                System.out.print("                                  Enter your Mobile number       :");
                phon=sc.nextLong();
                Random rand=new Random();
                b=rand.nextInt(ma)+1000;
                sleep(2000);
                System.out.println("                                                                                        -------------");
                System.out.println("                                                                                        |Message box|");
                System.out.println("                                                                                        |   "+b+"    |  ");
                System.out.println("                                                                                        -------------");

                System.out.print("                              ENTER OTP NUMBER WHAT YOU RECEIVE  :");
                otp=sc.nextInt();
                if(b==otp) {
                    System.out.println(" ....Your OTP has been verified..... ");
                }
                System.out.print("\n                            Enter Your New Login Password      :");
                sc.nextLine();
                pass=sc.nextLine();
                password=pass;
                   System.out.println("\n ....Your password has been changed.... ");
            }
        } 
    }

    
    static void Transaction_history(){
        System.out.println("-----------------------------------------------------------------------------------------------");
        System.out.println("\tCash amount\t\t\tDate\t\t\t\tAction\t");
        int gr=th;
        while((gr-1)>0){
        System.out.println("\tINR "+cash[gr-1]+"\t\t\t"+dat[gr-1]+"\t\t\t"+act[gr-1]);
        gr--;
        }
        System.out.println("-----------------------------------------------------------------------------------------------");
    }
}//

class Account extends Login {
    Scanner sc=new Scanner(System.in);
    long n; // Amount to be deposited
    int ta; // To verify transaction pin
    String date; // Transaction Date
    int ty=0; // loop variable
    int l=0;{
    while(l!=5){

        System.out.println("-----------------------------------------------------------------------------------------------");
        System.out.println("| Home / Login / Account Section -->                                                          |");
        System.out.println("|                                                                                             |");
        System.out.println("|                            (1) View  Balance                                                |");
        System.out.println("|                            (2) Deposit cash                                                 |");
        System.out.println("|                            (3) Withdraw cash                                                |");
        System.out.println("|                            (4) Transaction History                                          |");
        System.out.println("|                                                                                             |");
        System.out.println("|  <---(5) back                                                                               |");
        System.out.println("-----------------------------------------------------------------------------------------------");
        int t;
        System.out.print("Enter your Desire Choice ------->");
        t=sc.nextInt();
        switch(t) {
            case 1:
            System.out.println("-----------------------------------------------------------------------------------------------");
            System.out.println(" Home / Login / Account Section / View Balance -->                                             ");
            System.out.println("                                                                                               ");
            System.out.println("   Account number :"+Acc_num);
            System.out.println("                                                                                               ");
            System.out.println("                         YOUR CURRENT BALANCE :"+cur_bal +" INR");
            System.out.println("-----------------------------------------------------------------------------------------------");
                break;
            case 2:
                this.Deposite();
                break;
            case 3:
                this.withdraw();
                break;
            case 4:
                Transaction_history();
                break;
        }
        l=t;
    }
}
    void Deposite(){
        ty=0;
        while(ty!=2){
            System.out.println("-----------------------------------------------------------------------------------------------");
            System.out.println("| Home / Login / Account Section / Deposite Cash -->    ");
            System.out.println("                                                                                               ");
            System.out.print("   Account number :"+Acc_num+"                               Date:");
            sc.nextLine();
            date=sc.nextLine();
            System.out.println("                                                                                               ");
            System.out.print("                          Enter Amount of Cash  :");
            n=sc.nextLong();
            System.out.print("                          Enter Transaction pin :");
            ta=sc.nextInt();
            System.out.println("-----------------------------------------------------------------------------------------------");
                  if(ta==tra_password) {
                  System.out.println( "\n"+n+" Rupees Deposited in account succesfully....\n");
                  cur_bal+=n;
                  break;
                  }
                  else {
                  System.out.println("\nYour inserted transaction pin is not correct, please take another try..\n");
                  ty++;
                  } 
            }
           
            if(ty==2){
                System.out.println("\nSorry, We can't proccess ahead...\n");
            }
            cash[th]=n;
            dat[th]=date;
            act[th]="Deposited";
            th++;
              
        }

    void withdraw(){
        ty=0;
        while(ty!=2){
            System.out.println("-----------------------------------------------------------------------------------------------");
            System.out.println("| Home / Login / Account Section / Withdraw Cash -->    ");
            System.out.println("                                                                                               ");
            System.out.print("   Account number :"+Acc_num+"                               Date:");
            sc.nextLine();
            date=sc.nextLine();
            System.out.println("                                                                                               ");
            System.out.print("                          Enter Amount of Cash  :");
            n=sc.nextLong();
            System.out.print("                          Enter Transaction pin :");
            ta=sc.nextInt();
            System.out.println("-----------------------------------------------------------------------------------------------");

            if(ta==tra_password && n<cur_bal) {
            System.out.println( "\n"+n+" Rupees Withdrawed from your account succesfully....\n");
            cur_bal-=n;
            break;
            }
            else if(ta!=tra_password) {
            System.out.println("\nYour inserted transaction pin is not correct, please take another try..\n");
            ty++;
            }
            else if(n>cur_bal) {
            System.out.println("You can`t withdraw your account has no enough ammount");
            break;
            }
    
        }
    
        if(ty==2){
            System.out.println("\nSorry, We can't proccess ahead...\n");
        }
        cash[th]=n;
        dat[th]=date;
        act[th]="Withdrawed";
        th++;
          
    }
   

}
class save extends Login{
   save(){
    int flag=0;
    while(flag!=3){
    System.out.println("-----------------------------------------------------------------------------------------------");
    System.out.println(" Home / Login / Save Section -->\n");
    System.out.println("                                  (1) FD Account  ");
    System.out.println("                                  (2) Deposit Calculator\n");
    System.out.println("  <---(3) Back ");
    System.out.println("-----------------------------------------------------------------------------------------------");
    System.out.print("Enter your Desire Choice ------->");
    int choice;
    choice=sc.nextInt();
 
   switch(choice){
        case 1:
        this.FD();
        break;
 
        case 2:
        this.calculator();
        break;
 
        case 3:
        break;
     } 
     flag=choice;
   }
  }

   void FD(){
    String st;
    int fdbal;
    System.out.println("-----------------------------------------------------------------------------------------------");
    System.out.println(" Home / Login / Save Section / FD account -->\n");
    System.out.print("                                                               Date :");
    sc.nextLine();
    st=sc.nextLine();
    System.out.println("\n\tAccount Number :"+Acc_num+"\t\t"+"Available Balance :"+cur_bal+"\n");
     System.out.println("                            Differnt Schemes given below");
     System.out.println("                   (1) Fixed Deposite at interest rate 4.7% for 1 year ");
     System.out.println("                   (2) Fixed Deposite at interest rate 5.7% for 3 year ");
     System.out.println("                   (3) Fixed Deposite at interest rate 6.2% for 7 year ");
     System.out.println("-----------------------------------------------------------------------------------------------");
     System.out.print("Enter your Desire scheme --->");
     int ch=sc.nextInt();
     System.out.print("\nEnter Amount you want to add :");
     fdbal=sc.nextInt();
     cur_bal-=fdbal;
     float fd;
    switch(ch){
        case 1:
         fd=(float) ((fdbal*(4.7))/100)+fdbal;
        System.out.println("\n...You will get INR "+fd+" After 1 year...\n" );
        break;
        case 2:
        fd=(float) ((fdbal*(5.7)*(3))/100)+fdbal;
        System.out.println("\n...You will get "+fd+"After 3 year..\n." );
        break;
        case 3:        
        fd=(float) ((fdbal*(6.3)*(7))/100)+fdbal;
        System.out.println("\n...You will get "+fd+"After 7 year...\n" );
        break;
    }
     System.out.println("....You have successfully opened Fixed Deposite....");
        cash[th]=fdbal;
        dat[th]=st;
        act[th]="    FD";
        th++;
   }

   void calculator() {
       System.out.println("-----------------------------------------------------------------------------------------------");
       System.out.println(" Home / Login / Save Section / Deposit Calculator -->\n");
       System.out.print("\t\tEnter the Amount of Fixed Deposite           :");
       int principle=sc.nextInt();
       System.out.print("\t\tEnter the Rate of Fixed Deposite             :");
       float rate=sc.nextFloat();
       System.out.print("\t\tEnter the Duration of Fixed Deposite in year :");
       int duration=sc.nextInt();
       float amount=((principle*(rate)*(duration))/100)+principle;
       System.out.println("\n.....Your Fixed Deposite amount after "+duration+" year is "+amount+".....\n");
       System.out.println("-----------------------------------------------------------------------------------------------");
   }  
}
abstract class Card extends Login {
  abstract void Action();
}
class Debit_request extends Card{

void Action(){
    System.out.println("-----------------------------------------------------------------------------------------------");
    System.out.println(" Home / Login / Card Section / Debit Card Request -->                                          ");
    System.out.println("\n\tAccount Number :"+Acc_num);
    System.out.println("");
    System.out.println("                              CHOOSE YOUR DESIRE CARD TYPE");
    System.out.println("                                     (1) Standard ");
    System.out.println("                                     (2) Premium ");
    System.out.println(" <-- (3) Back");
    System.out.println("-----------------------------------------------------------------------------------------------");
    System.out.print("Enter your Desire Choice --->");
    int choi;
    choi=sc.nextInt();
    int number;
    Random rand=new Random();
    DN=rand.nextLong(9999)+1000;
    S=S+DN;
    System.out.print("\n...Enter Transaction Pin -->");
    number=sc.nextInt();
   
    sleep(5000);
    switch(choi){
        case 1:
        ca=1;
        System.out.println("                                  *** YOUR DEBIT CARD ***");
        System.out.println("                        ==============================================");
        System.out.println("                        |                  * BON *                   |");
        System.out.println("                        |                                 STANDARD   |");
        System.out.println("                        | "+S+"                                    ");
        System.out.println("                        | "+full_name);
        System.out.println("                        | valid from : 11/22  valid thru : 11/27     |" );
        System.out.println("                        |                                            |");
        System.out.println("                        |                                  RUPAY ->  |");
        System.out.println("                        |                  CVV : 767                 |");
        System.out.println("                        =============================================="); 
        System.out.println("                           ATM :" + ATM+" ONLINE :"+Online);
        break;  
        case 2:
        ca=2;
        System.out.println("                                  *** YOUR DEBIT CARD ***");
        System.out.println("                        ==============================================");
        System.out.println("                        |                                 PREMIUM    |");
        System.out.println("                        | "+S+"                                  ");
        System.out.println("                        | "+full_name);
        System.out.println("                        | valid from : 11/22  valid thru : 11/26     |" );
        System.out.println("                        |                                            |");
        System.out.println("                        |                                  RUPAY ->  |");
        System.out.println("                        |                  CVV : 767                 |");
        System.out.println("                        ==============================================");
        System.out.println("                           ATM :" + ATM+" ONLINE :"+Online);
        break;
        case 3:
        break;

   }
}
}
class Manage_debit extends Debit_request{
    String atm; //
    String online;

    void Action(){
        System.out.println("-----------------------------------------------------------------------------------------------");
        System.out.println(" Home / Login / Card Section / Manage Debit card -->                                          ");
        System.out.println("\n\tAccount Number :"+Acc_num);
        System.out.println("");
        System.out.println("                                 ** CHOOSE FUNCTIONS ** ");
        System.out.println("                                     (1) SET LIMIT");
        System.out.println("                                     (2) SET ATM PIN");
        System.out.println("                                     (3) MANAGE CHANNEL");
        System.out.println("<-- (4) Back");
        System.out.println("-----------------------------------------------------------------------------------------------");
        System.out.print("Enter your Desire Choice --->");
        int choi;
        choi=sc.nextInt();
        int number;
        System.out.print("\n...Enter Transaction Pin -->");
        number=sc.nextInt();

        switch (choi) {
            case 1: 
                System.out.println("-----------------------------------------------------------------------------------------------");
                System.out.println(" Home / Login / Card Section / Manage Debit card / SET LIMIT-->                                ");
                System.out.print("....Please set limit for your ATM card : ");
                limit = sc.nextLong();
                System.out.println("-----------------------------------------------------------------------------------------------");
                break;

            case 2:
                System.out.println("-----------------------------------------------------------------------------------------------");
                System.out.println(" Home / Login / Card Section / Manage Debit card / SET ATM PIN-->                                ");
                System.out.print("....Please set ATM PIN for your ATM card : ");
                atm_pin=sc.nextLong();
                System.out.println("-----------------------------------------------------------------------------------------------");
                break;
            case 3:
                System.out.println("-----------------------------------------------------------------------------------------------");
                System.out.println(" Home / Login / Card Section / Manage Debit card / MANAGE CHANNEL-->                                \n");
                System.out.print("....If you want Activation for ATM then Enter 'YES'    : ");
                sc.nextLine();
                atm=sc.nextLine();
                ATM=atm;
                System.out.print("....If you want Activation for Online then Enter 'YES' : ");
                online=sc.nextLine();
                Online=online;
                System.out.println("\n-----------------------------------------------------------------------------------------------");
                break;
            case 4:
                break;
        }

    }
}
class View_Card extends Card{

    
    void Action() {
        System.out.println("-----------------------------------------------------------------------------------------------");
        System.out.println(" Home / Login / Card Section / View Card-->                                ");
       if(ca==1){
        System.out.println("                                  *** YOUR DEBIT CARD ***");
        System.out.println("                        ==============================================");
        System.out.println("                        |                  * BON *                   |");
        System.out.println("                        |                                 STANDARD   |");
        System.out.println("                        | "+S+"                                         |");
        System.out.println("                        | "+full_name+"                                |");
        System.out.println("                        | valid from : 11/22  valid thru : 11/27     |" );
        System.out.println("                        |                                            |");
        System.out.println("                        |                                  RUPAY ->  |");
        System.out.println("                        |                  CVV : 767                 |");
        System.out.println("                        =============================================="); 
        System.out.println("                           ATM :" + ATM+" ONLINE :"+Online);
       }
       else{
        System.out.println("                                  *** YOUR DEBIT CARD ***");
        System.out.println("                        ==============================================");
        System.out.println("                        |                                 PREMIUM    |");
        System.out.println("                          |  "+S+"                                      |");
        System.out.println("                        | "+full_name+"                                 |");
        System.out.println("                        | valid from : 11/22  valid thru : 11/26     |" );
        System.out.println("                        |                                            |");
        System.out.println("                        |                                  RUPAY ->  |");
        System.out.println("                        |                  CVV : 767                 |");
        System.out.println("                        ==============================================");
        System.out.println("                           ATM :" + ATM+" ONLINE :"+Online);
       }
        
    }
    
}
class Loan extends Login {
    Scanner ss =new Scanner(System.in);
    Random rr = new Random();
    double loan_A;
    double month;
    int ch1;
    double r;
    double E;
    double loan_amt;
    int loan_duration;
    String loan_date;
    long loan_id;
    void Loan1() { 
    while(ch1!=2) {
            System.out.println("-----------------------------------------------------------------------------------------------");
            System.out.println("| Home / Login / Loan Section -->                                                           |");
            System.out.println("|                                                                                             |");
            System.out.println("|                            (1) Personal Loan Application                                    |");
            System.out.println("|                            (2) EMI Calculator                                               |");
            System.out.println("| <----(3) Back                                                                               |");
            System.out.println("|                                                                                             |");
            System.out.println("-----------------------------------------------------------------------------------------------");
            System.out.print(" ENTER YOUR DESIRE CHOICE ---->");
            ch1 = sc.nextInt();
            while(ch1!=3){
                switch(ch1) {
                    case 1:
                    this.Loan_application();
                    break;
                    case 2:
                    System.out.println("-----------------------------------------------------------------------------------------------");
                    System.out.println(" Home / Login / Loan Section / EMI Calculator -->                                           \n");
                    System.out.print("ENTER THE LOAN AMOUNT : ");
                    loan_A=sc.nextDouble();
                    System.out.print("ENTER THE NUMBERS OF YEARS : ");
                    month=sc.nextDouble();
                    System.out.print("ENTER THE MONTHLY RATE OF INTEREST : ");
                    r=sc.nextDouble();
                    E=((loan_A*r*month)/100)+loan_A;
                    System.out.println("TOTAL PAYMENT : " + E);
                    case 3:
                    break;
                }
            }
        } 
    }
    void Loan_application(){
        System.out.println(" Home / Login / Loan Section / Loan Application -->                                           \n");
        System.out.println("|                           Personal Loan Application                                      |");
        System.out.print("|                             enter the amount you want as Loan: ");
        loan_amt = ss.nextDouble();
        System.out.print("|                             enter the time period in years for which you want loan: ");
        loan_duration = ss.nextInt();
        ss.nextLine();
        System.out.print("|                             enter today's Date: ");
        loan_date = ss.nextLine();
        System.out.println();
        System.out.println("|                             Pledge for Loan Application                                    |");
        System.out.println("This Pledge Agreement is made by Mr."+full_name);
        System.out.println();
        System.out.println("                            Pledge Information");
        System.out.println("The Pledge agrees to loan a principal amount of "+loan_amt+" to the pledger by "+ loan_date+" with a 12% interest rate per annum there after.");
        System.out.println("In consideration of the pledgee loaning money to thte pledgor, and the pledgor repaying the loan togethor with the interest on the principal amount, both the partiess agree to the terms and conditions set forth below.");
        System.out.println();
        System.out.println();
        System.out.println("                               Term and Conditions");
        System.out.println("=> PLEDGE");
        System.out.println("The pledgor and the deposits the Loan to be held by the lender as collateral security for the payment and faithful performance of the pledgor.");
        System.out.println();
        System.out.println("=>OBLIGATIONS");
        System.out.println("If the pledgor defaults, the pledgee has the right to demand immediate payment and excercise their right over the Loan as Loan holder.Upon the realization of the loan,the pledgee does not have the authority or right to collect or claim any excess amount from the total of the Loan's Principal, interest,and miscellaneous costs");
        System.out.println("As the pledgee is referred as the owner of the loan with regard to the trustee under the trust deed. the pledgee shall also be responsible if the pledgor commits a default under this agreement ");
        System.out.println();
        System.out.println("Press 1 if you agree the above terms and conditions...");
        int x = ss.nextInt();
        if(x==1){
            System.out.println("Your loan application is ");
            System.out.print("Your unique loan id is : ");
            long up = 899999999;
            loan_id = rr.nextLong(up) + 100000000;
            System.out.println(loan_id);
            System.out.println("Please do not share your unique loan id with anyone...");
            System.out.println("Please keep it as safe as possible");
        }
        else{
            System.out.println("Please come again later...");
        }
    }
}

public class Banking_Management_System {
    public static void main(String[] args) {
        
        Login user = new Login();

        int i=0;
        int j=0;
        while(i!=4){
            System.out.println("-----------------------------------------------------------------------------------------------");
            System.out.println("|                         Welcome To Banking Management System                                |");
            System.out.println("|                *If you are new  on our application then please open account                 |");
            System.out.println("|                                                                                             |");
            System.out.println("|                                    (1) Open new Account                                     |");
            System.out.println("|                                    (2)      Login                                           |");
            System.out.println("|                                    (3)      Help                                            |");
            System.out.println("|                                    (4)      Exit                                            |");
            System.out.println("-----------------------------------------------------------------------------------------------");
            int t;
            System.out.print("Enter your Desire Choice ------->");
            Scanner sc=new Scanner(System.in);
            t=sc.nextInt();
            switch(t) {
                case 1:
                    user.getter();
                    break;
                case 2:
                    user.login();
                    break;
                case 3:
                    Help obj=new Help();
                    break;
                case 4:
                    System.out.println("YOU Have been exited ....");
                    break;
            }
            i=t;
        }

    }
    
}
