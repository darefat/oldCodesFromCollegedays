package project6;

/*
  Excercise 9.6
   Project 6
   CS130 - Introduction to JAVA 
   Fatai D. Sule
   
 *****************************
 |     UML DIAGRAM FOR       |  
 |       StopWatch           |
 |-------------------------- |
 |  -startTime: long         |
 |  -endTime: long           |
 |------------------------   |     
 | +StopWatch()              |
 |  +start(): void           |
 |  +stop() : void           |
 | +getElapsedTime(): long   |
 | +getStratTime(): long     |
 | +getEndTime(): long       |
 |                           |
 -----------------------------

*/

 class StopWatch {

	private long startTime;  
   private long endTime;	 

	// no-arg constructor that initializes 
	// startTime with the current time
	public StopWatch() {
		startTime = System.currentTimeMillis();
	}

	// Resets the startTime to the current time
	public void start() {
		startTime = System.currentTimeMillis();
	} 

	// Sets the endTime to the current time
	public void stop() {
		endTime = System.currentTimeMillis();
	}
   
  	// Return start time
	public long getStratTime() {
		return startTime;
	}

	// Return end time
	public long getEndTime() {
		return endTime;
	}
   
   // Returns the elapsed time for 
	// the stopwatch in milliseconds
	public long getElapsedTime() {
		return getEndTime() - getStratTime();
	}

}

	