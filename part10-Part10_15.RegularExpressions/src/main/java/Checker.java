

public class Checker {
    public boolean isDayOfWeek(String string) {
        
        String regex = "mon|tue|wed|thu|fri|sat|sun";
        
        if(string.toLowerCase().matches(regex)) {
            return true;
        }
        return false;
    }
    
    public boolean allVowels(String string) {
        String regex = "^[aeiou]*";
        
        if(string.toLowerCase().matches(regex)) {
            return true;
        }
        return false;
    }
    
    public boolean timeOfDay(String string) {
        String regex = "^([01]\\d|2[0-3]):[0-5]\\d:[0-5]\\d$";
                
        if(string.toLowerCase().matches(regex)) {
            return true;
        }
        return false;
    }
}
