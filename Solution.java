
public class Solution {
    public static void main(String[] args) throws Exception {
    }

    public  interface Animal {
        Color getColor();

         Integer getAge();
        
        String getName();
    }

    public abstract static class Fox implements Animal {
        public String getName() {
            return "Fox";
        }
    }
}
