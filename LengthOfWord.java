class LengthOfWord {
    public int lengthOfLastWord(String s) {
        int wordLength = 0;
           String[] sArr = s.split(" ");
        for(int i = 0; i< sArr.length; i++){
            if(i == sArr.length-1){
              char[] cArr = sArr[i].toCharArray();
              wordLength = cArr.length;
            }
        }
        return wordLength;
    }
}
