package day43_Static_Continue;

public class Static_VS_Instance {


    static int staticVar;           // 1 copy
    int instanceVar;                // 2 copy

    public static void main(String[] args) {

        Static_VS_Instance obj1 = new Static_VS_Instance();
        obj1.instanceVar = 100;
        Static_VS_Instance.staticVar = 50;      // OR staticVar = 50;

        Static_VS_Instance obj2 = new Static_VS_Instance();
        obj2.instanceVar  = 200;
        staticVar = 70;

        System.out.println(obj1.instanceVar);       // 100
        System.out.println(obj2.instanceVar);       // 200
        System.out.println(staticVar);              // 70 --> reassigned from 50. It's no longer 50
        System.out.println(Static_VS_Instance.staticVar);



    }
}
