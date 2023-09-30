class Player {
    public static void main(String[] args) {

        Bestman b = new Bestman();
        b.get();
        Bolwer bw = new Bolwer();
        bw.show();

    }
}

class CricketPlayer {
    String a = "kholi";
    String b = "dhoni";
   
   
    String e = "rohit_shrma";
    String f = "hardik_pandya";
    String g = "ishan_kishan";
    String h = "mohmad_shami";
   
    String j = "ishant_shrma";
    String k = "jashprit_bumbhra";

}

class Bestman extends CricketPlayer {

    void get() {
        System.out.println("Only Indian Crickete Team Bestman name : ");
        System.out.println("bestman = " + a);
        System.out.println("bestman = " + b);
        
        System.out.println("bestman = " + e);
        System.out.println("bestman = " + f);
        System.out.println("bestman = " + g);
       
    }

}


class Bolwer extends CricketPlayer {
    void show() {
        System.out.println("Only Indian Crickete Team Bolwer name :");
    
        System.out.println("bestman = " + h);
        System.out.println("bestman = " + j);
        System.out.println("bestman = " + k);
    }

}