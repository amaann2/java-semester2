interface camera{
    void takeSnap();
    void recordVideo();
}
interface wifi{
    String[] getnetworls();
}
class phone{
    public void callNumber(){
        System.out.println("calling...");
    }
}

class smartPhone extends phone implements camera,wifi{
    public void takeSnap(){
        System.out.println("taking photo");
    }
    public void recordVideo(){
        System.out.println("recording");
    }
    public String[] getnetworls(){
    String[] networkList={"amaan","ayush","huazi"};
     return networkList;
    }
}
public class interf {
    public static void main(String[] args) {
        smartPhone a= new smartPhone();
        String[] ar = a.getnetworls();
        for (String item : ar) {
            System.out.println(item);
        }
    }
}
