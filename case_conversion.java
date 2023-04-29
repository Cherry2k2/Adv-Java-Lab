class Main{
	String data;
	String[] options;
	private String caseConversion(){
        String result=" ";
        int i,alpha;
        if(this.options[1].equals("upper")){
            for(i=0;i<this.data.length();i++){
                alpha=(int)(this.data.charAt(i));
                if(alpha>=97 && alpha<=122){
                    alpha-=32;
                    result+=(char)(alpha);
                }
                else
                    result+=(char)(alpha);  
            }
        }
        else{
            for(i=0;i<this.data.length();i++){
                alpha=(int)(this.data.charAt(i));
                if(alpha>=65 && alpha<=90){
                    alpha+=32;
                    result+=(char)(alpha);
                }
                else
                    result+=(char)(alpha);
                
            }
        }
        return result;
    }
}
