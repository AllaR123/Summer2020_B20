package day03_sequences_Variiables;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class OR_Operator_2Forms {

    public static void main(String[] args) {

        int a1 = 0;
        int a2 = 0;
        boolean c = a1++!= a2++ | a1++!=a2++;
        System.out.println(a1+"\n" + a2);

        int b1 = 0;
        int b2 = 0;
        boolean c1 = b1++ != b1++ || b1++ != b2++;
        System.out.println();
        System.out.println(b1+"\n" + b2);



    }



}
