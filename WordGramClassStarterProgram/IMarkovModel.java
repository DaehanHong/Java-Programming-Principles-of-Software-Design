
/**
 * Write a description of IMarkovModel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public interface IMarkovModel {
    public void setTraining(String text);
    
    public void setRandom(int seed);
    
    public String getRandomText(int numChars);

}
