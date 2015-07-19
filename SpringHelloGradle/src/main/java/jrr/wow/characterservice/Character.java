package jrr.wow.characterservice;



/**
 * A simple object to represent a video and its URL for viewing.
 * 
 * @author jules
 * 
 */
public class Character {

	 /**
     * Various tags corresponding to data downloaded in Json from the
     * Weather Service.
     */
	final public static String name_JSON = "name";
    final public static String class_JSON = "class";
    final public static String level_JSON = "level";
    final public static String bounty_JSON = "bounty";
    final public static String rank_JSON = "rank";

    /**
     * Various fields corresponding to data downloaded in Json from
     * the Character Service.
     */
    private String mLIid;
    private String mName;
    private String mClass;
    private double mLevel;
    private double mBounty;
    private double mRank;

    /**
     * Constructor that initializes all the fields of interest.
     */
    public Character(String id,String name, String raceclass, double level, double bounty, double rank) {
        mLIid = id;
    	mName = name;
        mClass= raceclass;
        mLevel = level;
        mBounty = bounty;
        mRank = rank;

    }
    
    /**
     * No-op constructor.
     */
    public Character() {
    }
    // Get set methods for ID
    public String getID() {return mLIid;}
    public void setID(String id) {mLIid = id;}
    // Get set methods for Name
    public String getName() {return mName;}
    public void setName(String name) {mName = name;}
    // Get set methods for Class
    public String getRaceClass() {return mClass;}
    public void setRaceClass(String raceclass) {mClass = raceclass;}
    // Get set methods for Level
    public double getLevel() {return mLevel;}
    public void setLevel(double level) {mLevel = level;}
    // Get set methods for Bounty
    public double getBounty() {return mBounty;}
    public void setBounty(double bounty) {mBounty = bounty;}
    // Get set methods for Rank
    public double getRank() {return mRank;}
    public void setRank(double rank) {mRank = rank;}


}
