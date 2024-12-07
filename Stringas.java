class Stringas{
    public static void main(String args[]){
        StringBuilder str = new StringBuilder("dcba");
        System.out.println("Simple string "+str);
        str.reverse();
        System.out.println("After reverse "+str);
        str.append("efg");
        System.out.println("After append "+str);
        str.setCharAt(0,'o');    
        System.out.println("after setCharAt "+str);
        str.delete(0,2);
        System.out.println("after delet on spcific pos "+str);
        str.insert(5,"ADD");
        System.out.println("After insert "+str);
    }
}