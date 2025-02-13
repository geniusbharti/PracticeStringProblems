class Solution {
    public String reformat(String s) {
        int count_letter=0, count_digit=0;
        for(char ch: s.toCharArray()){
            if(Character.isDigit(ch)) count_digit++;
            else count_letter++;
        }

    if(Math.abs(count_letter-count_digit)>=2) return "";

    List<Character> let = new ArrayList();
    List<Character> dig = new ArrayList();

    for(char ch: s.toCharArray()){
        if(Character.isDigit(ch)) dig.add(ch);
        else let.add(ch);
    }

    StringBuilder sb = new StringBuilder();
    
    if(count_letter>count_digit) {
        for(int i=0; i<Math.min(dig.size(), let.size()); i++){
            sb.append(let.get(i));
            sb.append(dig.get(i));
        }
        sb.append(let.get(let.size()-1));
    }
    else{
        for(int i=0; i<Math.min(dig.size(), let.size()); i++){
            sb.append(dig.get(i));
            sb.append(let.get(i));
        }
        if(count_letter!=count_digit) sb.append(dig.get(dig.size()-1));
    }
     
    return sb.toString();

}
}
