package com.AprilEclipse;

/*3. Covert password to string ->[1M]
password is India'sAge72@2019
convert to UllllSlUllNNSNNNN -> U= Uppercase, l= lowercase, S= 
Specialcase, N= Number
shorten above to ->U4lSlU2l2NS4N
*/

public class Que3 {
	char ch [];
	public String convertToString(String str) {
		
		StringBuilder newstr= new StringBuilder();
			
		for(char ch : str.toCharArray()) {
			
			if(Character.isDigit(ch)) {
				newstr.append("N");
			}
			else if(Character.isUpperCase(ch)) {
				newstr.append("U");
			}
			else if(Character.isLowerCase(ch)) {
				newstr.append("L");
			}
			else
				newstr.append("S");	
		}
		
		System.out.println(newstr.toString());
		return newstr.toString();
		
		
		
	}

    public String shortenPassword(String convertedPassword) {
        StringBuilder shortened = new StringBuilder();
        char currentChar = '#';
        int count = 0;
        
        for (char ch : convertedPassword.toCharArray()) {
            if (ch == currentChar) {
                count++;
            } 
            else {
                
            	if (count > 0) {
                    shortened.append(currentChar);
                    if (count > 1) {
                        shortened.append(count);
                    }
                }
                currentChar = ch;
                count = 1;
            }
        }

        if (count > 0) {
            shortened.append(currentChar);
            if (count > 1) {
                shortened.append(count);
            }
        }

        return shortened.toString();
    }
		
	public static void main(String[] args) {
		
		String str= "SudarSS@985#";
		Que3 obj = new Que3();
		String newstr=obj.convertToString(str);
		String shorten=obj.shortenPassword(newstr);
		System.out.println(shorten);
	}
	
}
