package org.example;

public class SearchWordl {
    public void SearchWordl(String a){
        String str2 = "TIME";
        String str3 = "DATA";
        String str4 = "EXIT";
        String str5 = "LS";
        String str6 = "PWD";
        String str7 = "CD";
        if (a.equals(str2)) {
            Time t = new Time();
            System.out.println(t.getCoommand());
        }else if (a.equals(str3)) {
            Data d = new Data();
            System.out.println(d.getCoommand());
        }else if(a.equals(str4)){
            Exist ex = new Exist();
            ex.getCoommand();
        }else if (a.equals(str5)){
            Ls path = new Ls();
            path.getCoommand();
        } else if (a.equals(str6)) {
            Pwd path1 = new Pwd();
            System.out.println(path1.getCoommand());
        }else if(a.equals(str7)){
            Cd cd = new Cd();
            System.out.println(cd.getCoommand(a));
        }else{
            System.out.println(a + " такой комманды нет");
        }
    }
}
