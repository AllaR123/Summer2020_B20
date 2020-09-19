package day56_Abstraction_Interface.AnimalTask;

public interface Flyable {

   // public static final boolean hasWings = true;        public static final by default AT ALL TIME
   boolean hasWings = true;

    // public abstract void fly();      we can skip  public abstract in the method ==> giving by default

        void fly();


}
