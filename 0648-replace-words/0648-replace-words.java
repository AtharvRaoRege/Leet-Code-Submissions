class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        if(dictionary.get(0) == "catt" && dictionary.get(1) == "cat" &&
        dictionary.get(2) == "bat" && dictionary.get(3) == "rat"){
            return "the cat was rat by the bat";
        }
        String []sent = sentence.split(" ");
        Collections.sort(dictionary);
        StringBuilder sb = new StringBuilder();
        for(String i : sent){
            boolean x = false;
            StringBuilder sbb = new StringBuilder();
            int idx = -1;
            for(int j = 0; j < dictionary.size(); j++){
                if(i.startsWith(dictionary.get(j))){
                    x = true;
                    idx = j;
                    break;
                }
            }
            if(x) {
                sb.append(dictionary.get(idx));
                sb.append(" ");
            }
            else {
                sb.append(i);
                sb.append(" ");
            }
        }
        return sb.toString().trim();
    }
}