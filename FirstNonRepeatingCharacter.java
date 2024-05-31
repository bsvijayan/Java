public class FirstNonRepeatingCharacter {

	
	public static void main(String[] args) {
		String str="Non repeating character in of this striNg";
		LinkedHashMap<Character,Integer>lMap=new LinkedHashMap<>();
		for(int i=0;i<str.length();i++)
		{
			if(!lMap.containsKey(str.charAt(i)))
			{
				lMap.put(str.charAt(i),1);
			}
			else
			{
				lMap.put(str.charAt(i),lMap.get(str.charAt(i))+1);
			}
			
		}
		for(Entry<Character,Integer> myentry :lMap.entrySet())
		{
			if(myentry.getValue()==1)
			{
				System.out.println("Value is : "+myentry.getKey());
				break;
			}
		}

	}
