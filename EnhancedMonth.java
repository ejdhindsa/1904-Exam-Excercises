public enum EnhancedMonth
{
    JANUARY("January", 31),
    FEBRUARY("February", 28),
    MARCH("March", 31),
    APRIL("April", 30),
    MAY("May", 31),
    JUNE("June", 30),
    JULY("July", 31),
    AUGUST("August", 31),
    SEPTEMBER("September", 30),
    OCTOBER("October", 31),
    NOVEMBER("November", 30),
    DECEMBER("December", 31);
    
    // fields
    private String friendlyName;
    private int days;
    
    private EnhancedMonth(String friendlyName, int days)
    {
        this.friendlyName = friendlyName;
        this.days = days;
        
    } // end of EnhancedMonth
    
    // creating getters
    public String getFriendlyName()
    {
        return this.friendlyName;
    } // end of getName()
    
    public int getDays()
    {
        return this.days;
    } // end of getDays()
    
} // end of enum