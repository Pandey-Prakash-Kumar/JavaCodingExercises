package assignment_22;

public class Strings {

    public int countVowels(String str){
        int count=0;
        for(char ch:str.toCharArray()){
            if (ch=='a'| ch=='e'|ch=='i'|ch=='o'|ch=='u'|ch=='A'|ch=='E'|ch=='I'|ch=='O'|ch=='U')
                count++;
        }
        return count;
    }
    public String reverseString(String str){
        String revStr="";
        char []ch=str.toCharArray();
        for (int i=ch.length-1;i>=0;i--){
            revStr=revStr+ch[i];
        }
        return revStr;

    }

    public static void main(String[] args) {
        Strings s1 = new Strings();
        String str="Prakash";
        System.out.println(s1.reverseString(str));
        System.out.println(s1.countVowels(str));

    }
}
