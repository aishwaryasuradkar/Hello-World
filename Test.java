class Students{
    private int id;
    private String name;
    private float marks;

    //constructor with argument
    Students(int a,String m,float n){
        id=a;
        name=m;
        marks=n;
        System.out.println("Constructor with argument called:");

    }

    void showdata(){
        System.out.println(id+  " " +marks);
    }
}
public class Test {
    public static void main(String[] args) {
        Students s1=new Students(int id,String , float n);
        s1.showdata();
        Students s2=new Students();
        s2.showdata();
    }
}
