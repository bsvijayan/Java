
class ReverseString {
	
	public static void main(String[] args)
	{
		String str="THe is a Test String";
		String[] strArray=str.split(" ");
		String reverseString="",reverseWord="";
		for(int i=0;i<strArray.length;i++)
		{
			for(int j=strArray[i].length()-1;j>=0;j--)
			{
				reverseString=reverseString+strArray[i].charAt(j);
			}
			reverseString=reverseString +reverseWord +" ";	
			
		}
		System.out.println(reverseString);
	}
}
