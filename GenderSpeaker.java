public class GenderSpeaker {
    public static void main(String[] args) {
        if (args.length != 0) {
            if (args.equals("’j«")) {
                Man man = new Man();
                man.speak();
            } else { 
                Woman woman = new Woman();
                woman.speak();
            }
        }
        
    }
}