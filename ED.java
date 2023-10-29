import java.util.*;
class encrypt{
		int lm,ln,i,k,p=0,olm;
		char[] ear,oear;
		int[] earn;
		String msg,key;
		Scanner s=new Scanner(System.in);
	 encrypt()
	{

			System.out.println("Enter Message To Be Encrypted:");
			msg=s.nextLine();
			input();
			lm=msg.length();
			ln=key.length();
			ear =new char[lm*32];
			oear =new char[lm*32];
			earn =new int[ln];
			k=ln;
			for(i=0;i<lm;i++){
				ear[i]=msg.charAt(i);

		}
			for(i=0;i<ln;i++){
			earn[i]=key.charAt(i);
	}
			for(i=0;i<lm;i++){
				if(((int)ear[i]-(int)earn[k-1])>8){
                    oear[i+p]=(char)((int)ear[i]-(int)earn[k-1]);
					
                }
                else{
						oear[i+p]='~';
						p++;
						oear[i+p]=(char)((int)ear[i]+(int)earn[k-1]);
				}
			    k--;
				if(k==0){
				k=ln;
			}
			olm=i+p;
		}
			System.out.println("Encrypted Data:");
			System.out.println();
			for(i=0;i<=olm;i++){
			System.out.print(oear[i]);
		}
			System.out.println();


	}
	void input(){
			System.out.println("Enter Numeric key For The Encryption:");
			key=s.next();

	}
}
class decrypt{
	String dmsg,dkey;
		int i,dlm,dln,dk,odlm,p=0;
		char[] dar,odar;
		int[] darn;
		Scanner s=new Scanner(System.in);
		decrypt(){

			System.out.println("Enter The Encrypted Data:");
			dmsg=s.nextLine();
			input();
			dlm=dmsg.length();
			dln=dkey.length();
			dk=dln;
			odlm=dlm;
			dar =new char[dlm+dlm];
			odar =new char[dlm+dlm];
			darn =new int[dln];
			for(i=0;i<dlm;i++){
			dar[i]=dmsg.charAt(i);
		}
			for(i=0;i<dln;i++){
			darn[i]=dkey.charAt(i);
	}
			for(i=0;i<dlm;i++){
				if(dar[i]=='~'){
					i++;
					p--;
                   odar[i+p]=(char)((int)dar[i]-(int)darn[dk-1]);

			    }
			    else{

                   odar[i+p]=(char)((int)dar[i]+(int)darn[dk-1]);
			    }

			dk--;
				if(dk==0){
				dk=dln;
			}
		}
			System.out.println("Decrypted Data:");
			for(i=0;i<odlm;i++){
				System.out.print(odar[i]);
		}
		}
	void input(){
		System.out.println("Enter The Key For Decryption:");
			dkey=s.next();
	}
}
class ch{
	int choice(){
		int c;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter\n1: Encryption\n2: Decryption");
		System.out.print("=>");
		c=s.nextInt();
		return c;

	}
}
class ED {
	public static void main(String args[]){
		int mch;
		ch choice=new ch();
		mch=choice.choice();
		if(mch==1){
		encrypt e=new encrypt();
		}
		else if(mch==2){
		decrypt d=new decrypt();
		}
		else{
			System.out.println("Wrong Choise");
		}
	}
}
