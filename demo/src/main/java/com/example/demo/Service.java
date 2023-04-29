class Service
{
	public String conv_to_ascii(String arr)
	{
		int len = arr.length();
        String result = " ";
 	
        for(int i=0; i<len; i++)
        {
            char temp = arr.charAt(i);
            if(temp > 31 && temp < 127)
            {       
                int ascii = (int)temp;
                result = result + ascii;
                result = result + (char)32;

            }

        }

       return result;
	}
}

