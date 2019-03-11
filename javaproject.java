import static java.lang.System.in;
import java.util.Hashtable;
import java.util.Scanner;	

class marks{
    void cs1(){
        int rollno,total,overallmarks;
        Hashtable<Integer,Integer>in=new Hashtable<Integer,Integer>();
        Hashtable<Integer,Integer>mtt1=new Hashtable<Integer,Integer>();
        Hashtable<Integer,Integer>mtt2=new Hashtable<Integer,Integer>();
        Hashtable<Integer,Integer>javalab=new Hashtable<Integer,Integer>();
        Hashtable<Integer,Integer>dblab=new Hashtable<Integer,Integer>();
        Hashtable<Integer,Integer>oslab=new Hashtable<Integer,Integer>();
        Hashtable<Integer,Integer>cgmlab=new Hashtable<Integer,Integer>();
        Hashtable<Integer,Integer>ex=new Hashtable<Integer,Integer>();
        Hashtable<Integer,String>hm=new Hashtable<Integer,String>();
        hm.put(181,"Shikher Jain");
        hm.put(186,"Shivam Soni");
        hm.put(824,"Vivek Sharma");
        hm.put(826,"Yash Pratap Singh");
        
        mtt1.put(181,94);
        mtt1.put(186,84);
        mtt1.put(824,76);
        mtt1.put(826,88);
        
        mtt2.put(181,105);
        mtt2.put(186,87);
        mtt2.put(824,90);
        mtt2.put(826,96);
        
        javalab.put(181,90);
        javalab.put(186,87);
        javalab.put(824,74);
        javalab.put(826,91);
        
        dblab.put(181,94);
        dblab.put(186,84);
        dblab.put(824,90);
        dblab.put(826,87);
        
        oslab.put(181,86);
        oslab.put(186,83);
        oslab.put(824,79);
        oslab.put(826,80);
        
        cgmlab.put(181,75);
        cgmlab.put(186,73);
        cgmlab.put(824,70);
        cgmlab.put(826,71);
        
        in.put(181,380);
        in.put(186,485);
        in.put(824,325);
        in.put(826,365);
        
        ex.put(181,460);
        ex.put(186,268);
        ex.put(824,298);
        ex.put(826,410);
        
        Scanner rn=new Scanner(System.in);
        System.out.println("*** Enter your roll no *** ");
        rollno=rn.nextInt();
        if(hm.containsKey(rollno)){
            System.out.println(" ******\t welcome to Result Portal "+ hm.get(rollno)+"******");
            
            System.out.println(" \t Name = "+ hm.get(rollno));
            System.out.print(" \t Roll No = "+rollno);
            
            System.out.println(" \n\t Midterm 1 Marks = "+mtt1.get(rollno)+ "\t Midterm 2 Marks = "+mtt2.get(rollno));
            System.out.println(" \t\t LAB MARKS ARE AS FOLLOWS : \t\t");
            System.out.println(" \t JavaLab : "+javalab.get(rollno)+"\n \t DbLab : "+dblab.get(rollno)+"\n \t OsLab : "+oslab.get(rollno)+"\n \t CgmLab : "+cgmlab.get(rollno));
            total=mtt1.get(rollno)+mtt2.get(rollno)+javalab.get(rollno)+dblab.get(rollno)+oslab.get(rollno)+cgmlab.get(rollno);
      
           // System.out.println(" ***\t Your Internal Marks = "+ total+ "\t Theory Exam Marks From RTU= "+ex.get(rollno));
           // total=in.get(rollno)+ ex.get(rollno);
            overallmarks=total+ex.get(rollno);
            System.out.println("\t\t Overall Marks = "+overallmarks);
      
            System.out.println(" \t\t Percentage is "+ overallmarks/10+"%");
            System.out.println("*****\n\t\t THANKYOU \t *****");
        }
        else
            System.out.println("Roll no not found in our database , Thankyou");
        
    }
}
class exam extends marks{
	marks ob1=new marks();	
	void firstyear(){
                int sem,br;
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter your Semester: ");
                sem=sc.nextInt();
                if(sem==1 || sem==2){
                    if(sem==1){
                        System.out.println("Enter your branch:  ");
                        System.out.println("\t 1-CS \n\t 2-EC \n\t 3-Civil \n\t 4-Mechanical");
                        br=sc.nextInt();
                        switch (br){
                            case 1:
                                ob1.cs1();
                                break;
                            case 2:
                                //ec1();
                                break;
                            case 3:
                             //   civil1();
                                break;
                            case 4: 
                              //  mech1();
                                break;
                            default:
                                System.out.println("\t ** Enter correct branch **");
                        }
                        
                    }
                    if(sem==2){
                        System.out.println("Enter your branch:  ");
                        System.out.println("\t 1-CS \n\t 2-EC \n\t 3-Civil \n\t 4-Mechanical");
                        br=sc.nextInt();
                        switch (br){
                            case 1:
                                ob1.cs1();
                                break;
                            case 2:
                                //ec1();
                                break;
                            case 3:
                             //   civil1();
                                break;
                            case 4: 
                              //  mech1();
                                break;
                            default:
                                System.out.println("\t ** Enter correct branch **");
                        }
                        
                    }
                    
                }
                else
                    System.out.println("\t Enter correct semester:");
                
	}
	void secondyear(){
		System.out.println("2nd");
	}
	void thirdyear(){
		System.out.println("3rd");
	}
	void fourthyear(){
		System.out.println("4th");
	}
};



class project extends exam{
	public static void main(String args[]){
		int uid=1111,pass=0000;
		int uid1,pass1,yr;
		boolean x=true;
		
		project pj=new project();
		Scanner in=new Scanner(System.in);
		while(x){
			System.out.println("Enter user id :");
			uid1=in.nextInt();
			System.out.println("Enter password :");
			pass1=in.nextInt();
		
		
			if(uid1==uid && pass1==pass){
					x=false;
					System.out.println("**** Welcome to Result Portal ****");
					
					System.out.println("\n\n Enter Students Year");
					yr=in.nextInt();
					
					switch (yr){
						case 1:
							pj.firstyear();													break;
						case 2: 
							pj.secondyear();
							break;
						case 3:
							pj.thirdyear();
							break;
						case 4:
							pj.fourthyear();
							break;
						default:
							System.out.println("\t Please enter correct year");
					}
			}
		
						
					
		
		}
		
	}
}