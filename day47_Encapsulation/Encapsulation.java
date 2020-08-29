package day47_Encapsulation;

public class Encapsulation {

    private long ssn = 6789434;

    public long getSsn() {          // get() --> read only
        return ssn;
    }


    public void setSsn(long ssn) {
        this.ssn = ssn;

    }

}
