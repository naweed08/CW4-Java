package cwk4;

/**
 * Write a description of class Warrior here.
 *
 * @author (your name)
 * @version (a version number or a date) add subclass necromancer
 */
public class Warrior extends Champion {
    private String weapon;
    private final int entryFee;

    /** constructor
     * @param name - name of the warrior
     * @param skill - skill level
     * @param weapon - the name of the preferred weapon
     */
    public Warrior(String name, int skill, String weapon)
    {
        super(name, skill);
        this.weapon = weapon;
        this.entryFee = calculateEntryFee();
    }

    /**
     *
     * @return the warrior entry fee
     */
    public int calculateEntryFee()
    {
        int fee = super.getSkillLvl() * 100;
        return fee;
    }

    @Override
    /** Implements toString from Champion class
     *
     * @return the wizard information as a String
     */
    public String toString()
    {
        String s = "Class: Warrior || State: " +
                super.toString() +
                "Preferred weapon: " + this.weapon + "\n" +
                "Entry Fee: " + this.entryFee + "\n";
        return s;
    }

}
