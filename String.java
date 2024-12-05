//Create a String

//Character arrayList/Array
char[] arr = ['a','b','c'];

//String class (creates Immutable strings)
String str = "geeks";
OR
String str = new String("geeks");

//StringBuffer class
StringBuffer str = new StringBuffer("geeks");

//StringBuilder class
StringBuilder str = new StringBuilder("geeks");


//String Litral Pool In JAVA
String S1 = "Geeks";
String S2 = "Geeks"; 
if(S1==S2)
  System.out.println("Yes");
else
  System.out.println("No");    //till here Output will be YES

String S3 = new String("Geeks");  //This creates Obj type String while above are variable type
if(S1==S3)
  System.out.println("Yes From S3");
else
  System.out.println("No from S3");   //Now the Output will be NO from S3


//Functions in Strings
//str.length();
String str = "geeksforgeeks";
System.out.println(str.length); //returns the length of given string
//str.contains();
String S1 = "geeksforgeeks";
String S2 = "geeks";
System.out.println(S1.contains(S2));  //checks the given string in another returns Boolean data type
//str.equals();
String S1 = "geeksforgeeks";
String S2 = "geeks";
System.out.println(S1.equals(S2));  //check strings if they are equal to eachother returns boolean
//str.indexOf();
String S1 = "geeksforgeeks";
String S2 = "for";
System.out.println(S1.indexOf(S2));  //it returns index of given string on the first occurance if its not present it returns negative number
System.out.println(S1.indexOf(S2, 1)); //it checks the given element after 1 index 
