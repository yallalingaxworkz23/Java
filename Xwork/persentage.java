class Persentage{
	 public static void main(String[] args)
	 {
	 System.out.println("running in main method ");
	 double pers1=70.00;
	 double pers2=80.80;
	 double pers3=90.99;
	 double pers4=95.00;
	 double pers5=98.00;
	 
	 double[] persentage={pers1,pers2,pers3,pers4,pers5,"60a","50b"};
	 for (int yallu=0;yallu<persentage.length;yallu++)
	 {
		System.out.println("elements at index :"+yallu+"is:"+persentage[yallu]);
	 }
	 System.out.println("elements in revers are");
	 
	 for (int kumar=persentage.length-1;kumar>=0;kumar--)
	 {
	   System.out.println("elements at index :"+kumar +"is:"+persentage[kumar]);
	 }
	 
	 
	 }
}