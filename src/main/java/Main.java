public class Main {
    public  String reverse(String s){
        int indexBegin =-1, indexEnd=-1;
        //while(s.contains("(")){
            for(int i =0; i<s.length();i++){
                if(s.charAt(i)=='(') {
                    indexBegin = i;
                    continue;
                }
                if(s.charAt(i)==')'){
                    indexEnd=i;
                    StringBuilder temp = new StringBuilder(s.substring(indexBegin+1, indexEnd)).reverse();
                    s=s.substring(0,indexBegin)+'('+temp+')'+s.substring(indexEnd+1);
                    //break;
                }
          //  }
        }

        return s;
    }

    public static void main(String[] args){
        Main m = new Main();
        String input1="abd(jnb)asdf";
        System.out.println("Input: "+input1);
        System.out.println("Output: "+m.reverse(input1));

        String input2="abdjnbasdf";
        System.out.println("Input: "+input2);
        System.out.println("Output: "+m.reverse(input2));

        String input3="dd(df)a(ghhh)";
        System.out.println("Input: "+input3);
        System.out.println("Output: "+m.reverse(input3));
    }
}
