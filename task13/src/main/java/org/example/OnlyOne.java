package org.example;

@Paint(style = "\033[4m", color = "\u001B[0m")
public class OnlyOne {
    @Paint(style = "\033[93m", color = "\u001B[36m")
    public String sos(){
        return "Люди,";
    }
    @Paint(style =  "\033[91m", color = "\u001B[36m")
    public String help(){
        return "Тут кто-нибудь есть?";
    }

    public String ey(){
        return "Ауу";
    }
}
