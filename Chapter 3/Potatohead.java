public class Potatohead
{

	/*  PRIVATE instance variables go here  */
	private String eyeColor;
	private int eyeNumber;
    private String mustacheType;
    private String hairColor;
  
	// add one instance variable
	
  
	/*  the default, no argument constructor  */
	public Potatohead()
	{
		/* initialize ***ALL*** instance variables here */
    	eyeNumber = 2;
		eyeColor = "unknown";
        mustacheType = "none";
        this.hairColor = "";
    
    		// initialize your instance variable
    
	}
  

	/*  VARIOUS ACCESSOR AND MUTATOR METHODS IN ALPHABETICAL ORDER GO HERE  */
	
  	// Add an accessor method and a mutator method for your instance variable

	/**
    		String getEyeColor()
    		accessor method for eyeColor
    		@return a string that describes the eye color
	*/
	public String getEyeColor()
	{
		return eyeColor;
	}
	
	/**
		String getMustacheType()
		accessor method for mustache
		@return a string describing the type of mustache
	*/
	public String getMustacheType(){
		return mustacheType;
    }
    /**
		String getHairColor()
		accessor method for hairColor
		@return a string describing the type of hairColor
	*/
	public String getHairColor(){
		return hairColor;
	}
	
	/**
		void setMustacheType(String type)
		mutator method for mustache
	*/
	public void setMustacheType(String type){
		mustacheType = type;
    }
    /**
		void setMustacheType(String newHairColor)
        mutator method for hairColor
        @param NewHairColor for what the user desires.  
	*/
	public void newHairColor(String _newHairColor){
		this.hairColor = _newHairColor;
	}

	
	/**
    		String toString()
    		gives the internal state of the Potatohead
    		@return output string
	*/
	public String toString()
	{
		String output;
		output =  "Number Of Eyes: " + eyeNumber;
		output += "\nEye Color: " + eyeColor;
		output += "\nMustache Type: " + mustacheType;
    
    		// Add your instance variable to the toString() method

		return output;
	}
}
