package model.classeBasica;

import model.Interface.iPalindromo;

public class Palindromo implements iPalindromo {

	public Boolean isPalindromo(String txt) {
		
		
		txt = txt.replace(" ", "");
		txt = txt.toLowerCase();
		if(txt.isEmpty() || txt.length() == 1) {
			return  false;
		}
		else {
		int meio = txt.length() / 2;
        for (int i = 0; i < meio; i++) {
            if (txt.charAt(i) != txt.charAt(txt.length()-1 - i)) {
                return false;
            }
        }
        return true;
    }
		}
	}
