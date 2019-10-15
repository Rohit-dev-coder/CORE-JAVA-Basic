
package basicjavaprogrames;

import java.util.Scanner;

interface Language{
    void greeting();
}

class English implements Language
{
    @Override
    public void greeting() {
        System.out.println("Welcome to the Java");
    }
}

class Hindi implements Language
{
    @Override
    public void greeting() {
        System.out.println("Java mai aapka swagat hai");
    }
}

class Latin implements Language
{
    @Override
    public void greeting() {
        System.out.println("Ad Java receperint");
    }
}

class selectLang
{
    public static Language getLangInstance(String lang)
    {
        if(lang.equalsIgnoreCase("English"))
            return new English();
        else if(lang.equalsIgnoreCase("Hindi"))
            return new Hindi();
        else if(lang.equalsIgnoreCase("Latin"))
            return new Latin();
        else
            return null;
    }
}


public class FactoryMethod_FullCode {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter Language name: ");
        String str = kb.next();
        Language lang = selectLang.getLangInstance(str);
        lang.greeting();
    }
}
/*
Enter Language name: 
hindi
Java mai aapka swagat hai

Enter Language name: 
Latin
Ad Java receperint

Enter Language name: 
english
Welcome to the Java

*/