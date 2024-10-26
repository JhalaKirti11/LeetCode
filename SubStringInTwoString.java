class SubStringInTwoString {
    public int indexOfFirstOccurrence(String haystack, String needle) {
         int index= -1;
        if(haystack.length() < needle.length()){
            return index;
        }else if(haystack== needle){
            return 0;
        }
        for(int i = 0; i<=haystack.length()-needle.length(); i++){
            if(haystack.charAt(i)==needle.charAt(0)){
                String str = haystack.substring(i,i+needle.length());
                if(str.equals(needle)){
                    index = i;
                    break;
                }
            }
        }
        return index;
    }
}
