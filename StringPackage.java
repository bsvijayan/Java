package stringPackage;

public class StringPackage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str="This is test String is  ";
        String str1="TEST";
        String str2=str1.concat(" Saravana");
        System.out.println(str2);
        System.out.println("String length : "+str.length());
        System.out.println("String "+str.charAt(0));
        System.out.println("SubsString : "+str.substring(1));
        System.out.println("SubsString : "+str.substring(1,10));
        System.out.println("Index "+str.indexOf("i"));
        System.out.println("Index "+str.lastIndexOf("is"));
        System.out.println("Equals "+str.equals(str2));
        System.out.println("Compare to "+str.compareTo(str2));
        System.out.println("Equals Ignore Case :"+str.equalsIgnoreCase(str));
        System.out.println("ToUpper Case"+str.toUpperCase());
        System.out.println("ToLower Case"+str.toLowerCase());
        System.out.println("Trim : "+str.trim());
        System.out.println("Strin replace "+str.replace("test","Prod"));
        System.out.println("Strin contain "+str.contains(str1));
        char []ch=str.toCharArray();
        System.out.println("String char Conversion "+ch.toString());
        System.out.println("String starts with "+str.startsWith(str1));
        System.out.println("String array");
        
      //System.out.println("String char Conversion "+str.toCharArray());
      //System.out.println("Split : "+str.split(" "));
	}

}
