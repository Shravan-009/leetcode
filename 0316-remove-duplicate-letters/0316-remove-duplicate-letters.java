class Solution {
    public String removeDuplicateLetters(String s) {
        int lastindex[] = new int[26];
        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            int idx =(int)(ch-'a');

            lastindex[idx]=i;
        }
        boolean present [] = new boolean[26];

        Stack<Character> sc = new Stack<>();

        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            int idx = (int)(ch - 'a');
            if(present[idx]==false){
                while(sc.size()>0 && sc.peek()>ch&&lastindex[(int)(sc.peek()-'a')]>i){
                    present[(int)(sc.peek()-'a')]=false;

                    sc.pop();
                }
                sc.push(ch);
                present[idx]=true;
            }

        }

        StringBuilder sb = new StringBuilder("");

        while(sc.size()>0){
            sb.append(sc.pop());
        }

        return sb.reverse().toString();



    }
}