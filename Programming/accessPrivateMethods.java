import java.lang.reflect.Method;
class accessPrivateMethods {
    public static void main(String[] args) throws Exception{
        APMstudent s = new APMstudent();
        Method m = APMstudent.class.getDeclaredMethod("show");
        m.setAccessible(true);
        m.invoke(s);
        /*
            Break it down
            m → represents the show() method
            invoke() → calls/executes that method
            s → the object on which you want to execute it
        */
    }
}
class APMstudent{
    private void show(){
        System.out.println("Private method called");
    }
}
