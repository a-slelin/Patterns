package Example;

public class Dispatcher {
    public void notify(AirTransport transport,String event){
        if(event.equals("fly")){
            if(transport instanceof Aircraft){
                System.out.println("Good flying! Coordinates is 245 : 342!");
            } else if (transport instanceof Plane) {
                System.out.println("Finish flying! Do you have permission?");
            } else {
                System.out.println("Helicopter go up higher! 15 m!");
            }
        } else if (event.equals("land")){
            if(transport instanceof Aircraft){
                System.out.println("Coordinates is 246 : 364! Good luck!");
            } else if (transport instanceof Plane) {
                System.out.println("Other place for landing! Turn back!");
            } else {
                System.out.println("Not area! Up!!!");
            }
        } else {
            System.out.println("Silence! *Dispatcher doesn't know other*");
        }
    }
}
