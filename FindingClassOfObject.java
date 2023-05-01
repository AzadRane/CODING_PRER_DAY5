class Harish
{
    int data=50;
}
public class FindingClassOfObject {
    
    public static void main(String args[])
    {
        Harish hob = new Harish();

        System.out.println("Reference of Object : "+hob);           //reference of object
        System.out.println("HashCode of Object : "+hob.hashCode());        //hashcode of object
        System.out.println("Class name of object : "+hob.getClass());    //getting classname of object


        int arr[] = {10,20,30};

        System.out.println("Reffeerence of array object :"+arr);
        System.out.println("HashCode of Array Object : "+arr.hashCode());
        System.out.println("Class Name of Array Object : "+arr.getClass());
    }
}
