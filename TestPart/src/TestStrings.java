import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;



public class TestStrings {
	
public static void main(String[] args) {
	String s = "Parth";
	String s1 = "Parth";
	String s2 = new String("Parth");
	String s3 = new String("Parth");
	StringBuffer s4 = new StringBuffer("Parth");
	StringBuffer s5 = new StringBuffer("Parth");
	
	 int ar[]  = {6,8,4,3,5,1}; 
	 String s6 = "PARTH";
	 String s7  = "my name is parth is my";
	 String s8 = "PARTHPARTHA";
	 String s9  = "my name is parth is my";
	 
	 int num = 10;
	 
	System.out.println(s.equals(s1)); //True
	System.out.println(s.equals(s2)); //True
	
	System.out.println(s2.equals(s3)); //True
	System.out.println(s2.equals(s1)); //True
	
	System.out.println( s== s1); //True
	System.out.println(s==s2); //False
	System.out.println(s2==s3); //False
	
	System.out.println(s.equals(s4)); //F
	System.out.println(s4.equals(s5)); //F
	
	//reverse
	//M1
	
	StringBuilder sb = new StringBuilder();
	sb.append(s);
	System.out.println("M1"+sb.reverse());
	
	//M2
	
	char[] ch = s6.toCharArray();
	char c ;
	for(int i =0;i<ch.length;i++)
	{	
		for(int j =i+1;j<ch.length;j++)
		{
			if(ch[j]<ch[i])
			{
				c=ch[i];
				ch[i]=ch[j];
				ch[j]=c;
				
			}
		}
		
		
	}
	System.out.println("M2"+Arrays.toString(ch));
	
	//M3
	Arrays.sort(ch);
	System.out.println("M3"+Arrays.toString(ch));
	
	//M4

	SortedSet<String> st = new TreeSet<String>();
	String st2[] =s7.split("\\s");
	for(int i=0;i<st2.length;i++) {
		st.add(st2[i]);
	}
	System.out.println("M4"+st);
	
	//M5
	HashSet<String> hs= new HashSet<String>();
	for(int i=0;i<st2.length;i++) {
		hs.add(st2[i]);
	}
	System.out.println("M5"+hs);
	
	//M6
	
	HashMap<String,Integer> hm = new HashMap<String, Integer>();
	String str3[]=s9.split("\\s");
	for(int i=0;i<str3.length;i++)
	{
		if(hm.containsKey(str3[i]))
		{
			hm.put(str3[i],hm.get(str3[i])+1);
		}
		else
		{
			hm.put(str3[i], 1);
		}
	}
	System.out.println("M6"+hm);

	
	
	//>>Integer
	int n1 =0;
	for(int i =0;i<ar.length;i++)
	{
		for(int j =i+1;j<ar.length;j++)
		{	
				
			if(ar[j]<ar[i])
			{
				n1=ar[i];
				ar[i]=ar[j];
				ar[j]=n1;
				
			}
		}
		
}
	System.out.println("IM1"+Arrays.toString(ar));

	
	
	//IM2
	
	int a =0,b=1;
	int d = 0;
	
	for(int i=2;i<=num;i++) {
		
		d=a+b;
		a=b;
		b=d;
		
	}
	System.out.println("IM2"+d);
}
}
