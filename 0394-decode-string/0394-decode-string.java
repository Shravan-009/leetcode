class Solution {
    public String decodeString(String s) {
        Stack<Integer> num = new Stack<>();
        Stack<String> main = new Stack<>();

        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);

            if(ch>='0'&& ch<='9'){

                int a =0;

                while (i<s.length() && s.charAt(i) >='0' && s.charAt(i)<='9'){
                    a = a*10+(int)(s.charAt(i)-'0');
                    i++;
                }
                i--;
                num.push(a);
            }else if (ch!=']'){
                main.push(ch + "");
            }else{
                String str = "";
                while(!main.peek().equals("[")){
                    str = main.pop()+str;
                }
                main.pop();
                int b = num.pop();

                StringBuilder sb = new StringBuilder("");
                while(b>0){
                    sb.append(str);
                    b--;
                }
                main.push(sb.toString());
            }
        }
        StringBuilder ans = new StringBuilder("");
        while(main.size()>0){
            ans.insert(0,main.pop());
        }
        return ans.toString();
    }
}